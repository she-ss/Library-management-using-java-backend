package com.example.mproject1.dtos;

import com.example.mproject1.models.Student;
import lombok.*;


import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateStudentRequest {

    @NotBlank
    private String name;


    @NotBlank
    private String email;

    private Integer age;

    public Student to(){
        return Student.builder()
                .name(this.name)
                .email(this.email)
                .age(this.age)
                .build();
    }
}
