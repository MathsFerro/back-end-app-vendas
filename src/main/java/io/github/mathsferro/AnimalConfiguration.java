package io.github.mathsferro;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConfiguration {

    @Bean (name = "cachorro")
    public Animal cachorro() {
        return new Animal() {
            public void fazerBarulho() {
                System.out.println("AuAu");
            }
        };
    }

    @Bean (name = "gato")
    public Animal gato() {
        return new Animal() {
            public void fazerBarulho() {
                System.out.println("Miau");
            }
        };
    }

}
