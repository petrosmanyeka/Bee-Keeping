package Mapo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public  class SwagConf {
    @Bean
    @Primary
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2).select().build();
    }


}