package vn.sapo.pattern.dto.gpcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDao implements Dao<UserModel>{

    // Temporary database
    private final List<UserModel> users = new ArrayList<>();

    public UserDao() {
        var user = new UserModel();
        user.setId(1);
        user.setUserName("gpcoder");
        user.setEmail("gpcodervn@gmail.com");
        user.setFullName("GP Coder");
        user.setPassword("1234567");
        user.setBankAccount("9999-9999-9999");
        users.add(user);
    }

    @Override
    public List<UserModel> getAll() {
        return users;
    }

    @Override
    public Optional<UserModel> get(int id) {
        return users.stream().filter(u -> u.getId() == id).findFirst();
    }

    @Override
    public void save(UserModel userModel) {
        users.add(userModel);
    }

    @Override
    public void update(UserModel userModel) {
        var index = -1;
        for (var u : users) {
            index++;
            if (userModel.getId().equals(u.getId())) {
                users.set(index, userModel);
                break;
            }
        }
    }

    @Override
    public void delete(UserModel userModel) {
        get(userModel.getId()).ifPresent(users::remove);
    }
}
