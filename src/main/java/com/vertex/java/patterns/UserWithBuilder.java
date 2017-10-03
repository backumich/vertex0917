package com.vertex.java.patterns;

public class UserWithBuilder {


    private int age;
    private String name;
    private String surname;
    private String login;
    private String password;

    private String nation;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getNation() {
        return nation;
    }

    private UserWithBuilder() {
    }

    public static class Builder {
        private UserWithBuilder instance;

        public Builder() {
            this.instance = new UserWithBuilder();
        }

        public Builder withAge(int age) {
            instance.age = age;
            return this;
        }

        public Builder withName(String name) {
            instance.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            instance.surname = surname;
            return this;
        }

        public Builder withLogin(String login) {
            instance.login = login;
            return this;
        }

        public Builder withPassword(String password) {
            instance.password = password;
            return this;
        }

        public Builder withNation(String nation) {
            instance.nation = nation;
            return this;
        }

        public UserWithBuilder build() {
            return instance;
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UserWithBuilder{");
        sb.append("age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", login='").append(login).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", nation='").append(nation).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        UserWithBuilder tolik = new Builder()
                .withName("Tolik")
                .withAge(30)
                .build();

        System.out.println(tolik);
    }
}
