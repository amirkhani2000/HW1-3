package Base;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle r = new Rectangle();
        r.y = input.nextFloat();
        r.x = input.nextFloat();
        System.out.println("masahat:"+r.masahat());
        System.out.println("mohit:"+r.mohit());
    }
}
