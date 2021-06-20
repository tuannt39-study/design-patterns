package vn.sapo.pattern.dto.gpcoder;

import lombok.extern.slf4j.Slf4j;

/**
 * Client - Data Access Object Pattern Example
 */
@Slf4j
public class DataAccessObjectPatternExample {

    public static void main(String[] args) {
        var service = new UserService();
        var dto = service.getUser(1);
        log.debug("User: {}", dto);
        dto.setFullName("gpcoder.com");
        service.updateUser(dto);
        log.debug("User Updated: {}",dto);
    }
}
