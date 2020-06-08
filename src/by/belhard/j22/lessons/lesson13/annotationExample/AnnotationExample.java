package by.belhard.j22.lessons.lesson13.annotationExample;

public class AnnotationExample {

    public static void main(String[] args) {

        ExampleEntity e1 = new ExampleEntity(1, "abc", 2);
        SimpleEntity e2 = new SimpleEntity(10, "def", 20);

        System.out.println(AnnotationDataPrinter.getData(e1));
        System.out.println(AnnotationDataPrinter.getData(e2));
    }
}
