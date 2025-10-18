package com.edu.Dao;


import com.edu.Model.UserMaster;

public interface DaoUser {

    public UserMaster getUserByUsername(String username, String password);
    public UserMaster getUserByUsernameOnly(String username);
}
