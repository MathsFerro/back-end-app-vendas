package io.github.mathsferro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Quando adiciona o Configuration ela passa a ser escaneada pelo SpringBoot e vai aplicar as configurações dentro dela
public class AppConfiguration {

    // Ele vai criar esse ojeto no contexto da aplicação pra utilizar onde eu precisar na aplicação
    @Bean(name = "applicationName")
    public String applicationName() {
        return "Aplicação Sistema de Vendas";
    }
}
