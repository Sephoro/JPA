package za.co.besolutions.rand.future.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.besolutions.rand.future.entity.Book;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class BooksController {

    @GetMapping(value = "/books")
    public List<Book> getAllBooks(){
        return Collections.singletonList(new Book("Keeping The Faith", "Elias Sepuru"));
    }
}
