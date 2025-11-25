package com.kreitek.pets.infraestructure.logger;

public final class LoggerService {
    private static LoggerService instance;
    private Number logCount;

    private LoggerService() {
        if (instance != null) {
            throw new RuntimeException("Usage getInstance() method to create");
        }
    }

    public static LoggerService getInstance() {
        if (instance == null) {
            synchronized (LoggerService.class) {
                if (instance == null) {
                    instance = new LoggerService();
                }
            }
        }
        return instance;
    }

    public void debug(String message) {
        if (logCount == null) {
            logCount = 1;
        } else {
            logCount = logCount.intValue() + 1;
        }
        System.out.println("[debug]["+ logCount+ "] - " + message);
    }
}
