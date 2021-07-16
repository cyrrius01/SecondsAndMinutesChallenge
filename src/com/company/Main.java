package com.company;

public class Main {

    public static void main(String[] args) {

        String statement = getDurationString(90, 30);
        System.out.println(statement);

        String statement2 = getDurationString(90);
        System.out.println(statement2);

    }

    public static String getDurationString(int minutes, int seconds) {

        if((minutes >= 0) && (seconds >= 0 && seconds <= 59)) {

            int hours = minutes / 60;
            minutes = minutes % 60;


            String statement = hours + "h " + minutes + "m " + seconds + " s";
            return statement;
        } else {
            String statement = "Invalid value";
            return statement;
        }
    }

    public static String getDurationString(int seconds) {
        if(seconds >= 0) {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            return getDurationString(minutes, seconds);

        } else {
            String statement = "Invalid value";
            return statement;
        }
    }
}
