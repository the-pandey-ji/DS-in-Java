package basic;

import java.util.Scanner;

public class First{
    public static void main(String[] args) {
        System.out.println("Journey Started");
        System.out.println("'checking single comma'");
        Scanner sc =new Scanner(System.in);
        String button = sc.next();
        char btt = button.charAt(0);
        switch (btt) {
            case 'a':
                System.out.println("first case");
                break;
        
            default:
            System.out.println("default case");
                break;
        }

    }
}