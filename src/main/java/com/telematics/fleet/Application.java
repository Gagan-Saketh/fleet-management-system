package com.telematics.fleet;
import com.telematics.fleet.controller.TelemetryController;

public class Application {
    public static void main(String[] args) {
        System.out.println("Initializing Connected-Vehicle Telematics Backend Service Pipeline...");
        TelemetryController controller = new TelemetryController();
        String response = controller.getLiveDiagnostics("KA-03-MK-7799");
        System.out.println(response);
    }
}
