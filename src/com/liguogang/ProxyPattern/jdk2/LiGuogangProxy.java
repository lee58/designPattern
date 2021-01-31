package com.liguogang.ProxyPattern.jdk2;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
* @Description: 用来生产源码的工具类
* @Author:      LiGuoGang
* @date:    2021/1/31 11:23
*/
public class LiGuogangProxy {

    public static final String ln = "\r\n";

    public static Object newProxyInstance(LiGuogangClassLoader classLoader, Class<?>[] interfaces,
                                          LiGuogangInvocationHandler h) {
        try{
            // 1.动态生成源码.java文件
            String src = generateSrc(interfaces);
            // 2.java文件输出磁盘
            String filePath = LiGuogangProxy.class.getResource("").getPath();
            File file = new File(filePath + "$Proxy0.java");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(src);
            fileWriter.flush();
            fileWriter.close();
            // 3.把生成的.java文件编译成.class文件
            JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = javaCompiler.getStandardFileManager(null, null, null);
            Iterable<? extends JavaFileObject> iterable = manager.getJavaFileObjects(file);
            JavaCompiler.CompilationTask task = javaCompiler.getTask(null, manager, null, null, null, iterable);
            task.call();
            manager.close();
            // 4.编译生成的.class文件加载到JVM中
            Class<?> proxyClass = classLoader.findClass("$Proxy0");
            Constructor<?> constructor = proxyClass.getConstructor(LiGuogangInvocationHandler.class);
            file.delete();
            // 5.返回字节码重组以后的新的代理对象
            return constructor.newInstance(h);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();
        sb.append(LiGuogangProxy.class.getPackage() + ";" + ln);
        sb.append("import " + interfaces[0].getName() + ";" + ln);
        sb.append("import java.lang.reflect.*;" + ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);
            sb.append("LiGuogangInvocationHandler h;" + ln);
            sb.append("public $Proxy0(LiGuogangInvocationHandler h) { " + ln);
                sb.append("this.h = h;");
            sb.append("}" + ln);
            for (Method m : interfaces[0].getMethods()) {
                Class<?>[] params = m.getParameterTypes();
                StringBuffer paramNames = new StringBuffer();
                StringBuffer paramValues = new StringBuffer();
                StringBuffer paramClasses = new StringBuffer();
                for (int i = 0; i < params.length; i++) {
                    Class clazz = params[i];
                    String type = clazz.getName();
                    String paramName = toLowerFirstCase(clazz.getSimpleName());
                    paramNames.append(type + " " + paramName);
                    paramValues.append(paramName);
                    paramClasses.append(clazz.getName() + ".class");
                    if (i > 0 && i < params.length - 1) {
                        paramNames.append(",");
                        paramClasses.append(",");
                        paramValues.append(",");
                    }
                }
                sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "(" + paramNames.toString() + ") {" + ln);
                sb.append("try{" + ln);
                sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\", new Class[]{" + paramClasses.toString() + "});" + ln);
                sb.append((hasReturnValue(m.getReturnType())) ? "return " : "" + getCaseCode("this.h.invoke(this, m, new Object[]{" + paramValues + "})", m.getReturnType()) + ";" + ln);
                sb.append("}catch(Error _ex) {}");
                sb.append("catch(Throwable e){" + ln);
                sb.append("throw new UndeclaredThrowableException(e);" + ln);
                sb.append("}");
                sb.append(getReturnEmptyCode(m.getReturnType()));
                sb.append("}");
            }
        sb.append("}" + ln);
        return sb.toString();
    }

    private static String getReturnEmptyCode(Class<?> returnClass) {
        if (mappings.containsKey(returnClass)) {
            return "return 0";
        }else if (returnClass == void.class) {
            return "";
        }else {
            return "return null;";
        }
    }

    private static Map<Class, Class> mappings = new HashMap<Class, Class>();
    static {
        mappings.put(int.class, Integer.class);
    }

    private static String getCaseCode(String code, Class<?> returnClass) {
        if (mappings.containsKey(returnClass)) {
            return "((" + mappings.get(returnClass).getName() + ")" + code + ")." + returnClass.getSimpleName() + "Value()";
        }
        return code;
    }


    private static boolean hasReturnValue(Class<?> returnType) {
        return returnType != void.class;
    }

    private static String toLowerFirstCase(String simpleName) {
        char[] chars = simpleName.toCharArray();
        chars[0] += 32;
        return String.valueOf(chars);
    }
}
