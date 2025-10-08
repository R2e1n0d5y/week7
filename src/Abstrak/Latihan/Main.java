package Abstrak.Latihan;

public class Main {
    public static void main(String[] args) {
        Manager M1 = new Manager("tes", 10);
        System.out.println("total gaji manager " + M1.getName() +"adalah" + M1.calculateBonus());
        Staff S1 = new Staff("tes2", 0);
        System.out.println("total gaji staff " + S1.getName() +"adalah" + M1.calculateBonus());
    }
}
