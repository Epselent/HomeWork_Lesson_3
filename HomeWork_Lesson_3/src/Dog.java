public class Dog extends Animal {

    public Dog(String food, String location) {
        super(food, location);
        super.kind = "Собака";
    }
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Гав-гав-гав");
    }
    @Override
    public void eat() {
        super.eat();
        System.out.println("Собака грызет кости ");
    }
}
