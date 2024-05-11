package Array;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        System.out.print("입력받을 숫자를 입력하세요:");

        Scanner scn=new Scanner(System.in);
        int count=scn.nextInt();
        int[] num=new int[count];
        System.out.println(num.length+"크기의 배열생성");

        int a=0;
        int i=0;
        int sum=0;
        double avg;
        System.out.print(count+"개의 정수를 입력하세요:");

        while(i<count) {
            num[i]=scn.nextInt();
            System.out.print(i+"반쩨:"+num[i]+"담음");
            ++i;
            if(i==count) break;
        }

        for(int j=0;j<num.length;j++){
            sum+=num[j];
        }
        System.out.println();
        System.out.println("입력한 정수의 합계:"+sum);
        avg=(double) sum/count;
        System.out.println("입력한 정수의 평균:"+avg);
    }
}
