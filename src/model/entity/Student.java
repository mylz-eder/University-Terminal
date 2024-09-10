package model.entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

public class Student extends Person{

    @Override
    @Getter
    @Setter
    @NoArgsConstructor
    @SuperBuilder

    private String registrationNumber, program;

}
