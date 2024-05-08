package scanner;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {

        System.out.print("출력할 구구단을 입력하세요:");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();

        for(int i=1 ;i<=9; i++){
           int ans= num*i;
           System.out.println(num+"*"+i+"="+ans);
        }
    }
}
