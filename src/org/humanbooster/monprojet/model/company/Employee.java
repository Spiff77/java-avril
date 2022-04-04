package org.humanbooster.monprojet.model.company;

public class Employee {

    private int id;
    private static int count = 0;
    private String firstName;
    private String laststName;
    private double salary;
    private Company company;
    private Status status;
    private BankInfo bankInfo;

    public Employee(String firstName, String laststName, double salary, Company company, Status status, BankInfo bankInfo) {
        this.id = ++count;
        this.firstName = firstName;
        this.laststName = laststName;
        this.salary = salary;
        this.company = company;
        this.status = status;
        this.bankInfo = bankInfo;
    }
    public Employee(String firstName, String laststName, double salary, Company company, boolean manager, int year, BankInfo bankInfo) {
        this.id = ++count;
        this.firstName = firstName;
        this.laststName = laststName;
        this.salary = salary;
        this.company = company;
        this.status = new Status(manager, year);
        this.bankInfo = bankInfo;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLaststName() {
        return laststName;
    }

    public void setLaststName(String laststName) {
        this.laststName = laststName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public BankInfo getBankInfo() {
        return bankInfo;
    }

    public void setBankInfo(BankInfo bankInfo) {
        this.bankInfo = bankInfo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", laststName='").append(laststName).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", company=").append(company);
        sb.append(", status=").append(status);
        sb.append(", bankInfo=").append(bankInfo);
        sb.append('}');
        return sb.toString();
    }
}
