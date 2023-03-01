package co.com.sofka.model.sofkagradle.gateways;

import co.com.sofka.model.sofkagradle.SofkaGradle;
import reactor.core.publisher.Mono;

public interface SofkaGradleRepository  {
    Mono<SofkaGradle> findByNombre(String id);
    Mono<SofkaGradle> create(SofkaGradle sofkaGradle);
}
