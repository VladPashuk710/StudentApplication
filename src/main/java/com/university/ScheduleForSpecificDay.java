package com.university;

import org.springframework.beans.factory.annotation.Autowired;

public class ScheduleForSpecificDay {

    @Autowired

    private String dayOfWeek(DayOfWeek day) {
        String schedule = "";

        switch (day) {

            case Monday:
                schedule = "1 - Math" +
                        "2 - Physics " +
                        "3 - Ukrainian_Language";
                break;

            case Tuesday:
                schedule = "1 - Modeling" +
                        "2 - Economics";
                break;

            case Wednesday:
                schedule = "1 - Philosophy" +
                        "2 - Programming" +
                        "3 - History";
                break;

            case Thursday:
                schedule = "1 - Ukrainian_Literature" +
                        "2 - Math" +
                        "3 - Programming";
                break;

            case Friday:
                schedule = "No classes";
                break;

            default:
                return "ERROR";
        }

        return schedule;
    }

}

