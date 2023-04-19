import java.util.Scanner;

public class Gests {
    public static int guestNumber;
    public static void Gest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("На какое количество человек разделить счет?");
        guestNumber = 0;
       while(true)
           if (scanner.hasNextInt()) {
               guestNumber = scanner.nextInt();
               if (guestNumber <= 1) {
                   System.out.println("Слишком маленькое число попробуйте еще");
               } else {
                   return;
               }
           }else{
               System.out.println("Это не число");
               scanner.nextLine();
           }
    }

}