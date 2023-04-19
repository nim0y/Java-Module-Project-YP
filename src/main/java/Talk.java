import java.util.Scanner;

public class Talk {
    public static void Talking() {
        Scanner scanner = new Scanner(System.in);
        Calc calculator = new Calc();
        while (true) {
            System.out.println("Введите название товара");
            String name = scanner.next();
            System.out.println("Введите стоимость");
            if (scanner.hasNextDouble()) {
                double price = scanner.nextDouble();
                calculator.productCalc(name, price);
                System.out.println("Добавим еще? Введите любой символ.\nЕсли нет напишите \"Завершить\"");
            } else {
                System.out.println("Ошибка попробуй еще!");
            }
            String end = scanner.next();
            if (end.trim().equalsIgnoreCase("завершить")) {
                calculator.finCountDown(Gests.guestNumber);
                System.out.println("Кониек");
                break;
            }

        }

    }
}