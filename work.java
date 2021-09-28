package src;
import java.io.*;

public class work {
    public static void readingFromAClass() {
        try(BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\polue\\IdeaProjects\\Projects\\src\\src\\expression.txt"))){
            String s = read.readLine();
            boolean result = s.matches("(\\d+\s+\\d)");
            int index = s.indexOf(" ");
            String number_one = s.substring(0, index);
            String number_two = s.substring(index + 1);

            expression multiplication = new expression();
            System.out.println(multiplication.Mul((number_one), (number_two)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class expression{
        String Mul(String number_one, String number_two) {
            double number_1 = Double.parseDouble(number_two);
            double number_2 = Double.parseDouble(number_one);
            if (number_2 != 0) {
                double result = number_1 / (1.0 / number_2);
                System.out.println(result);
                return number_two;
            } else {
                System.out.println("Invalid value");
            }
            return number_one;
        }
    }
    public static void main(String[] args) {
        readingFromAClass();
    }
}