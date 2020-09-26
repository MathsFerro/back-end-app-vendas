package io.github.mathsferro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/* @ComponentScan( basePackages = { "nome_do_pacote.nome_da_classe"}) Serve para especificar os componentes e objetos que vão ser escaneados, é recomendado usar quando vamos usar biblioteca externa que precisa de Scan */
@SpringBootApplication
@RestController // Essa classe será controllador Rest, poderemos mandar mensagem para o browser atraves dessa classe
public class VendasApplication {

    @Autowired
    @Qualifier("applicationName")
    private String applicationName;

    @GetMapping("/hello")
    public String helloWorld() {
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);  // Primeiro parametro é a classe que vai inicializar a aplicação com spring, e o segunda parametro são os argumentos
    }
}
