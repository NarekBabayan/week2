package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String myStr = scanner.nextLine();
        int z=0;

         for(int i=0; i<=myStr.length()-1; i++){
             char check = myStr.charAt(i) ;
             if (check<=57 && check>=48){
                 z++;
             }
         }

         if (z==myStr.length()){
             int num = Integer.parseInt(myStr);
             int fact=1;
             for(int i=1; i<=num; i++){
                 fact = fact*i;
             }
             System.out.println(fact);
         }else {
             System.out.println("normal tiv nermuci ara");
         }

    }
}
