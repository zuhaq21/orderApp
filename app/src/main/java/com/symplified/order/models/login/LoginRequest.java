package com.symplified.order.models.login;

import java.io.Serializable;

public class LoginRequest implements Serializable {

    public String username;
    public String password;

    public LoginRequest(String username, String password){
        this.username = username;
        this.password = password;
    }

}
