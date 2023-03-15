public class Rabbit extends SmallAnimal {
    public Rabbit(String name, int age, double weight) {
        super(name, age, weight);
    }

    public void thump() {
        System.out.println(this.getName() + " is thumping");
    }
}
