package fun.rtzhao.crm.settings.service;

import fun.rtzhao.crm.exception.LoginException;
import fun.rtzhao.crm.settings.domain.User;

import java.util.List;

public interface UserService {
    User login(String loginAct, String loginPwd, String ip) throws LoginException;

    List<User> getUserList();
}
