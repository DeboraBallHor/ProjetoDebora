package br.com.digitalhousehouse.projetodebora.database;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {

    public String name;
    public String email;

    //Default construtor required for calls to
    //DataSnapshot.getValue(User.class)
    public User(){
    }

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }
}