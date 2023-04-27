package br.com.erudio.data.vo.v1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;

import java.io.Serializable;

// Para ordenar os campos na chamada
@JsonPropertyOrder({"id", "address", "first_name", "last_name", "gender", })
public class PersonVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    @JsonProperty("first_name")
    private String firstName;

    // Para alterar o nome do campo na chamada
    @JsonProperty("last_name")
    private String lastName;

    private String address;

    // Para ignorar o campo na chamada
    @JsonIgnore
    private String gender;

    public PersonVO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
