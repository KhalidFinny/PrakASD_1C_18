package P8.Postfix;

import java.util.Scanner;

public class postfixmain18 {
    public static void main(String[] args) {
        Scanner finnny18 = new Scanner(System.in);
        String p,q;
        System.out.println("Masukkan ekspresi infix: ");
        q = finnny18.nextLine();
        q = q.trim();
        q = q + ")";

        int total = q.length();

        Postfix18 post = new Postfix18(total);
        p = post.konversi(q);
        System.out.println("Postfix: " + p);
    }
}
