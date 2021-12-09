import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s1= new Student(6612, "Dennis", 3.20, new GregorianCalendar(1974,5,12).getTime());
        Student s2= new Student(6630, "Mary", 3.88, new GregorianCalendar(2000,3,10).getTime());
        Student s3= new Student(0011, "Jennifer", 2.77, new GregorianCalendar(1974,1,2).getTime());
        Student s4= new Student(2211, "Amy", 3.00, new GregorianCalendar(1930,3,21).getTime());
        Student s5= new Student(3399, "Smith", 2.98, new GregorianCalendar(2000,3,30).getTime());

        ArrayList <Student> list= new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        Collections.sort(list,(e1,e2)-> e1.getName().compareTo(e2.getName()));
        for (Student s:list){
            System.out.println(s.getName());
        }
        System.out.println();

        Collections.sort(list,(e1,e2)-> e1.getGpa().compareTo(e2.getGpa()));
        for (Student s:list){
            System.out.println(s.getName() + ", GPA:  " +s.getGpa());
        }
        System.out.println();

        Collections.sort(list, (e1,e2)-> e1.getDateOfBirth().compareTo(e2.getDateOfBirth()));
        for (Student s:list){
            System.out.println(s.getName()+":  " +
                    (s.getDateOfBirth().getYear()+1900)  +"/"+
                    s.getDateOfBirth().getMonth()+"/"+
                    s.getDateOfBirth().getDate());
            //System.out.println(s.getDateOfBirth().getYear()+1900);
        }
        System.out.println();

        //Q2
        DrivingLicenseApplication da= new DrivingLicenseApplication();
        da.applyDriverLicense();








    }
}
