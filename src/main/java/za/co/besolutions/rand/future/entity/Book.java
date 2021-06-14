package za.co.besolutions.rand.future.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter @RequiredArgsConstructor @NoArgsConstructor @ToString
public class Book {

    @Id
    @GeneratedValue
    long id;

    @NonNull
    String name;

    @NonNull
    String author;
}
