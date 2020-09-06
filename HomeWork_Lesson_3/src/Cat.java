public class Cat extends Animal {
    int qtLives;
    public Cat(String food, String location) {
        super(food, location);
        super.kind = "Кошка";
    }
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Мяу-мяу-мяу");
    }
    @Override
    public void eat() {
        super.eat();
        System.out.println("Кошка ест мышей");
    }
}
