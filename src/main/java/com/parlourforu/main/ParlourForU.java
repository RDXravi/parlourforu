/**
 * 
 */
package com.parlourforu.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author Dixit
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.parlourforu"})
@EnableMongoRepositories(basePackages="com.parlourforu.repository")
public class ParlourForU {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        SpringApplication.run(ParlourForU.class, args);
    }

}
