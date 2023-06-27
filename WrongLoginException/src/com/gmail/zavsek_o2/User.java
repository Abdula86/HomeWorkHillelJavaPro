package com.gmail.zavsek_o2;

public class User {
    private String login;
    private String password;

    public User(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        validateLogin(login);
        validatePassword(password, confirmPassword);
        this.login = login;
        this.password = password;
    }

    private void validateLogin(String login) throws WrongLoginException {
        if (login == null || login.length() > 20 || !login.matches("[a-zA-Z]+")) {
            throw new WrongLoginException("Wrong login");
        }
    }

    private void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password == null || confirmPassword == null || password.length() < 6 || password.length() > 25 ||
                !password.matches("^(?=.*[0-9])(?=.*[a-zA-Z]).+$") ||
                !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Wrong password");
        }
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}

