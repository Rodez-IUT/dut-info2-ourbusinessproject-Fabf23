package ourbusinessproject;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Project {
    @NotNull @NotBlank // @NotNull + @NotBlank = @NotEmpty
    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
