package com.pokidin.a.advertapplication.entity;

public class YourMessageView extends MessageView {
    private String user;
    private String message;

    public YourMessageView(String user, String message) {
        this.user = user;
        this.message = message;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
