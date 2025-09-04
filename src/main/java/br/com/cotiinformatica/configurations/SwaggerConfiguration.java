package br.com.cotiinformatica.configurations;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Produtos - Desenvolvida por Kaio Muniz")
                        .version("1.0")
                        .description("Documentação da API desenvolvida por Kaio Muniz. " +
                                "Este projeto faz parte do portfólio e tem como objetivo demonstrar habilidades em Spring Boot, Java e boas práticas de desenvolvimento.")
                        .contact(new Contact()
                                .name("Kaio Muniz")
                                .url("https://www.linkedin.com/in/kaiomuniz")
                                .email("kkaioribeiro@gmail.com"))
                        .license(new License()
                                .name("Licença MIT")
                                .url("https://opensource.org/licenses/MIT")))
                .servers(List.of(
                        new Server().url("http://localhost:8081").description("Ambiente de Desenvolvimento"),
                        new Server().url("https://github.com/KaioMuniz").description("Portfólio no GitHub")
                ));
    }
}
