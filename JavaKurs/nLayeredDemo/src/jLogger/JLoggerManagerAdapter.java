package jLogger;

import Core.LoggerService;

public class JLoggerManagerAdapter implements LoggerService {
    @Override
    public void logToSystem(String message) {
        JLoggerManager manager= new JLoggerManager(); //burada newleyebiliyoruz
        manager.log(message);
    }
}
