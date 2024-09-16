package ru.netology.javaqa.javaqamvn6.services;


    public class SqrtService {

        public int calculate(int income, int expenses, int threshold) {
            int count = 0; // счётчик месяцев отдыха
            int money = 0; // количество денег на счету

            for (int month = 0; month < 12; month++) {
                if (money >= threshold) { // можем ли отдыхать?
                    count++; // увеличиваем счётчик месяцев отдыха
                    money = money - expenses;
                    System.out.println("Месяц " +month + "." + "Денег " +money + "." + "Буду отдыхать." + "Заработал " + "+" + income + "," + "Потратил " + "-" + expenses);
                    break; // exit the loop if the threshold is reached
                } else {
                    money = money + income;
                    System.out.println("Месяц " +month + "." + "Денег " +money + "." + "Придется работать." + "Заработал " + "+" + income + "," + "Потратил " + "-" + expenses);
                }
            }
            return count;
        }
    }