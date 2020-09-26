package io.github.mathsferro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Essa classe será controllador Rest, poderemos mandar mensagem para o browser atraves dessa classe
public class VendasApplication {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);  // Primeiro parametro é a classe que vai inicializar a aplicação com spring, e o segunda parametro são os argumentos
    }
}
