package task.config;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class AuthRequest {
    private String email;
    private String password;
}
