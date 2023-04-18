public class FormRub {

    public static String priceForm() {
            if ((int)(Calc.finalCost % 100 / 10) == 1){
                return " рублей.";
            }
            switch ((int) (Calc.finalCost % 10)){
                case 1:
                    return " рубль.";
                case 2:
                case 3:
                case 4:
                    return " рубля.";
                default:
                    return " рублей.";
            }
        }
    }

