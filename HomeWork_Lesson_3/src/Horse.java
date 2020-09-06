public class Horse extends Animal {


    public Horse(String food, String location) {
        super(food, location);
        super.kind = "Лошадь";
    }
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Иго-го-Иго-го");
    }
    @Override
    public void eat() {
        super.eat();
        System.out.println("Лошадь ест траву");
    }
}
