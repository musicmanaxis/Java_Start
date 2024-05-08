package scanner;

import java.util.Scanner;

public class ScannerWhileEx4 {


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String item = "";
        int price;
        int qun;
        int sum = 0;
        String menu;
        int totalCost=0;

            while (true) {
                System.out.println("1.상품 입력  2.결제  3.프로그램 종료");
                    menu = scn.nextLine();
                if (menu.equals("1")) {
                    System.out.print("상품명을 입력하세요:");
                    item = scn.nextLine();
                    System.out.print("상품의 가격을 입력하세요:");
                    price = scn.nextInt();
                    System.out.print("구매수량을 입력하세요:");
                    qun = scn.nextInt();
                    sum = price * qun;
                    totalCost+=totalCost+sum;
                    System.out.println("상품명:" + item + "가격:" + price + "수량:" + qun + "합계:" + sum);

                } else if (menu.equals("2")) {
                    System.out.println("총비용:"+totalCost);
                    totalCost=0;
                    System.out.println("총비용은 "+totalCost+"로 초기화 되었습니다.");

                } else if(menu.equals("3")){
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }else {
                    System.out.println("올바른 입력을 해주세요");
                }
            }
    }
}