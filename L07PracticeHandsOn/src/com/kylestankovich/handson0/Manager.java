package com.kylestankovich.handson0;

public class Manager extends Employee {
    String jobTitle;

    public Manager() {
        super();
        this.jobTitle = "";
    }

    public Manager(String firstName, String lastName, String companyName, int yearsAtCompany, String jobTitle) {
        super(firstName, lastName, companyName, yearsAtCompany);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " has worked at " + this.companyName + " for " + this.yearsAtCompany + " year(s) as a(n) " + this.jobTitle;
    }
}
