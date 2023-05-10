package org.example.model;

import lombok.*;
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Staff {
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private CurrentPosition currentPosition;

    public enum CurrentPosition {
        DIRECTOR,
        MANAGER,
        DEVELOPER,
        PM,
        BA,
        SECURITY
    }
}
