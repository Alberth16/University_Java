package org.example.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    protected int userId;
    protected String name;
    protected String lastName;
    protected String email;
}
