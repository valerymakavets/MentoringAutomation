package com.epam.learning;

public enum Month {

    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");

    private String name;

    Month(String name) {
        this.name = name;
    }

    public static String getMonthName(String enteredValue) {
        int index = Integer.parseInt(enteredValue) - 1;
        return Month.values()[index].name;
    }
}
