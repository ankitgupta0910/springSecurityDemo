package springsecurity.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by ankitgupta on 6/4/17.
 */
@Entity
public class Role {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    Role() {}

    public Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
