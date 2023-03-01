package co.com.sofka.api;

import co.com.sofka.model.sofkagradle.SofkaGradle;
import co.com.sofka.usecase.prueba.PruebaUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterRest {

    @Bean
    public RouterFunction<ServerResponse> routerFunction(PruebaUseCase pruebaUseCase) {
        return route(POST("/api/usecase/path"), request -> pruebaUseCase.create(request.bodyToMono(SofkaGradle.class))
                .flatMap(sofkaGradle -> ServerResponse.ok().bodyValue(sofkaGradle)));
}
}