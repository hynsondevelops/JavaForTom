/***************************
 This program takes a start time and time elapsed (both from user input) and produces the final time.
 (24 HOUR CLOCK VERSION)
 **********************************************/

import java.util.Scanner;
public class HW2d {

    public static void main(String[] args) {


        //CONSTANTS:
        final int MIN_IN_HOUR = 60;
        final int HOURS_IN_DAY = 24; //for use with 24-hour clock
        final int HOURS_IN_HALF_DAY = 12; //for use with 12-hour clock
        //
        String startTime;
        int startHour;    //starting hour
        int startMin;     //starting min
        int elapsedHour;   //elapsed hours
        int elapsedMin;      //elapsed min
        int endHour;
        int endMin;
        String ampm; //specifies am/pm in final output


        System.out.print("Enter starting time in hours and minutes, separated by a space: ");
        //scan.useDelimiter(":");
        Scanner scanIn = new Scanner(System.in);
        String startTimeS = scanIn.next();
        if (startTimeS.length() == 4) // one digit hour
        {
            startHour = Integer.parseInt(startTimeS.substring(0, 1));
            startMin = Integer.parseInt(startTimeS.substring(2, 4));
        }
        else
        {
            startHour = Integer.parseInt(startTimeS.substring(0, 2));
            startMin = Integer.parseInt(startTimeS.substring(3, 5));
        }


        System.out.print("(12hr) The time is now " + startHour + ":" + startMin + "\n");


    }
}