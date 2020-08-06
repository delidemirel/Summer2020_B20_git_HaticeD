package utility;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] inhabitants = new int[8];
    for(int i=0; i<inhabitants.length; i++) {
        inhabitants[i] = input.nextInt();
    }

    //TODO. Write you code below this line.

    int count =0;
    int [] expectation=new int[inhabitants.length];
    while(!Arrays.equals(inhabitants,expectation)){
        System.out.print("Day "+ count++ + " ");
        System.out.println(Arrays.toString(inhabitants));
        int index=-1;

        for(int i=0; i<inhabitants.length; i++){
            if(inhabitants[i]==0){
                if(i>0 && inhabitants[i-1] !=0 && index != i-1){
                    inhabitants[i-1]/=2;
                }
                if(i<inhabitants.length-1 && inhabitants[i+1] !=0){
                    inhabitants[i+1]/=2;
                    index=i+1;
                    i++;
                }
            }

        }
    }
    System.out.print("Day "+ count++ + " ");
    System.out.println(Arrays.toString(inhabitants));
    System.out.println("---- EXTINCT ----");
        System.out.println("HELLO");
}
}
