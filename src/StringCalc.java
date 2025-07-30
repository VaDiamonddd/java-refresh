import java.util.ArrayList;
import java.util.Scanner;
public class StringCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the total operation you want to use. " +
                "Please adhere to common rules of mathematics. " +
                "Surround negative numbers with parentheses");
        String operation = input.nextLine();
        input.close();
        int openingOperBr = 0;
        ArrayList<Integer> brIndices = new ArrayList<>();
        char[] convertedArr = operation.toCharArray();
        for (int i = 0; i < convertedArr.length; i++){
            if (convertedArr[i] == '(' && i != (convertedArr.length - 1) && convertedArr[i+1] != '-'){
                openingOperBr += 1;
                brIndices.add(i);
            }
        }
        
    }
}
