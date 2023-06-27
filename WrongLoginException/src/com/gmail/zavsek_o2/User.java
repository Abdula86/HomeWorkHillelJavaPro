package com.gmail.zavsek_o2;

class User {
    private String login;
    private String password;

    public User(String login, String password, String confirmPassword) throws WrongLoginException,
            WrongPasswordException {
        validateLogin(login);
        validatePassword(password, confirmPassword);
        this.login = login;
        this.password = password;
    }

    private void validateLogin(String login) throws WrongLoginException{
        if (login.length() > 20 || !login.matches("[a-zA-Z]+")) {
            throw new WrongLoginException("Invalid login");
        }
    }

    private void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (!password.matches ("^(?=.*[a-zA-Z])(?=.*[0-9])[a-zA-Z0-9]{6,25}$") ||
                !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Invalid password");
        }
    }
}
