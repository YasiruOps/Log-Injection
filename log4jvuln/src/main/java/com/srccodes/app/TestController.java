package com.srccodes.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class TestController {
	private static final Logger LOGGER = LogManager.getLogger(TestController.class);
	
	@GetMapping("/vuln")
	public String test(@RequestParam("userInput") String userInput) {
		LOGGER.info("User Input"+ userInput);
		return "{}";
	}

}
