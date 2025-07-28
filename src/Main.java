import java.util.Scanner;

public abstract class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers and operation you want to use.");
        double a = input.nextDouble();
        double b = input.nextDouble();
        String operator =  input.next();
        input.close();
        switch (operator){
            case "/" -> System.out.println(a / b);
            case "*" -> System.out.println(a * b);
            case "+" -> System.out.println(a + b);
            case "-" -> System.out.println(a - b);
        }
    }
}