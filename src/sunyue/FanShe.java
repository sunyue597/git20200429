package sunyue;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;


public class FanShe {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, IOException, NoSuchFieldException {
        Class<?> aclass1 = Class.forName("sunyue.Person");
        System.out.println(aclass1);

        Class<Person> class2 = Person.class;
        System.out.println(class2);

        Person person=new Person();
        Class<? extends Person> class3 = person.getClass();
        System.out.println(class3);

        Method[] methods = class2.getMethods();
        for(Method method:methods){
           System.out.println(method);
        }

        Class<?>[] interfaces = class2.getInterfaces();
        for(Class in:interfaces){
            System.out.println(in);
        }
        Person person1 = class2.newInstance();
        Method method = class2.getDeclaredMethod("siyou", String.class);
        method.setAccessible(true);
        method.invoke(person1, "sunyue");

        Constructor<Person> declaredConstructor = class2.getDeclaredConstructor(int.class, String.class);
        declaredConstructor.setAccessible(true);
        Person person2 = declaredConstructor.newInstance(3, "zs");
        System.out.println(person2.getId());

        Properties properties=new Properties();
        properties.load(new FileReader("class.txt"));
        String classname = properties.getProperty("classname");
        String methodname = properties.getProperty("methodname");
        Class<?> aClass = Class.forName(classname);
        Object o = aClass.newInstance();
        Method method1 = aClass.getMethod(methodname);
        method1.invoke(o);

        Class<?> aClass4 = Class.forName("sunyue.Person");
        Person o1 = (Person)aClass4.newInstance();
        FanShe2 fanShe2=new FanShe2();
        fanShe2.setpro(o1,"name","xiaobu");
        System.out.println(o1.getName());
    }
}
