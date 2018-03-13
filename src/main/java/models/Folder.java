package models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="folders")
public class Folder {

    private int id;
    private String name;
    private Set<File> files;

    public Folder() {
    }

    public Folder(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "folder", fetch = FetchType.EAGER)
    public Set<File> getFiles() {
        return files;
    }

    public void setFiles(Set<File> files) {
        this.files = files;
    }
}
