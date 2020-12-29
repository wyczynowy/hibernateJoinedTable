package pl.dawidkozub.hibernateJoinedTable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "PETS")
@PrimaryKeyJoinColumn(name = "PET_ID")
public class Pet extends Animal {

    @Column(name = "NAME")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
