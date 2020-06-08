package by.belhard.j22.lessons.lesson13.annotationExample;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExampleEntity {

//    @Example
    private int id;
    @Example(times = 2)
    private String name;
    @Example
    private int age;
}
