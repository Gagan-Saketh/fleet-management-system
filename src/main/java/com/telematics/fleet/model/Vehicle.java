package com.telematics.fleet.model;

public class Vehicle {
    private String vehicleId;
    private double speed;
    private String obdProtocol;
    private String dtcCode;
    private String status;

    public Vehicle(String vehicleId, double speed, String obdProtocol, String dtcCode, String status) {
        this.vehicleId = vehicleId;
        this.speed = speed;
        this.obdProtocol = obdProtocol;
        this.dtcCode = dtcCode;
        this.status = status;
    }

    public String getVehicleId() { return vehicleId; }
    public double getSpeed() { return speed; }
    public String getObdProtocol() { return obdProtocol; }
    public String getDtcCode() { return dtcCode; }
    public String getStatus() { return status; }
}
