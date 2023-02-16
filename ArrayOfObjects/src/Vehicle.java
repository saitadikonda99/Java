package com.sai.prob12set2;

public class Vehicle {

    private int vehicleNO;
    private int wheeler;
    private long mobile;
    private String name;



    public Vehicle( int vehicleNO , int wheeler, long mobile, String name) {
        this.vehicleNO = vehicleNO;
        this.wheeler   = wheeler;
        this.name      = name;
        this.mobile    = mobile;
    }

    @Override
    public String toString() {
        return "Vehicle : " + " \n" +
                "vehicleNO = " + vehicleNO + " \n" +
                "wheeler   = " + wheeler + " \n" +
                "mobile    = " + mobile + " \n" +
                "name      = " + name + "\n";
    }

    public int getVehicleNO() {
        return vehicleNO;
    }
}
