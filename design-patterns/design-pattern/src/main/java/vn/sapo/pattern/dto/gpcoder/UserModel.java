package vn.sapo.pattern.dto.gpcoder;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Domain Model / Entity
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String userName;

    private String fullName;

    private String password;

    private String email;

    private String bankAccount;

}
