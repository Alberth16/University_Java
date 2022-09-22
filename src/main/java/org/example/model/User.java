package org.example.model;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    protected int userId;
    protected String name;
    protected String lastName;
    protected String email;
}
