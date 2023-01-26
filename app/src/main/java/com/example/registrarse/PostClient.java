package com.example.registrarse;

public class PostClient implements PostClientInterface{
    public String sendId(NewPost newPost){
        String nuevo;
        try{
            nuevo = newPost.getId();
        }catch (NullPointerException e){
            nuevo = "No new ID";
        }
        return nuevo;
    }
}

