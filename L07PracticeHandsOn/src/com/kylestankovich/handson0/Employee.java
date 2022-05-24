package com.kylestankovich.handson0;

public class Employee {
    public String firstName;
    public String lastName;
    public String companyName;
    public int yearsAtCompany;

    public Employee() {
        this.firstName = "";
        this.lastName = "";
        this.companyName = "";
        this.yearsAtCompany = -1;
    }

    public Employee(String firstName, String lastName, String companyName, int yearsAtCompany) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.yearsAtCompany = yearsAtCompany;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return this.companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getYearsAtCompany() {
        return this.yearsAtCompany;
    }
    public void setYearsAtCompany(int yearsAtCompany) {
        this.yearsAtCompany = yearsAtCompany;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " has worked at " + this.companyName + " for " + this.yearsAtCompany + " year(s)";
    }
}

