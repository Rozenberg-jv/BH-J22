package by.belhard.j22.lessons.lesson09.warehouseExample.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"name"})
@ToString
public class GoodEntity implements Comparable<GoodEntity> {

    public static final String GOODS_TABLE_FORMAT = "%-15s|%10s\n";

    private String name;

    private int quantity;

    public GoodEntity setQuantity(int quantity) {

        this.quantity = quantity;

        return this;
    }

    @Override
    public int compareTo(GoodEntity another) {
        return this.getName().compareToIgnoreCase(another.getName());
    }

    public String formatForPrint() {

        return String.format(GOODS_TABLE_FORMAT, name, quantity);
    }
}
