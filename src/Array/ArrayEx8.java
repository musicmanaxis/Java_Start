package Array;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        int menu = 0;
        String[] name = new String[10];
        int[] price = new int[10];
        int count = 0;


        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("1.상품 등록. 2.상품 목록 3.종료");
            System.out.print("메뉴를 선택하세요:");

            menu = scn.nextInt();
            scn.nextLine();
            if(count==10) {
                System.out.println("상품을 더 이상 등록할 수 없습니다.");
                continue;
            }
            if (menu == 1) {
                System.out.print("상품이름을 입력하세요:");
                name[count] = scn.nextLine();
                System.out.println();
                System.out.print("상품가격을 입력하세요:");
                price[count] = scn.nextInt();
                count++;
            }else if(menu==2){
                for(int i=0;i< count;i++){
                    System.out.println(name[i]+":"+price[i]+"원");
                    if(name[i]==null) return;
                }
            } else if (menu==3) {
                break;

            }else{
                System.out.println("잘못된 메뉴입니다..");
            }
        }
    }
}
