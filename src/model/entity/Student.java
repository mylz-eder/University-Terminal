package model.entity;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@ToString


public class Student extends Person {

    private int access = 3;
    public String toString () {
        return new Gson().toJson(this);
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
