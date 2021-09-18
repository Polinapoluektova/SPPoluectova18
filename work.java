package src;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class work {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\polue\\IdeaProjects\\Projects\\src\\src\\expression.txt");
            BufferedReader reader = new BufferedReader(fr);
            String expression = reader.readLine();
            System.out.println(expression);
            boolean results = expression.matches(("(\\d+\s+\\d)"));
            int index = expression.indexOf(" ");
            String number_one = expression.substring(0, index);
            String number_two = expression.substring(index + 1);
            double number_1 = Double.parseDouble(number_two);
            double number_2 = Double.parseDouble(number_one);
            if (number_2 != 0) {
                double result = number_2 / (1.0 / number_1);
                System.out.println(result);
            } else {
                System.out.println("Invalid value");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
