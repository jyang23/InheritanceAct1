package com.jy;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Book Code: ");
        String code = in.nextLine();



        Book b = new Book();
        b.setCode(code);
        b.setAuthor("Hello");
        b.setPrice(60.57);
        b.setDescription("Sample Book");
        b.setPages(20);
        System.out.println(b.toString());

        System.out.println("Next Book Code: ");
        code = in.nextLine();


        Software s = new Software();
        s.setCode(code);
        s.setOs("MACOS");
        s.setPrice(90.53);
        s.setDescription("Mac for beginners");
        s.setPlatform("Mac");
        s.setProgrammer("java");
        System.out.println(s.toString());

    }
}
