public class Dog extends Pet {
    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }
    public void dig() {
        System.out.println(this.getName() + " is digging");
    }
    public void bark() {
        System.out.println(this.getName() + " is barking");
    }
}
