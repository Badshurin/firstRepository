package chapter35_4_1;

public class GenericStatic {
    public static <T> Object someStaticMethod(T genericObject) {
        System.out.println(genericObject);
        return genericObject;
    }
}
