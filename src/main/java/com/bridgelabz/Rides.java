package com.bridgelabz;

public class Rides {
    public double distance;
    public double time;
    public boolean isPremium;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean isPremium) {
        this.isPremium = isPremium;
    }



    public Rides(double distance, double time) {
        super();
        this.distance = distance;
        this.time = time;
        this.isPremium = isPremium;
    }
}
