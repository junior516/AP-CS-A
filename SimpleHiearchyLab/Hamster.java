public class Hamster extends SmallAnimal {
    public Hamster(String name, int age, double weight) {
        super(name, age, weight);
    }

    public void runOnWheel() {
        System.out.println(this.getName() + " is running on its wheel!");
    }
}
