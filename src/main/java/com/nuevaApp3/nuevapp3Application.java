package com.nuevaApp3;

import com.nuevaApp3.modelos.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
public class nuevapp3Application {

	@GetMapping("/hello")
	public String hello(){
		return "Hola Ciclo 3... Saldremos vivos de esto!";
	}

	@GetMapping("/test")
	public String test(){
		Empresa emp = new Empresa("SOLAR SAS", "Calle la geta", "3213213211","800212132-3");
		emp.setNombre("SOLAR LTDA");
		return emp.getNombre();
	}

	public static void main(String[] args) {
		SpringApplication.run(nuevapp3Application.class, args);
	}

}
