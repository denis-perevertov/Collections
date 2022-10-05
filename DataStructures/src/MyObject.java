import java.util.Objects;

public class MyObject implements Comparable<MyObject> {

    public String name;
    public int age;
    public String address;
    public boolean isMale;
    public boolean isFemale;

    public boolean isHuman;

    public MyObject(String name, int age) {
        this.name = name;
        this.age = age;
        this.isHuman = true;
    }

    public MyObject(String name, int age, String address, boolean isMale, boolean isFemale, boolean isHuman) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.isMale = isMale;
        this.isFemale = isFemale;
        this.isHuman = isHuman;
    }

    public boolean equals(Object o) {

        /*

        Рефлексивность
        для любого заданного значения x, выражение x.equals(x) должно возвращать true.
        Заданного — имеется в виду такого, что x != null

        Симметричность
        для любых заданных значений x и y, x.equals(y) должно возвращать true только в том случае, когда y.equals(x) возвращает true.

        Транзитивность
        для любых заданных значений x, y и z, если x.equals(y) возвращает true и y.equals(z) возвращает true, x.equals(z) должно вернуть значение true.

        Согласованность
        для любых заданных значений x и y повторный вызов x.equals(y) будет возвращать значение предыдущего вызова этого метода при условии, что поля, используемые для сравнения этих двух объектов, не изменялись между вызовами.

        Сравнение null
        для любого заданного значения x вызов x.equals(null) должен возвращать false.

         */

        if(this == o) return true;
        if(!(o instanceof MyObject)) return false;
        return (((MyObject) o).age == this.age &&
                ((MyObject) o).name.equals(this.name)) &&
                ((MyObject) o).isHuman == this.isHuman;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address, isMale, isFemale, isHuman);
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", isMale=" + isMale +
                ", isFemale=" + isFemale +
                ", isHuman=" + isHuman +
                '}';
    }

    @Override
    public int compareTo(MyObject o) {


        //сортировка по имени , если имена одинаковые - то по возрасту

        int compare = this.name.compareTo(o.name);
        if(compare == 0) {
            compare = this.age - o.age;
        }
        return compare;
    }
}
