package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan(basePackages = {"com.dao"})
public class SpringbootSchemaApplication extends SpringBootServletInitializer{

 	static String LinuxCmd = "xdg-open";
	static String WindowsCmd = "cmd /c start";
	static String IndexUrl = "http://localhost:8080/springboott7atu/front/index.html";

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSchemaApplication.class, args);
		String OsCmd = LinuxCmd;
		try {
			Runtime.getRuntime().exec(String.join(" ", OsCmd, IndexUrl));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder.sources(SpringbootSchemaApplication.class);
    }
}
