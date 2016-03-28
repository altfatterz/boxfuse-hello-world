package com.zoltanaltfatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
public class BoxfuseHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoxfuseHelloWorldApplication.class, args);
	}
}

@RestController
class HelloWorldController {

	@RequestMapping()
	String great() throws UnknownHostException {
		return "Hello World from " + InetAddress.getLocalHost().getHostAddress();
	}

}
