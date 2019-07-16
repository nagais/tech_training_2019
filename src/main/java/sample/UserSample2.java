package sample;

public class UserSample2 {

    String sex;

    UserSample2(String sex) {
        this.sex = sex;
    }

    boolean isMan() {
        return sex.equals("man");
    }
}
