package hello.world.service;

import hello.world.entity.Country;
import hello.world.entity.CountryLanguage;
import hello.world.repository.CountryRepository;
import hello.world.repository.CountryLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.lang.Exception;

import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;

	@Autowired
	private CountryLanguageRepository countryLanguageRepository;

	/**
		Get Country by Code
	**/
	public Country getCountry(String code) {
		Country country = countryRepository.findOneByCode(code);

		return country;
	}

	/**
		Get json object of Country Data
	**/
	public JSONObject getCountryByCode(String code) {
		JSONObject obj = null;
		try {
			Country country = this.getCountry(code);
			CountryLanguage country_language = countryLanguageRepository.findOneByCountryCode(code);

			  obj = new JSONObject();
			  obj.put("name", country.getName());
			  obj.put("continent", country.getContinent());
			  obj.put("population", country.getPopulation());
			  obj.put("life_expectancy", country.getLife_expectancy());
			  obj.put("country_language", country_language.getLanguage());

			  obj.toString(); 

		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
}