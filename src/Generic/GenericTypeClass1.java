package Generic;
//제네릭클래스를 이용하는 이유는 여러 타입의 객체를 형변환필요없이 사용할려고 사용한다.
//<T>는 마치 메서드의 매개변수라고 생각하면된다..
//제네릭 클래스의 생성자를 생성시 <String>이라고 한다면 생성시,아래에 있는 T에 있는 모든것이 String으로 바뀐다.
public class GenericTypeClass1<T> {
    private T value;

    public void set(T value){
        this.value=value;
    }
    public T get(){
        return value;
    }
}
