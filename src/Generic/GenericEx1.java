package Generic;

public class GenericEx1 {
    public static void main(String[] args) {
        //제네릭 타입은 제네릭클래스의 객체를 생성할 때 타입이 정해진다.
        //<>은 다이아몬드라고 칭하며 참조형만 가능하며 기본형(int, string..)은 안된다.

        GenericTypeClass1<String> str1=new GenericTypeClass1<>();
        str1.set("Hello");
        System.out.println(str1.get());

        GenericTypeClass1<Integer> int1= new GenericTypeClass1<>();
        int1.set(1000);
        System.out.println(int1.get());

    }
}
