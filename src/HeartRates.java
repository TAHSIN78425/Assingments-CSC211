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
          System.out.println("Persons age is "+ (PresentYear-getYear()));



    }
    public void HearRateCalc( ){


        int PresentYear= LocalDateTime.now().getYear();

       int age= PresentYear-getYear();
        System.out.println("Heart Rate is "+(220-age));

    }
}
