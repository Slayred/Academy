package cinema;

import java.util.*;
import java.util.stream.Collectors;


public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        String operator = scanner.next();
        long num2 = scanner.nextLong();
        if (operator.equals("-")) {
        	subtractTwoNumbers(num1,num2);
        } else if(operator.equals("+")) {
        	sumTwoNumbers(num1,num2);
        }else if(operator.equals("/")) {
        	divideTwoNumbers(num1,num2);
        }else if(operator.equals("*")) {
        	multiplyTwoNumbers(num1,num2);
        }
        
    }

    // Implement your methods here
    public static void subtractTwoNumbers(long a, long b) {
    	System.out.print(a - b);
    }


    public static void sumTwoNumbers(long a, long b) {
	System.out.print(a + b);
}


    public static void divideTwoNumbers(long a, long b) {
    	if (b == 0) {
    		System.out.print("Division by 0!");
    	}else {System.out.print(a / b);}
    
    	
    }


    public static void multiplyTwoNumbers(long a, long b) {
    	System.out.print(a * b);}
    
}

