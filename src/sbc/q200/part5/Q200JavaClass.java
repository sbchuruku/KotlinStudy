package sbc.q200.part5;

public class Q200JavaClass
{
    public static void main(String[] args)
    {
        Q200.Companion.setNum(30); // 동반자 객체가 있는 코틀린 클래스는 Companion 이라는 이름의 스태틱 필드를 갖는다.
        System.out.println(Q200.Companion.getNum());
        Q200.Companion.hello();
    }
}
