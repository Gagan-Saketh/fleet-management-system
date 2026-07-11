package com.telematics.fleet.service;
import com.telematics.fleet.model.VehicleTelemetry;
import com.telematics.fleet.config.TelemetryConfig;
import java.util.ArrayList;
import java.util.List;

public class AlertEngine {
    public List<String> evaluateAlerts(VehicleTelemetry data) {
        List<String> alerts = new ArrayList<>();
        if (data.getSpeed() > TelemetryConfig.ALERT_SPEED_LIMIT_WARNING) {
            alerts.add("?? CRITICAL_OVERSPEEDING");
        }
        if (data.getCoolantTemp() > TelemetryConfig.ALERT_ENGINE_TEMP_CRITICAL) {
            alerts.add("??? ENGINE_OVERHEAT_CRITICAL");
        }
        if (data.getFuelLevel() < 10.0) {
            alerts.add("? FUEL_LEVEL_LOW");
        }
        if (data.getDtc() != null && !data.getDtc().equalsIgnoreCase("None")) {
            alerts.add("?? FAULT_DETECTED: " + data.getDtc());
        }
        if (alerts.isEmpty()) alerts.add("? SYSTEM_NORMAL");
        return alerts;
    }
}
