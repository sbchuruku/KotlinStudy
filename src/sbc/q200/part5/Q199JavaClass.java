package sbc.q200.part5;

public class Q199JavaClass
{
    public static void main(String[] args)
    {
        System.out.println(Q199.INSTANCE.getNum()); // object 키워드로 선언된 코틀린 객체클래스로 접근하는 방법
        Q199.INSTANCE.setNum(0);
        Q199.INSTANCE.hello();
    }
}
