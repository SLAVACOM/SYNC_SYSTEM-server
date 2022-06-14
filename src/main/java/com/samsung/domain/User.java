package com.samsung.domain;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "SLAVACOM")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SLAVACOM_id")
    private int id;



    @Column(name = "password")
    private String password;



    @Column(name = "mail")
    private String mail;
}
