public class task1_Class_Phone {
    public static void main(String[] args) {
        Phone samsung = new Phone();
        Phone iphone = new Phone();
        Phone xiaomi = new Phone();
        samsung.number = 892246344;
        samsung.model = "Galaxy s20";
        samsung.weight = 315.5;
        iphone.number = 892446344;
        iphone.model = "iphone XS";
        iphone.weight = 326.5;
        xiaomi.number = 895246344;
        xiaomi.model = "Redmi Note8";
        xiaomi.weight = 415.5;
        System.out.println(samsung.number + " " + samsung.model + " " + samsung.weight);
        System.out.println(iphone.number + " " + iphone.model + " " + iphone.weight);
        System.out.println(xiaomi.number + " " + xiaomi.model + " " + xiaomi.weight);
        samsung.receiveCall("Вася");
        System.out.println("Номер телефона " + samsung.getNumber());
        iphone.receiveCall("Bob", 4347674);
        Phone.sendMessage(1344, 464634, 464346);
    }
}
