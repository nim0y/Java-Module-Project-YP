public class FormRub {

    public static String priceForm1() {
            if ((int)(Calc.finalCost % 100 / 10) == 1){
                return " рублей.";
            }
        if ((int) (Calc.finalCost % 10) == 1) {
            return " рубль.";
        } else if ((int) (Calc.finalCost % 10) == 2 || (int) (Calc.finalCost % 10) == 3 || (int) (Calc.finalCost % 10) == 4) {
            return " рубля.";
        }
        return " рублей.";
    }

    public static String priceForm2() {
        if ((int)(Calc.finalCostEach % 100 / 10) == 1){
            return " рублей.";
        }
        if ((int) (Calc.finalCostEach % 10) == 1) {
            return " рубль.";
        } else if ((int) (Calc.finalCostEach % 10) == 2 || (int) (Calc.finalCostEach % 10) == 3 || (int) (Calc.finalCostEach % 10) == 4) {
            return " рубля.";
        }
        return " рублей.";
    }
}