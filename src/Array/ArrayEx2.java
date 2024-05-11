package Array;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int[] a=new int[5];
        System.out.print("5개의 정수를 입력하시요");
        int count=0;
        while (true){
            a[count] = scn.nextInt();
            count++;
            if(count==5) break;;

        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
            if(i<a.length-1)
                System.out.print(", ");
        }


    }
}
