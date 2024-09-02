package com.github.theAllBlack;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TheAllBlackApplication {
		int durationMetric=34;
		int contractValue=90000;
		String race="Demi-god";
		boolean particlesHarnessed=false;
		String moniker="Denny da Vjncj";

	public static void main(String[] args) {
		SpringApplication.run(TheAllBlackApplication.class, args);

		System.out.println(moniker+" is set for evolution in approximately "+contractValue+" hours");
	}

}
/*
- address port 8080, which is already in use [x]
- I used the "jps" command to identify the active port & reassign it.
- java is case sensitive
- each word of a class must be capitalized. Pascal case
- the main() holds all the instructions that our program is to execute
- 'out', is an object, responsible for various types of output. Objects are packages of state & behavior, typically modeled on real-world concepts.
- System represents the machine, that our program is running on.
 */
