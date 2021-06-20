package vn.sapo.pattern.dto.javadesignpatterns;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private String firstName;

    private String lastName;

}
