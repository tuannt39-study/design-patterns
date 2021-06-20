package vn.sapo.pattern.dto.gpcoder;

public class UserService {

    private final UserDao dao = new UserDao();

    public UserDTO getUser(int id) {
        var model = dao.get(id).orElse(null);
        if (model != null) {
            return convertToDTO(model);
        }
        return null;
    }

    public void saveUser(UserDTO dto) {
        UserModel model = convertToModel(dto);
        dao.save(model);
    }

    public void updateUser(UserDTO dto) {
        UserModel model = convertToModel(dto);
        dao.update(model);
    }

    private UserModel convertToModel(UserDTO dto) {
        var model = new UserModel();
        model.setId(dto.getId());
        model.setFullName(dto.getFullName());
        model.setUserName(dto.getUserName());
        model.setEmail(dto.getEmail());
        return model;
    }

    private UserDTO convertToDTO(UserModel model) {
        var dto = new UserDTO();
        dto.setId(model.getId());
        dto.setFullName(model.getFullName());
        dto.setUserName(model.getUserName());
        dto.setEmail(model.getEmail());
        return dto;
    }

}
