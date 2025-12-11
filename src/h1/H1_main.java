package h1;

public class H1_main {
    public static void main(String[] args) {

        Bruch b1 = new Bruch(25, 5);
        b1.shorten();
        System.out.println(b1.getZaehler() + "/" + b1.getNenner()); // 5/1

        Bruch b2 = new Bruch(8, 12);
        b2.shorten();
        System.out.println(b2.getZaehler() + "/" + b2.getNenner()); // 2/3

        Bruch b3 = new Bruch(5, 3);
        Bruch b4 = new Bruch(15, 9);
        System.out.println(b3.hasSameValueAs(b4)); // true
    }
}


