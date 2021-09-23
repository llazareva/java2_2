public class Main {
    public static void main(String[] args) {
        int initialBalance = 0;
        int payment = 1500;
        int bonus;


        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        int totalBalance = initialBalance + payment + bonus;
        System.out.println(totalBalance);
        System.out.println(bonus);
    }
}
