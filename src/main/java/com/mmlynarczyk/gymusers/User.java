package com.mmlynarczyk.gymusers;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @NotBlank
    String firstName;

    @NotBlank
    String lastName;

    String gymCode;
}
