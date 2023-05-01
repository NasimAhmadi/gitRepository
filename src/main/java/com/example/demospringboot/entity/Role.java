package com.example.demospringboot.entity;

import com.example.demospringboot.enums.RoleNameEnum;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Accessors(chain = true)
@EqualsAndHashCode(of = "id")
@ToString(of = "id")
@Table(name = "ROLE")
public class Role {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "ROLE_NAME")
    private RoleNameEnum roleName;

}