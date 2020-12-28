package com.company.javaTasks;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time nextSecond() {
        if ((second+=1) == 59) {

            second = 0;

            if ((minute+=1) == 59) {

                minute = 0;
                if ((hour+=1) == 24) {

                    hour = 0;
                    return this;
                }

            }

        }

        return this;
    }

    public Time previousSecond() {
        if ((second-=1) < 0) {

            second = 59;

            if ((minute-=1) < 0) {

                minute = 59;

                if ((hour-=1) < 0) {

                    hour = 23;
                    return this;

                }

            }

        }

        return this;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute,second);
    }
}
