public class Main {
    public static void main(String[] args) {
        int accountAmount = 100;
        int replenishmentAmount = 100;
        int bonus = 0;
        int totalAccountAmount;

        if (replenishmentAmount <= 1000) {
            totalAccountAmount = accountAmount + replenishmentAmount;
        } else {
            bonus = replenishmentAmount / 100;
            totalAccountAmount = accountAmount + replenishmentAmount + bonus;
        }
        System.out.println("Текущий счет: " + totalAccountAmount);
        System.out.println("Начислено бонусов: " + bonus);
    }
}

