package br.com.alura.forum.config.swagger;

import br.com.alura.forum.model.Usuario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.*;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.schema.ModelSpecification;
import springfox.documentation.service.ParameterType;
import springfox.documentation.service.RequestParameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.service.ParameterSpecification.*;

import java.util.Arrays;

@Configuration
public class SwaggerConfigurations {

    @Bean
    public Docket forumApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.alura.forum"))
                .paths(PathSelectors.ant("/**"))
                .build()
                .ignoredParameterTypes(Usuario.class)
                .globalRequestParameters(Arrays.asList(new RequestParameterBuilder()
                                .name("Authorization")
                                .description("Header para token JWT")
                                .in(ParameterType.HEADER)
                                .required(false)
                                .build()));
    }
}
