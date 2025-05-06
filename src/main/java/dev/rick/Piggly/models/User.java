package dev.rick.Piggly.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "tb_User")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {
    public static final Long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String email;
    private String password;


}
