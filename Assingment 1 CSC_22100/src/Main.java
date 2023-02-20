import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String FIRST= JOptionPane.showInputDialog("Please Enter First Name :");
        String LAST = JOptionPane.showInputDialog("Please Enter Last Name :");
        System.out.println("Please Enter Birth Year");
        int YEAR =scanner.nextInt();
        System.out.println("Please Enter Birth Month");
        int MONTH =scanner.nextInt();
        System.out.println("Please Enter Birth DAY");
        int DAY =scanner.nextInt();
        JOptionPane.showMessageDialog(null,"Patient's Name is "+FIRST+" "+LAST+" And Date Of Birth "+ MONTH+"/"+DAY+"/"+YEAR);



        HeartRates heartRates=new HeartRates(FIRST,LAST,YEAR,MONTH,DAY);
        System.out.println("Name of the patient is "+ heartRates.getFirstname()+" "+heartRates.getLastname());
        System.out.println("Patient's Date of birth is "+ + heartRates.getMonth()+"/"+heartRates.getDay()+"/"+heartRates.getYear());
        heartRates.PersonsAge();
        heartRates.MaximumHeartRate();
        heartRates.TargetHeartRate();

    }
