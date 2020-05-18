package by.belhard.j22.lessons.lesson09.warehouseExample.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"name"})
@ToString
public class GoodEntity {

    private String name;

    private int quantity;

    /*public GoodEntity() {

    }

    public GoodEntity(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoodEntity that = (GoodEntity) o;
        return quantity == that.quantity &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quantity);
    }

    @Override
    public String toString() {
        return "GoodEntity{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }*/
}
