package ourbusinessproject;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Enterprise {
    @NotNull @NotBlank
    private String name;
    @NotNull @NotBlank @Length(min = 10)
    private String description;
    @NotNull @NotBlank
    private String contactName;
    @NotNull @NotBlank @Email
    private String contactEmail;


    public Enterprise() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
    }


}