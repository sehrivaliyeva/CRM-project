package task.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = " ad boş ola bilməz")
    private String name;
    @NotBlank(message = "email boş ola bilməz")
    private String email;
    @NotBlank(message = "rol boş ola bilməz")
    private String role;
    @NotBlank(message = "password boş ola bilməz")
    private String password;


}
