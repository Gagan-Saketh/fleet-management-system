package com.telematics.fleet.service;
import com.telematics.fleet.model.Vehicle;

public class AlertEngine {
    public Vehicle processTelemetry(String id, double speed, String protocol, String dtc) {
        String severity = "NORMAL";
        if (speed > 120) {
            severity = "CRITICAL_OVERSPEEDING";
        } else if (dtc != null && !dtc.isEmpty()) {
            severity = "DIAGNOSTIC_TROUBLE_TRIGGERED";
        }
        return new Vehicle(id, speed, protocol, dtc, severity);
    }
}
