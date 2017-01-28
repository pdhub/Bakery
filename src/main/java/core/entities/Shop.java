package core.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by PDeb on 1/28/2017.
 */
@Entity
public class Shop {

    @Id
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
