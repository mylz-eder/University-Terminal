package model.entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

public class Faculty extends Person{
    @Getter
    @Setter
    @NoArgsConstructor
    @SuperBuilder

    private String designation, department;
    private double salary;
}
