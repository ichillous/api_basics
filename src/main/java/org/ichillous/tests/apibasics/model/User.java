package org.ichillous.tests.apibasics.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    @NotNull
    @Size(min = 1)
    private String username;

    @Column(name = "first_name", nullable = false)
    @NotNull
    @Size(min = 1)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    @NotNull
    @Size(min = 1)
    private String lastName;

    @Column(nullable = false, unique = true)
    @NotNull
    @Size(min = 6)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(name = "created_at", nullable = false, updatable = false)
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "updated_at", nullable = false)
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public User() {
            this.id = 0L;
            this.username = "default";
            this.firstName = "default";
            this.lastName = "default";
            this.email = "default@email.com";
            this.password = "defaultPassword";
            this.createdAt = new Date();
            this.updatedAt = new Date();
    }

    public User(Long id, String username, String email, String password, String firstName, String lastName, Date createdAt, Date updatedAt) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password.hashCode() + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

    @Override
    public int hashCode() {
        return (int) (id * username.hashCode() * email.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}


// TODO: Add input validation
//  - Use Bean Validation annotations in the User model
//  - Implement validation in the Service layer
//  - Reason: To ensure data integrity and improve application robustness
