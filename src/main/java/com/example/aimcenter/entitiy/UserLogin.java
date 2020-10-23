package com.example.aimcenter.entitiy;


public class UserLogin {

   private Integer id;
   private String login_id;
   private String psd;
   private String username;
   private String usersex;
   private String birthday;
   private String tel;
   private String user_code;

   public UserLogin(){}

   public UserLogin(String login_id,String psd,String username,String usersex,String birthday,String tel,String user_code){
       this.login_id=login_id;
       this.psd=psd;
       this.username=username;
       this.usersex=usersex;
       this.birthday=birthday;
       this.tel =tel;
       this.user_code=user_code;
   }

   public UserLogin(String login_id,String username,String tel){
       this.login_id=login_id;
       this.username =username;
       this.tel=tel;
   }

    public String getLogin_id() {
        return login_id;
    }

    public void setLogin_id(String login_id) {
        this.login_id = login_id;
    }

    public String getPsd() {
        return psd;
    }

    public void setPsd(String psd) {
        this.psd = psd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
