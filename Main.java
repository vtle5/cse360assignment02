/**
 * This is the driver for usage and testing of the package
 * it will also check for correct command input
 *
 * @author  Vincent Le
 * @date    October 5, 2020
 */
import cse360assignment02.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        AddingMachine calc = new AddingMachine();
        Scanner scan = new Scanner(System.in);
        String str;
        String[] arg = new String[2];
        arg[0]="";          //so we can pass the first while

        printHelp();        //prints the first help text
        while (!arg[0].equals("quit"))
        {
            System.out.println("Enter a command:");
            str=scan.nextLine();
            arg = str.split(" ",2);     //split up input
            switch (arg[0].toLowerCase())
            {
                case "add":
                    if (parseArg(arg))      //check for a second input and ensure it is an int
                    {
                        calc.add(Integer.parseInt(arg[1]));     //add and print total
                        System.out.println("Total is: "+calc.getTotal());
                    }else{
                        System.out.println("Please input an integer");
                    }
                    break;
                case "subtract":
                    if (parseArg(arg))      //check for a second input and ensure it is an int
                    {
                        calc.subtract(Integer.parseInt(arg[1]));     //add and print total
                        System.out.println("Total is: "+calc.getTotal());
                    }else{
                        System.out.println("Please input an integer");
                    }
                    break;
                case "history":
                    System.out.println(calc.toString());    //prints history
                    break;
                case "clear":
                    calc.clear();
                    System.out.println("Cleared history."); //clears history
                    break;
                case "help":
                    printHelp();    //prints out the help text
                    break;
                case "quit":        //does nothing, will exit on next loop
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }

        }
    }

    /**
     * This method prints out the commands available
     */
    public static void printHelp()
    {
        System.out.println("Commands are:\nadd 'value'\nsubtract 'value'\nhistory, clear, help\nquit");
    }

    /**
     * This method will check an array of inputs and check if the second one is an integer.
     * @param arr The array to check
     * @return boolean returns if there is an integer as a second input
     */
    public static boolean parseArg(String[] arr)
    {
        if (arr.length<2)
            return false;

        if(arr[1].isEmpty())
            return false;

        try {
            Integer.parseInt(arr[1]);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
