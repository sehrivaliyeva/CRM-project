package task.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Şirkət adı boş ola bilməz")
    @Size(min = 2, max = 100, message = "Şirkət adı 2-100 simvol arasında olmalıdır")
    private String companyName;

    @NotBlank(message = "Əlaqə şəxsin adı boş ola bilməz")
    private String contactName;

    @NotBlank(message = "Telefon boş ola bilməz")
    @Size(min = 10, max = 15, message = "Telefon nömrəsi 10-15 simvol arasında olmalıdır")
    private String phone;
}
