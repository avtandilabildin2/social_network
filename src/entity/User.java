package entity;

public class User {
    private String login;//sozdaiem peremennuiu login po tipu dannyh String
    private String password;//sozdaiem peremennuiu password po tipu dannyh String


    public String getLogin() {//poluchaem login
        return login;//vozvrashshaem login
    }

    public void setLogin(String login) {//vvodim login
        this.login = login;//priravnivaem login
    }

    public String getPassword() {//poluchaem password
        return password;//vozvrashshaem password
    }

    public void setPassword(String password) {//vvodim password
        this.password = password;//priravnivaem password
    }

    @Override
    public String toString() {//sgeneriruem toString
        return "User{" +
                "login='" + login + '\'' +//priravnivaem login
                ", password='" + password + '\'' +//priravnivaem password
                '}';
    }
}
