

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



    }
}