package com.ghazale.personalwebapi.model;

import com.ghazale.personalwebapi.config.CharConverter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

import java.util.Date;

@Entity
@Getter
@Setter
@Table (name = "CLIENT")
@RequiredArgsConstructor
@NoArgsConstructor
@DynamicUpdate
public class Client {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIRST_NAME", columnDefinition = "CHAR(10)", length = 10)
    @Convert(converter = CharConverter.class)
    private String name;

    @Column(name = "LAST_NAME", columnDefinition = "CHAR(10)", length = 10)
    @Convert(converter = CharConverter.class)
    private String lastName;

    @Column(name = "GENDER", columnDefinition = "CHAR(10)", length = 10)
    @Convert(converter = CharConverter.class)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "PHONE_NUMBER", columnDefinition = "CHAR(10)", length = 10)
    @Convert(converter = CharConverter.class)
    private String phoneNumber;

    @Column(name = "PASSWORD")
    @Convert(converter = CharConverter.class)
    private String password;

    @CreatedDate
    private Date creationDate;

    @Version
    private Integer version;
}

