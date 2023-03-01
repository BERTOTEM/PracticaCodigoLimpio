package co.com.sofka.mongo.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Sofka")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder(toBuilder = true)
public class SofkaGradleDocument {
    @Id
    private String id;
    private String nombre;

}
