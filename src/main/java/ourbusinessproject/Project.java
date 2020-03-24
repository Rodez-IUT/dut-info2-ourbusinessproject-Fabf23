package ourbusinessproject;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
@Entity
public class Project {



    @Id
    @GeneratedValue
    private Long id;

    @NotNull @NotBlank //@NotNull + @NotBlank = @NotEmpty
    private String title;
    private String description;
    @NotNull @ManyToOne(cascade = CascadeType.ALL)
    private Enterprise entreprise;

    public Project() { }

    public Project(Enterprise enterprise) {
        this.entreprise = enterprise;
        if (enterprise != null) {
            this.entreprise.addProject(this);
        }

    }

    public void setEnterprise(Enterprise enterprise) {
        this.entreprise = enterprise;
        if (entreprise != null) {
            this.entreprise.addProject(this);
        }
    }

    public Enterprise getEnterprise() {
        return this.entreprise;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return  description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
