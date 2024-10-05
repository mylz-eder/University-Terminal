package model.entity;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Faculty extends Person{

    private int access = 1;

    public String toString () {
        return new Gson().toJson(this);
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
