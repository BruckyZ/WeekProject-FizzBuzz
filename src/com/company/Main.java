package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number greater than 1");

        int user;
        int number;
        int count_7 = 0;
        int count_17 = 0;
        int count_23 = 0;
        int count_45 = 0;

        do
        {
            number = scan.nextInt();

                if (number <= 1)
                System.out.println("Enter another number");
                number = scan.nextInt();

            for (int i = 1; i <= number; i++)
                    {
                        if (i % 15 == 0)
                        {
                            System.out.println("FizzBuzz");
                        }
                        else if (i % 5 == 0)
                        {
                            System.out.println("Buzz");
                        }
                        else if (i % 3 == 0)
                        {
                            System.out.println("Fizz");
                        }

                        else
                        {
                            System.out.println(String.valueOf(i));
                        }
                        {
                            if (i % 7 == 0)
                            {
                                count_7 = count_7 + 1;
                            }
                            if (i % 17 == 0)
                            {
                                count_17 = (count_17 + 1);
                            }
                            if (i % 23 == 0)
                            {
                                count_23 = (count_23 + 1);
                            }
                            if (i % 45 == 0)
                            {
                                count_45 = (count_45 + 1);
                            }
                        }
                    }
                System.out.println("The total count for multiplte of 17 is: " + count_7);
                System.out.println("The total count for multiplte of 23 is: " + count_17);
                System.out.println("The total count for multiplte of 23 is: " + count_23);
                System.out.println("The total count for multiplte of 45 is: " + count_45);
            }
            while (number > 1);
        }
    }





