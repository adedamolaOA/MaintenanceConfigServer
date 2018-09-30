package com.intlipms.MaintenanceConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MaintenanceConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaintenanceConfigServerApplication.class, args);
	}
}
