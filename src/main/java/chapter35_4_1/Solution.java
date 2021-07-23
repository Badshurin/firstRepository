package chapter35_4_1;

public class Solution {
    public static void main(String[] args) {
        Number number = (Number) GenericStatic.<Number>someStaticMethod(new Integer(3));
    }
}
