package co.com.sofka.model.sofkagradle;
import lombok.*;

import java.lang.annotation.Documented;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class SofkaGradle  {
    private String id;
    private String nombre;
}
