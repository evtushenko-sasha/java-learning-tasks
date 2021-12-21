package com.teachmeskills.lesson7.task2;

public class Main {
    public static void main(String[] args) {
        MonitoringSystem monitoringSystem = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Start monitoring");
            }
        };

        monitoringSystem.startMonitoring();

        SecurityMonitoringSystem securityMonitoringSystem = new SecurityMonitoringSystem();
        securityMonitoringSystem.startMonitoring();

    }
}
