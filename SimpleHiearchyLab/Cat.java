public class Cat extends Pet {
    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }

    public void scratch() {
        System.out.println(this.getName() + " is scratching");
    }

    public void purr() {
        System.out.println(this.getName() + " is purring");
    }
}
