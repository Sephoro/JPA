package za.co.besolutions.rand.future.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter @RequiredArgsConstructor @NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private long id;

    @NonNull
    private String fullNames;

    @NonNull
    private String role;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullNames='" + fullNames + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
