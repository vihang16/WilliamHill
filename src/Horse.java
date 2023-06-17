public class Horse {

    public String name;
    public int power;

    public Horse(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}
