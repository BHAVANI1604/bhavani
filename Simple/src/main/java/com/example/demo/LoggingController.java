package com.example.demo;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class LoggingController {
	private static Logger logger=LoggerFactory.getLogger(LoggingController.class);

	@RequestMapping("/")
	public String index() {
		logger.trace("A trace message");
		logger.debug("debud message");
		logger.info("information");
		logger.warn("warn message");
		logger.error("error message");
		return "sample";
		
	}

}
