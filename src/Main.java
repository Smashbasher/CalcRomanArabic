import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        String[] parts = Input.read();
        int[] nums = Parse.parse(parts);
        char op = parts[1].charAt(0);
        int result = Calculate.calc(nums[0], nums[1], op);
        if (Parse.isRome) {
            System.out.println(Convert.convertArabianToRoman(result));
        }
        if (Parse.isRome & result < 1) {
            throw new Exception("Недопустимая операция");
        }
        else {
            System.out.println(result);
        }
    }
}
