
package br.com.amemais.ama_app.domain;

import java.time.LocalDateTime;

public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String cpf;
    private String cnpj;
    private LocalDateTime birthDate;
    private String email;
    private String telephone;
    private String password;
    private String photoUrl;
    private Integer gender;
    private LocalDateTime joinDate;
    private Boolean verified;

    public User(Long id, String firstName, String lastName, String cpf, String cnpj, LocalDateTime birthDate,
            String email, String telephone, String password, String photoUrl, Integer gender,
            LocalDateTime joinDate, Boolean verified) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.birthDate = birthDate;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
        this.photoUrl = photoUrl;
        this.gender = gender;
        this.joinDate = joinDate;
        this.verified = verified;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getPassword() {
        return password;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public Integer getGender() {
        return gender;
    }

    public LocalDateTime getJoinDate() {
        return joinDate;
    }

    public Boolean getVerified() {
        return verified;
    }
}
