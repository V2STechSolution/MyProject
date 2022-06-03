package com.dao;
import com.model.*;

public interface LoginDAO{    
       public boolean checkLogin(String userName, String userPassword);
}