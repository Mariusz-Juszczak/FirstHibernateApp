package hibernatetraining.training1;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Tourist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "You have to provide name")
    private String first;

    @NotBlank(message = "You have to provide last name")
    private String last;
    private String country;

    public Tourist() {
    }

    public Tourist(String first, String lastName, String country) {
        this.first = first;
        this.last = lastName;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
