package org.example.dz9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Calc c = new Calc();
        Scanner in = new Scanner(System.in);
        String buffer;

        double arg1, arg2;
        System.out.println("type help to show options\n");
        while (true)
        {
            buffer = in.next();
            switch (buffer)
            {
                case ("exit"):
                    return;

                case ("help"):
                {
                    System.out.println("exit close\n" +
                            "sum +\n" +
                            "sub -\n" +
                            "mul *\n" +
                            "dib /\n");
                    break;
                }

                case ("sum"):
                {
                    System.out.println("enter numbers:");
                    arg1 = Double.parseDouble(in.next());
                    arg2 = Double.parseDouble(in.next());
                    System.out.println(c.sum(arg1, arg2));
                    break;
                }

                case ("sub"):
                {
                    System.out.println("enter numbers:");
                    arg1 = Double.parseDouble(in.next());
                    arg2 = Double.parseDouble(in.next());
                    System.out.println(c.sub(arg1, arg2));
                    break;
                }

                case ("mul"):
                {
                    System.out.println("enter numbers:");
                    arg1 = Double.parseDouble(in.next());
                    arg2 = Double.parseDouble(in.next());
                    System.out.println(c.mul(arg1, arg2));
                    break;
                }

                case ("div"):
                {
                    System.out.println("enter numbers:");
                    arg1 = Double.parseDouble(in.next());
                    arg2 = Double.parseDouble(in.next());
                    System.out.println(c.div(arg1, arg2));
                    break;
                }
            }
        }
    }
}