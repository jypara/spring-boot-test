package hello.world.uniTest;

import org.hamcrest.Matchers;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.junit.jupiter.api.Assertions.*;

import javax.ws.rs.*;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import hello.world.entity.Country;
import hello.world.service.CountryService;

import javax.persistence.*;

import hello.Application;

@WebMvcTest(Application.class)
public class WebMockTest {

	@Autowired
	private MockMvc mockMvc;

	private Country country;

	private EntityManager entityManager;

	@Autowired
    private CountryService countryServiceMock;


	@Test
	public void getCountryDataTest() throws Exception {
		when(entityManager.find(Country.class,"BHR")).thenReturn(null);
		
			String code = countryServiceMock.getCountry("BHR").getCode();
			assertEquals("BHR",code);
	}

	 @Test
    public void findByCode_CountryNotFound_ShouldReturnHttpStatusCode404() throws Exception {
        when(countryServiceMock.getCountry("NULL")).thenThrow(new InternalServerErrorException("INVALID_COUNTRY_CODE"));
 
        mockMvc.perform(get("/{code}", 1L))
                .andExpect(status().isNotFound());
    }
}
