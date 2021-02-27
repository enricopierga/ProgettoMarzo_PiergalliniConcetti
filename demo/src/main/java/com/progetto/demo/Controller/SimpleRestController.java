package com.progetto.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.progetto.demo.Model.HelloWorldClass;

@RestController


public class SimpleRestController {
	@GetMapping("/hello")
    public HelloWorldClass exampleMetho(@RequestParam(name="param1", defaultValue="World")String Param1) {
		return new HelloWorldClass("Adriano","Mancini");
	}
}
