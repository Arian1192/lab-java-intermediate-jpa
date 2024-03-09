package model;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Name {
    private String Salutation;
    private String firstName;
    private String middleName;
    private String lastName;
}
