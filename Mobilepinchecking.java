package com.edu;
import java.util.*;

public class Mobilepinchecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of PIN numbers");
        int n = sc.nextInt();
        
        if(n <= 0) {
            System.out.println(n + " is an invalid number");
            return;
        }
        
        System.out.println("Enter the PIN numbers");
        List<String> validPins = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            String pin = sc.next();
            
            if(pin.length() != 4 || !isNumeric(pin)) {
                System.out.println(pin + " is an invalid PIN number");
                continue;
            }
            
            int first = pin.charAt(0) - '0';
            int second = pin.charAt(1) - '0';
            int third = pin.charAt(2) - '0';
            int fourth = pin.charAt(3) - '0';
            
            if(first % 2 != 1 || second % 2 != 0 || !isPrime(third) || isPrime(fourth)) {
                continue;
            }
            
            validPins.add(pin);
        }
        
        if(validPins.size() == 0) {
            System.out.println("All these " + n + " numbers are not a valid PIN number");
        } else {
            System.out.println("Valid PIN numbers are");
            for(String pin : validPins) {
                System.out.println(pin);
            }
        }
    }
    
    private static boolean isNumeric(String str) {
        for(char c : str.toCharArray()) {
            if(!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    
    private static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}





