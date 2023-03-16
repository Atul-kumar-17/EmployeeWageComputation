

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation");

//  Check Employee is present or not using random
        double randomCheck = Math.floor(Math.random()*10)%2;
        if (randomCheck==1){
            System.out.println("Employee is Present");
        }else {
            System.out.println("Employee is Absent");
        }
//  Calculation of Daily Wage
        int wagePerHrs = 20;
        int fullDayHrs = 8;
        int DailyWage = wagePerHrs * fullDayHrs;
        if (randomCheck==1){
            System.out.println("Daily Wage of Employee = " +DailyWage);
        }else{
            System.out.println("Employee is Absent");
        }
        // Adding Part time Employee
        int Is_part_time = 1;
        int Is_full_time = 2;
        double randomCheck1 =  Math.floor(Math.random()*10)%3;
        if (randomCheck1==1) {
            System.out.println("Employee is Part time");
        }else{
            System.out.println("Employee is Full time");
        }
        int parttimeHrs = 4;
        int PtDailyWage = parttimeHrs*wagePerHrs;
        System.out.println("Part time Employee daily Wage = " +PtDailyWage);
    }
}