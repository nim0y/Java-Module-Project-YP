public class Calc {
    String productNameC = "";
    static double finalCost = 0;
    static double finalCostEach = 0;

    public void productCalc(String name, double price) {
        if (price <= 0) {
            System.out.println("Вы ошиблись.\nПопробуйте ещё!");
        } else {
            finalCost = finalCost + price;
            productNameC = productNameC + name + "\n";
            System.out.println("Добавили! Едем дальше!");
        }
    }

    public void finCountDown(int guestNumber) {
        System.out.println("Добавлено:\n" + productNameC);
        finalCostEach = finalCost / guestNumber;
        System.out.println("С каждого:\n" + String.format("%.2f", finalCostEach) + FormRub.priceForm2());
        System.out.println("Всего:\n" + String.format("%.2f", finalCost) + FormRub.priceForm1());

    }
}
