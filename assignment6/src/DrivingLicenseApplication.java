import com.sun.xml.internal.ws.handler.HandlerException;

import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DrivingLicenseApplication {
    private Date dateNow;
    //private Scanner obj;

    public DrivingLicenseApplication() {
//         new Scanner(System.in);
         dateNow= new Date();

    }


    public void applyDriverLicense() throws Exception {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter Drivers Birth year");
        int year= Integer.parseInt( obj.nextLine());
        System.out.println("Enter Drivers Birth Month");
        int month= Integer.parseInt(obj.nextLine());
        System.out.println("Enter Drivers Birth Date");
        int date= Integer.parseInt(obj.nextLine());

        Date userDate= new GregorianCalendar(year, month-1, date).getTime();
        int diff= (int) ChronoUnit.DAYS.between(userDate.toInstant(), dateNow.toInstant());
//        if (diff < 365*16 ){
//            throw new Exception("eeee");
//        }
//        if (diff < 365*16 ){
//            throw new Exception("The age of the applicant is too early to apply for a driving license");
//        }
        if(diff < 365*16 ){
            throw new Exception("under age applicant");
        }else{
            System.out.println("registered successfully!!");
        }



    }
}
