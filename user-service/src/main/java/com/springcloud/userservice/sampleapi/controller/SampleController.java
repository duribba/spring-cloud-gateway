package com.springcloud.userservice.sampleapi.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	//@RequestMapping(value = "/user-service/test", method = RequestMethod.GET)
	@GetMapping(value = "/user-service/test")
	public ResponseEntity<Map<String, String>> sample() {
        ResponseEntity<Map<String, String>> response = null;

        Map<String, String> resMap = new HashMap<String, String>();
        resMap.put("type", "user-service client!");
        resMap.put("message", "Spring Cloud is awesome!");

        response = new ResponseEntity<Map<String, String>>(resMap, HttpStatus.OK);

        return response;		
	}
}
