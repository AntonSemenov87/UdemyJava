package OCAstuff;

import java.util.Random;

public class Zoo {
    public static void main(String [] args) {
        Random r = new Random();
        System.out.println(r.nextInt(2));

        StringBuffer sbuf = new StringBuffer();
        System.out.println("Capacity of StringBuffer is = " + sbuf.capacity());
        System.out.println("Length of StringBuffer is = " + sbuf.length());

        StringBuffer sb = new StringBuffer("Jupiter is awesome!");
        System.out.println(sbuf);
        sb.append(" So is Saturn!");
        System.out.println(sb);

    }
}
