package lt.codeacademy.emenuapi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI api() {
        return new OpenAPI().info(createInfo());
    }

    private Info createInfo() {
        return new Info().title("Emenu API")
                .description("Code academy emenu")
                .version("1.0")
                .contact(createContact());
    }

    private Contact createContact() {
        Contact contact = new Contact();
        contact.setName("Jolita Vekteriene");
        contact.setEmail("ginjolita@gmail.com");
        contact.setUrl("codeacademy.lt");
        return contact;
    }
}
