package com.gmail.zavsek_o2;

class FitnessTracker {
    private final String firstName;
    public String lastName;
    private final String email;
    private final String phoneNumber;
    private int weight;
    private int bloodPressure;
    private int stepsTaken;
    private int age;
    private final int dayOfBirth;
    private final int monthOfBirth;
    private final int yearOfBirth;

    public FitnessTracker(String firstName, String lastName, String email, String phoneNumber, int weight, int bloodPressure, int stepsTaken, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.stepsTaken = stepsTaken;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;


        int currentYear = 2020;
        this.age = currentYear - yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getStepsTaken() {
        return stepsTaken;
    }

    public void setStepsTaken(int stepsTaken) {
        this.stepsTaken = stepsTaken;
    }

    public int getAge() {
        return age;
    }

    public void printAccountInfo() {
        System.out.println("Имя: " + firstName + " " + lastName);
        System.out.println("Дата рождения: " + dayOfBirth + "." + monthOfBirth + "." + yearOfBirth + " (" + age + " років)");
        System.out.println("Емейл: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Вес: " + weight);
        System.out.println("Давление: " + bloodPressure);
        System.out.println("Шагов за день: " + stepsTaken);
        System.out.println("----------------------------------------");
    }
}
