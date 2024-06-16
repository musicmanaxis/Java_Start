package Generic;
//제네릭클래스를 이용하는 이유는 여러 타입의 객체를 형변환필요없이 사용할려고 사용한다.



public class GenericTypeClass1<T> {

    private T value;

    public void set(T value){
        this.value=value;
    }

    public T get(){
        return value;
    }
}
