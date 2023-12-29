package guru.springframework.spring6webapp.domain;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author author)) return false;

        return Objects.equals(id, author.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
