package by.belhard.j22.lessons.lesson13.annotationExample;

import java.lang.reflect.Field;

public class AnnotationDataPrinter {

    public static String getData(Object obj) {

        StringBuilder result = new StringBuilder();

        Class<?> aClass = obj.getClass();

        String simpleName = aClass.getSimpleName();
        result.append(simpleName).append("[");

        for (Field field : aClass.getDeclaredFields()) {
            Example annotation = field.getAnnotation(Example.class);
            if (annotation == null)
                continue;

            field.setAccessible(true);

            String name = field.getName();
            Object value;
            try {
                value = field.get(obj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                continue;
            }

            int times = annotation.times();

            for (int i = 0; i < times; i++)
                result.append(name).append(":").append(value).append(",");
        }

        int lastIndex = result.lastIndexOf(",");
        if (lastIndex == result.length() - 1) {
            result.deleteCharAt(lastIndex);
        }

        return result.append("]").toString();
    }
}
