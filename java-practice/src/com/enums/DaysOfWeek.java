package com.enums;

public enum DaysOfWeek {
    MONDAY("Monday",1),
    TUESDAY("Tuesday",2),
    WEDNESDAY("Wednesday",3),
    THURSDAY("Thursday",4),
    FRIDAY("Friday",5),
    SATURDAY("Saturday",6),
    SUNDAY("Sunday",7);

    private final String fullName;
    public final int nrOfDay;

    private DaysOfWeek(String fullName, int nrOfDay){
        this.fullName = fullName;
        this.nrOfDay = nrOfDay;
    }

    public String getFullName(){
        return fullName;
    }
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}
