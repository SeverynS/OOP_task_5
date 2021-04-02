package com;/*
 * 5 задачка
* Необходимо
* Написать иерархию классов, описывающих служащих в компании.
* Она должна состоять из  базового класса com.models.Employee и производных от него классов com.models.Manager, com.models.Agent и com.models.Worker.
* Базовый класс должен иметь чисто
* метод рассчета заработной платы, переопределенный в каждом из производных классов. Заработная
* плата com.models.Manager постоянна и равна 13000, заработная плата com.models.Agent определяется как оклад 5000 + 5% объема продаж,
* который хранится в специальном поле класса com.models.Agent, и заработная плата com.models.Worker
* определяется как 100×число отработанных часов, которое также хранится в отдельном поле
* (классы com.models.Agent и com.models.Worker должны иметь конструкторы повещественному числу, устанавливающие значение своего поля).
* В основной программе завести массив из 9 ячеек на com.models.Employee и заполнить его указателями на объекты производных классов
*  (первые 3 — com.models.Manager, следующие 3 —
* com.models.Agent и последние 3 — com.models.Worker). Вывести на экран величину заработной платы всех 9 служащих.
*/

import com.models.Agent;
import com.models.Employee;
import com.models.Manager;
import com.models.Worker;

public class Start {
    public static void main(String[] args) {

        Employee[] employees = new Employee[9];

        employees[0] = new Manager();
        employees[1] = new Manager();
        employees[2] = new Manager();
        employees[3] = new Agent(1000);
        employees[4] = new Agent(2500);
        employees[5] = new Agent(7250);
        employees[6] = new Worker(40);
        employees[7] = new Worker(60);
        employees[8] = new Worker(73);

        for(Employee e : employees) {
            System.out.println(e);
        }
    }
}
