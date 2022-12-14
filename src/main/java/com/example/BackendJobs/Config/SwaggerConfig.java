package com.example.BackendJobs.Config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("Backend Jobs").apiInfo(apiInfo()).select()
				.paths(regex("/jobs.*")).build();
		//.paths(PathSelectors.any()).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Backend Jobs")
				.description("Sample Documentation Generateed Using SWAGGER2 for Backend Jobs")
				.termsOfServiceUrl("URL")
				.license("License")
				.licenseUrl("License URL").version("1.0").build();
	}
}
