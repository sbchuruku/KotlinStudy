package sbc.q200.part5;

public class Q196JavaClass
{
    public static <T> void printClassInfo(Class<T> clazz)
    {
        System.out.println(clazz.getCanonicalName());
    }
}
