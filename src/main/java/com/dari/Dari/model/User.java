package com.dari.Dari.model;

import com.dari.Dari.model.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    private UserRole userRole;
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    @OneToMany(mappedBy = "user_id", cascade = CascadeType.ALL)
    private List<Item> favoriteItems;
    private Boolean isEnabled;
    private Boolean isLocked;
    private Boolean isEmailConfirmed = false;

//    Constructors


    public User(
            String username,
            String email,
            String password,
            String firstName,
            String lastName,
            String phoneNumber,
            UserRole userRole,
            Boolean isEnabled,
            Boolean isLocked) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.userRole = userRole != null ? userRole: UserRole.CLIENT;
        this.isEnabled = isEnabled;
        this.isLocked = isLocked;
    }
}
