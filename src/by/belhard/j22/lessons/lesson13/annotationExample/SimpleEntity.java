package by.belhard.j22.lessons.lesson13.annotationExample;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SimpleEntity {
    @Example(times = 5)
    private int id;
    @Example
    private String name;

    private int age;
}
