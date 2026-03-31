package study.ch09.entity;

public class User {
    private  String uesrname; //사용자이름 -아이디
    private  String password; //비밀번호
    private  String name;     //회원명

    public  User(String uesrname, String password, String name){
        this.uesrname = uesrname;
        this.password = password;
        this.name = name;
    }

    public User(String uesrname, String password) {
        this(uesrname, password, "공백");
    }
    public User(String uesrname) {
        this(uesrname, "1234", "공백");
    }


    public String getUesrname() {
        return uesrname;
    }

    public void setUesrname(String uesrname) {
        this.uesrname = uesrname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name.substring(0,name.length() - 1);
    }

    public void setName(String name) {
        this.name = name + "님";
    }
}
