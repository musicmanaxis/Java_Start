package Array;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        int[] num;
        int i=0;
        int tmp=0;

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        num=new int[scn.nextInt()];
        System.out.print("3개의 정수를 입력하세요:");

        while(true){
            num[i]=scn.nextInt();
            ++i;
            if(i==num.length) break;
        }
        System.out.println();
//        for (int a:num)
//            System.out.print("배열에 담긴 값:"+num);

        for(int j=0;j<num.length;j++){
          //  System.out.print("배열에 담긴 값:"+num[j]);
            if(num[j]>num[j+1]){
                tmp=num[j+1];
                num[j+1]=num[j];
                num[j]=tmp;
            }else {
                break;
            }
        }

        for(int j=0;j<num.length;j++) {
            System.out.print("정열후 배열에 담긴 값:" + num[j]);

        }

    }
}
