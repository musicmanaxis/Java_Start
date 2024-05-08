package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("문자열을 입력하세요:");
        String input=scn.nextLine();

        System.out.println("입력한 문자열:"+input);


    }
}
