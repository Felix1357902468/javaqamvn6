package ru.netology.javaqa.javaqamvn6.services;


public class SqrtService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses - (money - expenses) / 3; // уменьшаем деньги на траты на отдых
                System.out.println("Месяц " + month + "." + "Денег " + money + "." + "Буду отдыхать." + "Потратил " + "-" + expenses + ", траты на отдых " + "-" + (money - expenses) / 3);
            } else {
                money = money + income - expenses; // увеличиваем деньги на доход от работы и уменьшаем на обязательные траты
                System.out.println("Месяц " + month + "." + "Денег " + money + "." + "Придется работать." + "Заработал " + "+" + income + "," + "Потратил " + "-" + expenses);
            }
        }
        return count;
    }
}