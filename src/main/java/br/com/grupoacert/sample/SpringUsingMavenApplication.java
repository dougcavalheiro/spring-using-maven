package br.com.grupoacert.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.grupoacert.test.SimpleArtifactApp;


@SpringBootApplication
public class SpringUsingMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringUsingMavenApplication.class, args);
		SimpleArtifactApp.greet("Parabéns papai Cezar");
	}
}
