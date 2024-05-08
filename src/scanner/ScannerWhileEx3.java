package scanner;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("숫자를 입력하세요:");
        int sum=0;
        int a=0;
//        while(true){
//            a= scn.nextInt();
//
//            if(a==-1){
//                         break;
//            }
//
//            sum+=a;
//        }
//

        while( (a= scn.nextInt())!=-1){   //위의 문장을 이렇게 간단히 할수 있다.
            sum+=a;
        }

        System.out.println("입력한 숫자의 합계는 "+(sum)+"입니다.");

    }
}
