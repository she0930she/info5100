public class Main {

    public static void main(String[] args) {
	// write your code here
        Fiction fic= new Fiction("Frankenstein", 900, "1988");
        fic.setTitle("Frankenstein");
        System.out.println(fic.description());
        fic.setBorrowDay(1);
        fic.setReturnDay(6);
        System.out.println(fic.isAvailable(5) );


        NonFiction nonFic= new NonFiction("Anne Frank", 1000, "1900");
        nonFic.setTitle("Anne Frank");
        System.out.println(nonFic.description());
        nonFic.setBorrowDay(1);
        nonFic.setReturnDay(6);
        System.out.println(nonFic.isAvailable(9) );

        Reference ref= new Reference("World Maps", 10, "1977", "catgo");
        ref.setTitle("World Maps");
        System.out.println(ref.description());


        //singleton  Q2
        Printer p1;
        p1=Printer.get_instance();
        System.out.println( p1.getConnection());


    }
}
