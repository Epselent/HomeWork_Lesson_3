public class Task2_Class_Animal {
    public static void main(String[] args) {
    Animal[]animals = new Animal[]{new Dog("Кость", "конура"), new Cat("Мышь", "частный дом"), new Horse("Сено", "Сарай")};
        for (Animal animal:animals) {
            Veterinarian.treatAnimal(animal);
        }
    }
}
