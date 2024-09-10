package model.entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

public abstract class Person implements Persist{

    @Getter
    @Setter
    @NoArgsConstructor
    @SuperBuilder

    private String name;
    private LocalDate birthDate;

}
