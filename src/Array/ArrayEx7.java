package Array;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        int kor, math, eng;
        int stu=0;   //학생수는 4명
        int sum;
        double avg;

        Scanner scn=new Scanner(System.in);

        System.out.print("학생수를 입력하시요:");
        stu=scn.nextInt();
        int[][] score=new int[stu][3];

        System.out.println("배열의 크기:"+score.length);

        for(int i=0;i<score.length;i++){

                System.out.println((i+1)+"번째 학생의 성적을 입력하세요");
                System.out.print("국어점수:");
                kor= scn.nextInt();
                score[i][0]=kor;
                System.out.println("국어점수->"+score[i][0]);

                System.out.print("영어점수:");
                eng= scn.nextInt();
                score[i][1]= eng;
                System.out.println("영어점수->"+score[i][1]);

                System.out.print("수학점수:");
                math= scn.nextInt();
                score[i][2]= math;
                System.out.println("수학점수->"+score[i][2]);
                ++stu;
              if(i==(score.length)) break;

        }

       stu=0;
        for(int i=0;i<score.length;i++) {
            kor=score[i][0];
            math=score[i][1];
            eng=score[i][2];
            sum=kor+math+eng;
            avg=(double) sum/3;
            System.out.println((i+1)+"번 학생의 총점:" +sum+", 평균:"+avg);

           ++stu;
            if(i==score.length) break;
        }

    }
}
