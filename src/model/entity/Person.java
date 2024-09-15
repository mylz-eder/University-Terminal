package model.entity;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder

public abstract class Person {

    private String name;
    private LocalDate birthDate;

    public String toString () {return new Gson().toJson(this);
    }
}
