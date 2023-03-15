public class SmallAnimal extends Pet {
    public SmallAnimal(String name, int age, double weight) {
        super(name, age, weight);
    }

    public void chew() {
        System.out.println(this.getName() + " is chewing");
    }
}
