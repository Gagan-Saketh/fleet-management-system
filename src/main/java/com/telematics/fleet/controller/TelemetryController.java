package com.telematics.fleet.controller;
import com.telematics.fleet.model.Vehicle;
import com.telematics.fleet.service.AlertEngine;

public class TelemetryController {
    private AlertEngine engine = new AlertEngine();

    public String getLiveDiagnostics(String vehicleId) {
        Vehicle mockData = engine.processTelemetry(vehicleId, 95.5, "OBD-II", "P0301");
        return "Telemetry Log Processed Successfully - Status: " + mockData.getStatus();
    }
}
