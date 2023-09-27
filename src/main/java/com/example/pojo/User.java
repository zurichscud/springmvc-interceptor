package com.example.pojo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

/**
 * @Author: zurichscud
 * @Date: 2023/9/27 10:54
 * @Description: TODO
 */
@Data
public class User {
    @NotBlank
    private String username;
    @Length(min = 6)
    private String password;
    @Min(1)
    private Integer age;
    @Email
    private String email;
}
