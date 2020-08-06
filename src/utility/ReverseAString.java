package utility;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");//cat
        String str = scan.nextLine();
        //char firsr_ch = str.charAt(0);
        //String last_ch = str.substring(str.length()- 1);
        String reverse = "";
        for ( int i = str.length()- 1; i >=0 ; i-- ){
            char ch = str.charAt(i) ;
            reverse += ch;
        }
        System.out.println(reverse);

    }}

