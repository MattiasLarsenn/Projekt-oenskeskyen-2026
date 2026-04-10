package org.example.oenskeskyen2026;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class OenskeSkyen2026Application
{
	public static void main(String[] args)
    {
		SpringApplication.run(OenskeSkyen2026Application.class, args);
	}

}
