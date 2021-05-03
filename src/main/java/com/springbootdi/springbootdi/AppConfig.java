package com.springbootdi.springbootdi;

import com.springbootdi.springbootdi.models.service.IServicio;
import com.springbootdi.springbootdi.models.service.MiServicio;
import com.springbootdi.springbootdi.models.service.MiServicioComplejo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

	@Bean("miServicioSimple")
	@Primary
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}

	@Bean("miServicioComplejo")
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
}
