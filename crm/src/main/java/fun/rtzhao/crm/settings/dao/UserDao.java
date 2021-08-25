package fun.rtzhao.crm.settings.dao;

import fun.rtzhao.crm.settings.domain.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    User login(Map<String,String> map);

    List<User> getUserList();
}
