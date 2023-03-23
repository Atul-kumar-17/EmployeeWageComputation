
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation");

// Check Employee is present or not using random
        int randomCheck = (int)Math.floor(Math.random() * 10) % 2;
        switch ( randomCheck ) {
            case 1:
            System.out.println("Employee is Present");
            break;
            case 2:
            System.out.println("Employee is Absent");
            break;
        }
// Calculation of Daily Wage
        int wagePerHrs = 20;
        int fullDayHrs = 8;
        int DailyWage = wagePerHrs * fullDayHrs;
        switch (randomCheck) {
            case 1:
            System.out.println("Daily Wage of Employee = " + DailyWage);
            break;
            case 2:
            System.out.println("Employee is Absent");
            break;
        }

//  Adding Part time Employee
        int Is_part_time = 1;
        int Is_full_time = 2;
        int randomCheck1 = (int)Math.floor(Math.random() * 10) % 3;
        switch (randomCheck1) {
            case 1:
            System.out.println("Employee is Part time");
            break;
            case 2:
            System.out.println("Employee is Full time");
            break;
        }
        int parttimeHrs = 4;
        int PtDailyWage = parttimeHrs * wagePerHrs;
        System.out.println("Part time Employee daily Wage = " + PtDailyWage);

//  Calculating monthly salary
       // int totalWorkingDays = 20;
        int totalWorkingHrs =100;
        int Monthly_Salary = DailyWage*totalWorkingHrs;
        int PtMonthlySal = PtDailyWage*totalWorkingHrs;
        System.out.println("Employee Monthly Salary = " +Monthly_Salary);
        System.out.println("Part time Employee Monthly Salary = " +PtMonthlySal);
    }
}
