package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {

        Healthplan healthplan = new Healthplan(1, "a sigorta", Plan.BASIC);
        Healthplan healthplan2 = new Healthplan(2, "b sigorta", Plan.ADVANCE);
        System.out.println(healthplan.toString());
        System.out.println(healthplan2.toString());

        String[] healthPlans = new String[3];
        healthPlans[0] = healthplan.getName();
        healthPlans[1] = healthplan2.getName();
        Employee employee = new Employee(1, "ahmet", "ahmet@gmail.com", "123", healthPlans);
        employee.addHealthPlan(2,"c sigorta");
        employee.addHealthPlan(2,"d sigorta");
        employee.addHealthPlan(0,"e sigorta");
        employee.addHealthPlan(-1,"f sigorta");
        employee.addHealthPlan(10,"f sigorta");
        System.out.println(employee.toString());

        System.out.println("*****************");
        String[] developerNames = new String[4];
        developerNames[0] = employee.getFullName();
        Company company = new Company(1, "workintech", 5000, developerNames);
        System.out.println(company.toString());
        company.addEmployee(1, "emrah");
        System.out.println(company.toString());

    }
}