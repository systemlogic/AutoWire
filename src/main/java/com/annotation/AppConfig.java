package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.annotation.bean.Address;
import com.annotation.bean.OfficeAddress;
import com.annotation.bean.UIDA;

@Configuration
public class AppConfig {
	@Bean
	public UIDA myService(){
		return new UIDA();
	}
	@Bean
	public Address myAddress(){
		return new Address("Pawani Oakridge","Karanataka");
	}
	@Bean(name="officeBean1")
	public OfficeAddress myOfficeAddress1(){
		return new OfficeAddress("Sapient","Karanataka");
	}
	@Bean(name="officeBean2")
	public OfficeAddress myOfficeAddress2(){
		return new OfficeAddress("IBM","Karanataka");
	}
}
