package sbc.q200.part5;

public class Q197JavaClass
{
    public static void main(String[] args)
    {
        System.out.println(Q197_1Kt.getA()); // 코틀린의 파일명Kt 클래스의 static 멤버로 오직 Getter/Setter 로 접근 가능
        Q197_1Kt.func(); // Q197_1.kt 의 func 함수
        Q197_1Kt.extension(100); // 코틀린 코드의 100.extension() 과 같다.

        MyKotlin.func2(); // Q197_2.kt 를 MyKotlin 으로 클래스를 만들어 그 안에 func2를 호출
    }
}
