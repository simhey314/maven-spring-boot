package de.heyden.simon.springboot.controller;

import de.heyden.simon.model.ShippingAdress;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ExampleController {

	@RequestMapping("/")
	public ShippingAdress getIndex(){
		ShippingAdress result = new ShippingAdress();
		result.setCountryName("Country: Germany");
		result.setLocality("Locality: Berlin");
		result.setRegion("Region: Berlin");
		result.setExtendedAddress("Ext.Address: EG rechts");
		result.setStreetAddress("StreetAddress: Sodtkestr. 44");
		result.setPostalCode("PostalCode: 10409");
		result.setPostOfficeBox("PostOfficeBox: ---");
		result.setAdditionalProperty("company", "Company: Heydensoft");
		return result;
	}
}
