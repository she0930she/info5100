public class Printer {
    public Printer() {
    }
    private static Printer _instance;
    private static final Object obj= new Object();


    public static Printer get_instance(){

        if (_instance == null) {
            synchronized (obj) {
                if (_instance == null) {
                    _instance = new Printer();
                }
            }
        }
        return _instance;
    }

    public static String getConnection(){
        return "Your Printer is working. ";
    }
}
