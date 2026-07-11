package com.telematics.fleet.model;

public class VehicleTelemetry {
    private String vin;
    private double speed;
    private double coolantTemp;
    private double fuelLevel;
    private String dtc;

    public VehicleTelemetry(String vin, double speed, double coolantTemp, double fuelLevel, String dtc) {
        this.vin = vin;
        this.speed = speed;
        this.coolantTemp = coolantTemp;
        this.fuelLevel = fuelLevel;
        this.dtc = dtc;
    }
    public String getVin() { return vin; }
    public double getSpeed() { return speed; }
    public double getCoolantTemp() { return coolantTemp; }
    public double getFuelLevel() { return fuelLevel; }
    public String getDtc() { return dtc; }
}
