package by.belhard.j22.lessons.lesson13.reflectionExample;

import java.lang.reflect.Field;

public class ReflectionExample {

    public static void main(String[] args) throws Exception {

        PrivateFieldClass a1 = new PrivateFieldClass(5);

        System.out.println(a1.getA());

        Class<? extends PrivateFieldClass> aClass = a1.getClass();

        Field[] declaredFields = aClass.getDeclaredFields();

        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        Field a = aClass.getDeclaredField("a");

        a.setAccessible(true);

        a.setInt(a1, 10);

        System.out.println(a1.getA());
    }
}
