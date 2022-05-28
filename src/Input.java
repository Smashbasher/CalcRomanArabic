import java.util.Scanner;

public class Input {
    public static String[] read() throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(" ");
        if (parts.length > 3) {
            throw new Exception("Больше двух аргументов");
        }
        return parts;
    }
}