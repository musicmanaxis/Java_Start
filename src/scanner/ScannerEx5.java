package scanner;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("첫째 숫자를 입력하세요:");
        int f1= scn.nextInt();
        System.out.print("두번째 숫자를 입력하세요:");
        int f2= scn.nextInt();
       //  System.out.print(f1);


        if(f2<f1){   //첫번째 숫자가 큰 경우 대비
            int tmp=f2;
            f2=f1;
            f1=tmp;
        }
        for(int i=f1;i<=f2;i++){
            System.out.print(i);
            if(f2 !=i) System.out.print(", ");  //끝에 , 를 없애고 싶을 때
        }
      //  System.out.print(f2);
    }
}
