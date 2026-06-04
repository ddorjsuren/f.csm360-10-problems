package com.bod2;

public class TimeConverter {
    private final int seconds;
    private final int minutes;
    private final int hours;

    public TimeConverter(int seconds) {
        this.seconds = seconds % 60;
        this.minutes = (seconds / 60) % 60;
        this.hours = seconds / 3600;
    }
    public int getSeconds() {
        return seconds;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getHours() {
        return hours;
    }
}
