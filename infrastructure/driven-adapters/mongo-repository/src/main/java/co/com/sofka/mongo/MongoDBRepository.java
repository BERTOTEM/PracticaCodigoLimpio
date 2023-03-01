package co.com.sofka.mongo;

import co.com.sofka.model.sofkagradle.SofkaGradle;
import co.com.sofka.mongo.document.SofkaGradleDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoDBRepository extends ReactiveMongoRepository<SofkaGradleDocument,String> {

}
