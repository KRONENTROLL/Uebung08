package p1;

public class P1_main {
    public static void main(String[] args) {
        int a = 99;
        System.out.println(getNumber(a));
    }
        static public int getNumber (int a) {
                return a = (a > 42 ) ? 42 : 0;
        }
}
