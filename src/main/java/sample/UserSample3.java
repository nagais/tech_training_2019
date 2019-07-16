package sample;

class UserSample3 {

    private Sex sex;

    UserSample3(Sex sex) {
        this.sex = sex;
    }

    boolean isMan() {
        return this.sex == Sex.man;
    }

    enum Sex {
        man,
        woman
    }
}
