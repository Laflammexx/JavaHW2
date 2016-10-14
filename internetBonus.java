//Giorgi Amirajibi

import java.util.*;
import java.text.DecimalFormat;

public class internetBonus
{
    public static void main (String [] args)
    {
        double packageA = 9.95, packageB = 13.95, packageC = 19.95, additionalA = 2.0,
                additionalB = 1.0, additionalHours, total = 0.0;
        char packageName;
        int year, month, hours;
        boolean leapYear;

        Scanner keyboard = new Scanner(System.in);
        DecimalFormat num = new DecimalFormat("$ #,###.00");
        year = Calendar.getInstance().get(Calendar.YEAR);
        //System.out.println(year);
        leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        //System.out.println(leapYear);
        month = Calendar.getInstance().get(Calendar.MONTH);
        //System.out.println(month);
        System.out.println("Internet packages:\n" +
                "\tA: For $9.95 per month 10 hours of access are provided. Additional hours are $2.00 per hour.\n" +
                "\tB: For $13.95 per month 20 hours of access are provided. Additional hours are $1.00 per hour.\n" +
                "\tC: For $19.95 per month unlimited access is provided.");

        System.out.println("Please enter the letter of the internet package you have: ");
        packageName = keyboard.next().charAt(0);
        while(  packageName != 'A' && packageName != 'a' &&
                packageName != 'B' && packageName != 'b' &&
                packageName != 'C' && packageName != 'c')
        {
            System.out.println("You entered an invalid letter. Please try again.");
            packageName = keyboard.next().charAt(0);
        }

        if (    packageName == 'A' || packageName == 'a' ||
                packageName == 'B' || packageName == 'b' ||
                packageName == 'C' || packageName == 'c')
                {
                    System.out.println("Please enter number of hours: ");
                    hours = keyboard.nextInt();
                    while (hours < 0)
                    {
                        System.out.println("You entered a negative number. Please enter a positive number: ");
                        hours = keyboard.nextInt();
                    }
                    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                        while (hours > 744)
                        {
                            System.out.println("You entered the number of hours that exceeds total number of hours in one month. Please try again: ");
                            hours = keyboard.nextInt();
                        }
                        if (hours > 0 && hours <= 744) {
                            if (packageName == 'A' || packageName == 'a') {
                                if (hours > 0 && hours <= 10) {
                                    total = packageA;
                                } else {
                                    additionalHours = (hours - 10);
                                    total = (packageA + additionalHours * additionalA);
                                }
                            }
                            if (packageName == 'B' || packageName == 'b') {
                                if (hours > 0 && hours <= 10) {
                                    total = packageB;
                                } else {
                                    additionalHours = (hours - 10);
                                    total = (packageB + additionalHours * additionalB);
                                }
                            }
                            if (packageName == 'C' || packageName == 'c') {
                                total = packageC;
                            }

                            System.out.println("Your total charge is: " + num.format(total));
                        }
                    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                        while (hours > 720) {
                            System.out.println("You entered the number of hours that exceeds total number of hours in one month. Please try again: ");
                            hours = keyboard.nextInt();
                        }
                        if (hours > 0 && hours <= 720) {
                            if (packageName == 'A' || packageName == 'a') {
                                if (hours > 0 && hours <= 10) {
                                    total = packageA;
                                } else {
                                    additionalHours = (hours - 10);
                                    hours = 10;
                                    total = (packageA + additionalHours * additionalA);
                                }
                            }
                            if (packageName == 'B' || packageName == 'b') {
                                if (hours > 0 && hours <= 10) {
                                    total = packageB;
                                } else {
                                    additionalHours = (hours - 10);
                                    total = (packageB + additionalHours * additionalB);
                                }
                            }
                            if (packageName == 'C' || packageName == 'c') {
                                total = packageC;
                            }

                            System.out.println("Your total charge is: " + num.format(total));
                        }
                    } else if (month == 2 && leapYear) {
                        while (hours > 696) {
                            System.out.println("You entered the number of hours that exceeds total number of hours in one month. Please try again: ");
                            hours = keyboard.nextInt();
                        }
                        if (hours > 0 && hours <= 696) {
                            if (packageName == 'A' || packageName == 'a') {
                                if (hours > 0 && hours <= 10) {
                                    total = packageA;
                                } else {
                                    additionalHours = (hours - 10);
                                    hours = 10;
                                    total = (packageA + additionalHours * additionalA);
                                }
                            }
                            if (packageName == 'B' || packageName == 'b') {
                                if (hours > 0 && hours <= 10) {
                                    total = packageB;
                                } else {
                                    additionalHours = (hours - 10);
                                    total = (packageB + additionalHours * additionalB);
                                }
                            }
                            if (packageName == 'C' || packageName == 'c') {
                                total = packageC;
                            }
                            System.out.println("Your total charge is: " + num.format(total));
                        }
                    } else if (month == 2 && !leapYear) {
                        while (hours > 672) {
                            System.out.println("You entered the number of hours that exceeds total number of hours in one month. Please try again: ");
                            hours = keyboard.nextInt();
                        }
                        if (hours > 0 && hours <= 672) {
                            if (packageName == 'A' || packageName == 'a') {
                                if (hours > 0 && hours <= 10) {
                                    total = packageA;
                                } else {
                                    additionalHours = (hours - 10);
                                    total = (packageA + additionalHours * additionalA);
                                }
                            }
                            if (packageName == 'B' || packageName == 'b') {
                                if (hours > 0 && hours <= 10) {
                                    total = packageB;
                                } else {
                                    additionalHours = (hours - 10);
                                    hours = 10;
                                    total = (hours * packageB + additionalHours * additionalB);
                                }

                            }
                            if (packageName == 'C' || packageName == 'c') {
                                total = packageC;
                            }
                            System.out.println("Your total charge is: " + num.format(total));
                        }
                    }
                }
    }
}