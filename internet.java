//Giorgi Amirajibi

import java.util.*;
import java.text.DecimalFormat;

public class internet
{
    public static void main (String [] args)
    {
        double packageA = 9.95, packageB = 13.95, packageC = 19.95, additionalA = 2.0,
                     additionalB = 1.0, hours, additionalHours, total = 0.0;
        char packageName;

        Scanner keyboard = new Scanner(System.in);
        DecimalFormat num = new DecimalFormat("$#,###.00");

        System.out.println("Internet packages:\n" +
                "\tA:For $9.95 per month 10 hours of access are provided. Additional hours are $2.00 per hour.\n" +
                "\tB:For $13.95 per month 20 hours of access are provided. Additional hours are $1.00 per hour.\n" +
                "\tC:For $19.95 per month unlimited access is provided.");

        System.out.println("Please enter the letter of the internet package you have: ");
        packageName = keyboard.next().charAt(0);


        if (    packageName == 'A' || packageName == 'a' ||
                packageName == 'B' || packageName == 'b' ||
                packageName == 'C' || packageName == 'c')
        {
            System.out.println("Please enter how many hours of internet you have used in this month: ");
            hours = keyboard.nextDouble();

            if (hours > 0)
            {
                if (packageName == 'A' || packageName == 'a')
                {
                    if (hours > 0 && hours <= 10)
                    {
                        total = packageA;
                    }
                    else
                    {
                        additionalHours = (hours - 10);
                        total = (packageA + additionalHours * additionalA);
                    }
                }

                if (packageName == 'B' || packageName == 'b')
                {
                    if (hours > 0 && hours <= 10)
                    {
                        total = packageB;
                    }
                    else
                    {
                        additionalHours = (hours - 10);
                        total = (packageB + additionalHours * additionalB);
                    }
                }

                if (packageName == 'C' || packageName == 'c')
                {
                    total = packageC;
                }

                System.out.println("Your total charge is: " + num.format(total));
            }
            else
                {
                    System.out.println("You entered invalid number of hours");
                }
        }
        else
        {
            System.out.println("You entered an invalid letter");
        }
    }
}
