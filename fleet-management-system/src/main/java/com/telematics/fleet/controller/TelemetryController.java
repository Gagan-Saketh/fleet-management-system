package com.telematics.fleet.controller;
import com.telematics.fleet.model.VehicleTelemetry;
import com.telematics.fleet.service.AlertEngine;
import java.util.List;

public class TelemetryController {
    private AlertEngine alertEngine = new AlertEngine();
    public void processIncomingStream(String vin, double speed, double temp, double fuel, String dtc) {
        VehicleTelemetry packet = new VehicleTelemetry(vin, speed, temp, fuel, dtc);
        System.out.println("Inbound CAN Bus Packet Captured via OBD-II Gateway - Vehicle: " + packet.getVin());
        List<String> insights = alertEngine.evaluateAlerts(packet);
        System.out.println("Active Telemetry Engine Warnings Generated:");
        for (String alert : insights) {
            System.out.println("  - " + alert);
        }
    }
}
