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

    private int id;
    private String userName, password, firstName, lastName, phoneNumber, socialSecurity, email, address;
    private LocalDate birthDate, createdAt, lastAlteredAt;

    public String toString () {return new Gson().toJson(this);
    }
}
