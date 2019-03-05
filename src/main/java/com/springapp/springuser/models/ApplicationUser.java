package com.springapp.springuser.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="user", uniqueConstraints={@UniqueConstraint(columnNames={"username"})})
public class ApplicationUser {
    @Id
    @GeneratedValue
    private int id;

    private String firstName;
    private String lastName;
    private String email;
    @Column(unique = true, length = 20)
    private String username;
    private String password;

    @Transient
    @JsonIgnore
    private String confirmPassword;

    @ManyToMany
    @JsonIgnore
    private Set<UserRole> userRoles;
}
