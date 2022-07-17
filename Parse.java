public class Parse {
    public static boolean isRome = false;
    public static int[] parse(String[] parts) throws Exception{
        int number1;
        int number2;
        try {
            number1 = RomanNumbers.valueOf(parts[0]).getValue();
            number2 = RomanNumbers.valueOf(parts[2]).getValue();
            isRome = true;
        } catch (IllegalArgumentException e) {
            try {
                number1 = Integer.parseInt(parts[0]);
                number2 = Integer.parseInt(parts[2]);
            } catch (NumberFormatException e2) {
                throw new Exception("Некорректные данные");
            }

        }
        if (number1 > 10 || number2 > 10 || number1 < 1 || number2 < 1){
            throw new Exception("Некорректные данные");
        }
        return new int[]{number1, number2};
    }
}