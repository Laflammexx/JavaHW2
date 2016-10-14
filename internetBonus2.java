//Giorgi Amirajibi

import java.util.*;
import java.text.DecimalFormat;

public class internetBonus2
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat num = new DecimalFormat("$##,###.00");
        double packageA = 9.95, packageB = 13.95, packageC = 19.95, total = 0, additionalA = 2.0, additionalB = 1.0;
        int hours, year, month, maxNumberOfHours = 0, additionalHours;
        char packageName;
        boolean leapYear;
        year = Calendar.getInstance().get(Calendar.YEAR);
        month = Calendar.getInstance().get(Calendar.MONTH);
        month = month + 1;
        leapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        System.out.println("Please enter name of the package you have: ");
        packageName = keyboard.next().charAt(0);
        if (packageName == 'C' || packageName == 'c')
        {
            System.out.println("Your total charge is: " + num.format(packageC));
        }
        else
        {
            do
            {
                if (    packageName != 'A' && packageName != 'a' &&
                        packageName != 'B' && packageName != 'b')
                {
                    System.out.println("You entered an incorrect letter for internet package. Please try again.");
                    packageName = keyboard.next().charAt(0);
                }
            }
            while ( packageName != 'A' && packageName != 'a' &&
                    packageName != 'B' && packageName != 'b');

            System.out.println("Please enter the number of hours you have used the internet: ");
            hours = keyboard.nextInt();
            do
            {
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                {
                    maxNumberOfHours = 744;
                    if (hours < 0 || hours > maxNumberOfHours)
                    {
                        System.out.println("You entered a number which is either less than zero or exceeds " +
                                           "the possible number of hours in one month. Please try again.");
                        hours = keyboard.nextInt();
                    }
                }
                else if (month == 4 || month == 6 || month == 9 || month == 11)
                {
                    maxNumberOfHours = 720;
                    if (hours < 0 || hours > maxNumberOfHours)
                    {
                        System.out.println("You entered a number which is either less than zero or exceeds " +
                                           "the possible number of hours in one month. Please try again.");
                        hours = keyboard.nextInt();
                    }
                }
                else if (month == 2 && leapYear)
                {
                    maxNumberOfHours = 696;
                    if (hours < 0 || hours > maxNumberOfHours)
                    {
                        System.out.println("You entered a number which is either less than zero or exceeds " +
                                           "the possible number of hours in one month. Please try again.");
                        hours = keyboard.nextInt();
                    }
                }
                else if (month == 2 && !leapYear)
                {
                    maxNumberOfHours = 672;
                    if (hours < 0 || hours > maxNumberOfHours)
                    {
                        System.out.println("You entered a number which is either less than zero or exceeds " +
                                           "the possible number of hours in one month. Please try again.");
                        hours = keyboard.nextInt();
                    }
                }
            }
            while(hours < 0 || hours > maxNumberOfHours);

            switch (packageName)
            {
                case 'A':case 'a' : additionalHours = hours - 10; total = packageA + additionalHours * additionalA;
                                    System.out.println("Your total charge is: " + num.format(total));
                break;
                case 'B':case 'b' : additionalHours = hours - 20; total = packageB + additionalHours * additionalB;
                                    System.out.println("Your total charge is: " + num.format(total));
                break;
                default: System.out.println("If you made this default work please explain to me how you did that.");
            }
        }
    }
}