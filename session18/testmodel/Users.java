package session18.testmodel;

import session7.Date;

public class Users {
    private int userId;
    private String name;
    private String pass;
    private int type;
    private String creat;
    private String updates;

    public Users() {
        userId = 0;
        name = "";
        pass = "";
        type = 0;
        creat = "";
        updates = "";
    }

    public Users(int userId, String name, String pass, int type, String creat, String updates) {
        this.userId = userId;
        this.name = name;
        this.pass = pass;
        this.type = type;
        this.creat = creat;
        this.updates = updates;
    }
    public Users(String name, String pass, int type) {
        this.name = name;
        this.pass = pass;
        this.type = type;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCreat() {
        return creat;
    }

    public void setCreat(String creat) {
        this.creat = creat;
    }

    public String getUpdates() {
        return updates;
    }

    public void setUpdates(String updates) {
        this.updates = updates;
    }

    @Override
    public String toString() {
        return String.format("%-30d%-30s%-30s%-30d%-30s%-30s", userId, name, pass, type, creat, updates);
    }
}
