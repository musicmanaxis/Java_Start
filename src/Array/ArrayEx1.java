package Array;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students={70, 60, 70, 80, 90};

        int total=0;
        double average=0.0;
        for(int a:students){
            total+=a;
        }
        average=(double) total/students.length;
        System.out.println("Total="+total);
        System.out.println("Average="+average);
    }
}
