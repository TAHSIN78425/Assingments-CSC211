import java.time.LocalDateTime;

public class HeartRates {
    private String firstname;
    private String  lastname;
    private int year;
    private int day;
    private int month;

    public HeartRates(String firstname, String lastname, int year, int day, int month) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.year = year;
        this.day = day;
        this.month = month;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public void PersonsAge(){

         int PresentYear= LocalDateTime.now().getYear();
          System.out.println("Patient's age is "+ (PresentYear-getYear()));



    }
    public void MaximumHeartRate( ){


        int PresentYear= LocalDateTime.now().getYear();

       int age= PresentYear-getYear();
        System.out.println("Maximum Heart Rate is "+(220-age));

    }
    public void TargetHeartRate(){


        int PresentYear= LocalDateTime.now().getYear();

        int age= PresentYear-getYear();
        double max_thr = (220-age)*0.60;

double min_thr =(220-age)*0.57;
        System.out.println("The Target heart Rate is between  "+(int)min_thr+" % to "+ (int)max_thr+ "% ");

    }
}
