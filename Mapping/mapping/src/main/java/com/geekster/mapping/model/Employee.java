package com.geekster.mapping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long employeeId;
    private String firstName;
    private String lastName;

    @OneToOne
    @JoinColumn(name ="fk_user_address-id")
    private Address emplyeeAddress;
}
