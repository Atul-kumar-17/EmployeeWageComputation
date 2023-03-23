public class EmployeeSwitchCase {
    public static int Is_part_Time =1;
    public static int Is_full_time =2;
    public static void main(String[] args) {

      int wagePerHrs =20;
      int empHrs=0;
      int empDailyWage=0;
      int check= (int)Math.random()*10%2;
      switch (check){
          case 1:  Is_part_Time:
              empHrs=4;
              break;
          case 2:  Is_full_time:
              empHrs=8;
              break;
          default:
              empHrs=0;
      }
      empDailyWage=wagePerHrs*empHrs;
        System.out.println("Employee's Daily Wage = "+empDailyWage);

    }
}
