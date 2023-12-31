package lk.ijse.todo.dto;

import lombok.*;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class SignUpDto {
    private String username;
    private String email;
    private String password;
}
