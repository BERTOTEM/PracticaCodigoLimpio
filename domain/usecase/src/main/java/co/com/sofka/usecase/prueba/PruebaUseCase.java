package co.com.sofka.usecase.prueba;

import co.com.sofka.model.sofkagradle.SofkaGradle;
import co.com.sofka.model.sofkagradle.gateways.SofkaGradleRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class PruebaUseCase {
    private final SofkaGradleRepository repository;
    public Mono<SofkaGradle> findByNombre(String name){
        return repository.findByNombre(name);
    }
    public  Mono<SofkaGradle>create(Mono<SofkaGradle> sofkaGradleMono){
        return sofkaGradleMono.flatMap(sofkaGradle -> this.repository.create(sofkaGradle));
    }



}
