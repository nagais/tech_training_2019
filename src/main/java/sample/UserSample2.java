package sample;

class UserSample2 {

    private String sex;

    UserSample2(String sex) {
        this.sex = sex;
    }

    boolean isMan() {
        return sex.equals("man");
    }
}
