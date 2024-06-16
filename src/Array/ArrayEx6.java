package Array;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {

        int minnum, maxnum;


        Scanner scn=new Scanner(System.in);

        System.out.print("입력받을 숫자를 입력하세요:");
        int[] num=new int[scn.nextInt()];

        System.out.print(num.length+"개의 정수를 입력하세요");

        int i=0;
        while(true) {
            num[i] = scn.nextInt();
            ++i;
            if(i>(num.length-1)) break;
        }

        minnum=maxnum=num[0];  //배열의 첫번째것으로 초기화한다. 이것을 비교기준..

        for(int j=1; j<num.length;j++){
            if(minnum>num[j]) {   //첫번째 요소와 두번째것부터 비교하기 시작->  j=1
                minnum = num[j];
            } else if (maxnum<num[j]) {
                maxnum=num[j];

            }
        }

        System.out.println("가장 작은 수는 "+minnum);
        System.out.println("가장 큰 수는 "+maxnum);
    }
}
