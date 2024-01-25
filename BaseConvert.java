package ca.bcit.comp1510.lab02;
import java.util.*;

public class BaseConvert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quotient, remainder;
        ArrayList<Integer> remainderList = new ArrayList<Integer>();
        
        System.out.println("decimal number");
        int decimalNum = scanner.nextInt();
        System.out.println("base number");
        final int BASE_NUM = scanner.nextInt();  
        
        scanner.close();
        
        quotient = decimalNum;
        do {
            remainder = quotient % BASE_NUM;
            quotient = quotient / BASE_NUM;
            
            remainderList.add(remainder);
        }while(quotient >= BASE_NUM);
           
        StringBuilder result = new StringBuilder();
        result.append(quotient);
        
        for(int j = remainderList.size() - 1; j >= 0; j--) {
            result.append(remainderList.get(j));
        }
        System.out.println(result.toString());
        
    }

}
         