package src;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class multiplication_division {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Your first number: ");
        double number_one = in.nextDouble();
        System.out.println("Your second number: ");
        double number_two = in.nextDouble();

        if (number_two!=0) {
            double result = number_two / (1.0 / number_one);
            System.out.println(result);
        }
        else {
            System.out.println("Invalid value");
        }

        try {
            FileReader fr = new FileReader("C:\\Users\\polue\\IdeaProjects\\Projects\\src\\src\\expression.txt");
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            System.out.println(line);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
