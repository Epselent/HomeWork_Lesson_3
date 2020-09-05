public class Phone {
    int number;
    String model;
    double weight;
    public Phone() {
    }
    public Phone(int number, String model, double weight) {
        this(number,model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }



    public void receiveCall (String name){
        System.out.println("Звонит " + name);
    }
    public void receiveCall(String name, int number){
        System.out.println("Звонит " + name + " телефон № " + number);
    }
    public int getNumber() {
        return number;
    }
    public static void sendMessage (int ... T){
        for (int a:T) {
            System.out.println("Сообщение отправлено по номеру: " + a);
        }
    }
}
