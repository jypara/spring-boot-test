package hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;

import hello.world.service.CountryService;


import java.util.*;
import org.json.simple.JSONObject;

@SpringBootApplication
@RestController
public class Application {

	@Autowired
    private CountryService countryService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "WELCOME TO TEST PAGE";
	}

	@RequestMapping(value = "/{code}",method = RequestMethod.GET)
	@ResponseBody
	public JSONObject getCountryByCode(@PathVariable("code") String code) {
		
		return countryService.getCountryByCode(code);
	}

}
