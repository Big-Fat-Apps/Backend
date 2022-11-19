package com.user_control.hackaton.DataBase;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class Users {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "login")
    private String login;
    @Column(name = "passwordHash")
    private String passwordHash;
    @Column(name = "is_admin")
    private boolean is_admin = false;
    @Column(name = "is_blocked")
    private boolean is_blocked = false;
    @Column(name = "balance")
    private double balance = 0;
    @Column(name = "is_confirmed")
    private boolean is_confirmed = false;
    @Column(name = "pathToPhoto")
    private String pathToPhoto;

    public Users() {
    }

    public Users(String login, String passwordHash) {
        this.login = login;
        this.passwordHash = passwordHash;
    }
}
