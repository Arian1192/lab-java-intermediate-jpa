package model;

import jakarta.persistence.*;

@Entity
@Table(name = "contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @Embedded
    private Name name;

    @Column(name = "title")
    private String title;
    @Column(name = "company")
    private String company;
}
