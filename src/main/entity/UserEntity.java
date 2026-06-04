import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserEntity {

    @userId
    private int userId;
    private String userName;
    private String userEmail;


}
