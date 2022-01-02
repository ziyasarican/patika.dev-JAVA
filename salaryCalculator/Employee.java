public class Employee {
    String employeeName;
    int employeeSalary;
    int workHoursPerWeek;
    int hireYear;
    double tax;
    double bonusSalary;
    double raiseSalary;

    Employee(String employeeName, int employeeSalary, int workHoursPerWeek, int hireYear){
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.workHoursPerWeek = workHoursPerWeek;
        this.hireYear = hireYear;
        this.tax = 0;
        this.bonusSalary = 0;
        this.raiseSalary = 0;
    }
    double tax(){
        if(this.employeeSalary > 1000)
            this.tax = this.employeeSalary*0.03;
        else
            this.tax = 0;
        return this.tax;
    }

    double raiseSalary(){
        if(2021 - this.hireYear < 10)
            this.raiseSalary=this.employeeSalary*0.05;
        else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20)
            this.raiseSalary = this.employeeSalary*0.1;
        else
            this.raiseSalary = this.employeeSalary*0.15;
        return this.raiseSalary;
    }

    double bonusSalary(){
        if(this.workHoursPerWeek > 40)
            this.bonusSalary = (this.workHoursPerWeek - 40) * 30;
        else
            this.bonusSalary = 0 ;

        return this.bonusSalary;
    }

    void printInfo(){
        System.out.println("******");
        System.out.println("Employee Name : " +this.employeeName);
        System.out.println("Employee Salary : " +this.employeeSalary);
        System.out.println("Work Hour Per Week : "+this.workHoursPerWeek);
        System.out.println("Hire Year : " + this.hireYear);
        System.out.println("Tax Amount : " + tax());
        System.out.println("Bonus Salary : " +bonusSalary());
        System.out.println("Raise Salary : " +raiseSalary());
        System.out.println("Salary with Tax and Bonus : " + (this.employeeSalary - tax() + bonusSalary()));
        System.out.println("New Salary : " + (this.employeeSalary + raiseSalary()));
    }
}
