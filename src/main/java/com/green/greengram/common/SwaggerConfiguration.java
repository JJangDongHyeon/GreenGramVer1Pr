package com.green.greengram.common;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
@OpenAPIDefinition(
        info = @Info(
                title = "그린그램"
                , description = "GreenGram with React"
                , version = "v1"
        )
)
public class SwaggerConfiguration {
}
