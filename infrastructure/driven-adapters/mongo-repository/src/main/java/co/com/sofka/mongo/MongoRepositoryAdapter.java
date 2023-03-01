package co.com.sofka.mongo;

import co.com.sofka.model.sofkagradle.SofkaGradle;
import co.com.sofka.model.sofkagradle.gateways.SofkaGradleRepository;
import co.com.sofka.mongo.document.SofkaGradleDocument;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class MongoRepositoryAdapter implements SofkaGradleRepository

{

   private final MongoDBRepository mongoDBRepository;

    public MongoRepositoryAdapter(MongoDBRepository mongoDBRepository) {
        this.mongoDBRepository = mongoDBRepository;
    }

    @Override
    public Mono<SofkaGradle> findByNombre(String id) {
        return null;
    }

    @Override
    public Mono<SofkaGradle> create(SofkaGradle sofkaGradle) {
        SofkaGradleDocument sofka = SofkaGradleDocument.builder()
                .nombre(sofkaGradle.getNombre()).build();

        return this.mongoDBRepository.save(sofka).map(document->{
            return SofkaGradle.builder().id(document.getId())
                    .nombre(document.getNombre()).build();
        });
    }
}
