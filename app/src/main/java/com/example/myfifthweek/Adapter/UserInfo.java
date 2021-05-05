package com.example.myfifthweek.Adapter;

import androidx.recyclerview.widget.RecyclerView;

public class UserInfo {
    private int imgaeId;
    private String userName;
    private String userMessage;
    public UserInfo(int imgaeId,String userName,String userMessage){
        this.imgaeId=imgaeId;
        this.userName=userName;
        this.userMessage=userMessage;
    }
    public void setImgaeId(int imgaeId){
        this.imgaeId=imgaeId;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    public void setUserMessage(String userMessage){
        this.userMessage=userMessage;
    }
    public int getImgaeId(){
        return imgaeId;
    }
    public String getUserName(){
        return userName;
    }
    public String getUserMessage(){
        return userMessage;
    }


}



