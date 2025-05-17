package com.uol_challenge.app.bootConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootMessage implements CommandLineRunner {
    @Value("${server.port}")
    private String port;

    public void run(String[] args) throws Exception {
        System.out.println("Server running on port " + port + "!");
    }
}
