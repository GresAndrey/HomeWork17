package org.example;

public class Main {
    public static void main(String[] args) {

        WorkingScheduleBuilder mySchedule = new WorkingScheduleBuilder();

        mySchedule.build();

        mySchedule.setSize(10);
        mySchedule.workDays(5);
        mySchedule.dayOff();
        mySchedule.workDay();

        mySchedule.build();

    }
}
