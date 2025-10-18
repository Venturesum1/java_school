package com.edu.Service;

import com.edu.Dao.DaoUser;
import com.edu.Model.UserMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginService {

    @Autowired
    private DaoUser daoUser;

    public String processLogin(String username, String password) {
        if (username != null && password != null) {
            try {
                UserMaster user = daoUser.getUserByUsername(username, password);
                if (user != null) {
                    return "success";
                }else {
                    return "failure";
                }
            } catch ( Exception e) {
                return "failure";
            }
        } else {
            return "error";
        }
    }

    public UserMaster getUserByUsername(String username) {
        try {
            return daoUser.getUserByUsernameOnly(username);
        } catch (Exception e) {
            return null;
        }
    }
}
