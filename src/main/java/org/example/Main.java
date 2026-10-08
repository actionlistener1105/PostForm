package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Post post = new Post();
        post.name = "Иван";
        post.passport = "1111 № 123456";
        post.patronymic = "Иванович";
        post.phone = "+79991234567";
        post.surname = "Иванов";
        post.subscription = true;
        post.birthdate.day = 1;
        post.birthdate.month = 6;
        post.birthdate.year = 1984;
    }
}