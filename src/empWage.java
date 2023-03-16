
class Employee{
    String salutation= "hello ";
    double randomCheck = Math.floor(Math.random()*10)%2;
    String attendance = "present, absent";
    String employee_type= "Full time, Parttime";

    int wagePerHrs = 20;
    int fullDayHrs = 8;
    int parttimeHrs = 4;
    int PtDailyWage = parttimeHrs*wagePerHrs;
    int DailyWage = wagePerHrs * fullDayHrs;
    int totalWorkingDays = 20;
    int Monthly_Salary_fulltime = DailyWage*totalWorkingDays;
    int PtMonthlySal = PtDailyWage*totalWorkingDays;
    public void present(){
//        System.out.println("Employee is present");
    }
    public void absent(){
  //      System.out.println("Employee is absent");
    }

    public int getDailyWage() {
        return DailyWage;
    }

    public int getPtDailyWage()
    {
        return PtDailyWage;
    }
}
public class empWage {
    public static void main(String[] args) {
        Employee E1= new Employee();
        E1.attendance = "present";
        E1.salutation="hello";
        E1.DailyWage= E1.wagePerHrs* E1.fullDayHrs;
        E1.employee_type="Full Time ";
        E1.present();
        Employee E2= new Employee();
        E2.employee_type="Part time ";
        E2.attendance="present";
        E2.PtDailyWage= E2.wagePerHrs*E2.parttimeHrs;
        System.out.println("Employee Detail : "+E1.employee_type    +E1.attendance + " and his daily wage is " +E1.DailyWage +" Rupees " +" and monthly salary is "+E1.Monthly_Salary_fulltime +" Rupees");
        System.out.println("Employee detail : "+E2.employee_type +E2.attendance + " and his daily wage is " +E2.PtDailyWage +" Rupees" +" and monthly salary is " +E2.PtMonthlySal +" Rupees");

    }
}
