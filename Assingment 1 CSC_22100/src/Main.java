public class Main {
    public static void main(String[] args) {
        HeartRates heartRates=new HeartRates("TAHSIN","RAHMAN",2001,05,12);
        System.out.println("Name of the patient is "+ heartRates.getFirstname()+" "+heartRates.getLastname());
        System.out.println("Patient's Date of birth is "+ heartRates.getDay()+" "+ heartRates.getMonth()+" "+heartRates.getYear());
        heartRates.PersonsAge();
        heartRates.MaximumHeartRate();
        heartRates.TargetHeartRate();

    }
}