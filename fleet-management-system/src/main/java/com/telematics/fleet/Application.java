package com.telematics.fleet;
import com.telematics.fleet.controller.TelemetryController;

public class Application {
    public static void main(String[] args) {
        System.out.println("=========================================================");
        System.out.println("?? Fleet Management Platform - Real-Time Java Telematics");
        System.out.println("=========================================================");
        TelemetryController controller = new TelemetryController();
        controller.processIncomingStream("VIN9978X", 135.5, 118.0, 8.5, "P0301");
    }
}
