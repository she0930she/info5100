public class Main {

    public static void main(String[] args) {
	// write your code here
        Moody mood_S= new Sad();
        Moody mood_H= new Happy();
        Psychiatrist psy= new Psychiatrist();

        System.out.println("Q1");
        psy.examine(mood_H);
        System.out.println("How are you feeling today?");
        System.out.println( psy.getMoody().getMood());
        psy.getMoody().expressFeelings();
        System.out.println("Observation: "+psy.getMoody().toString());
        System.out.println();

        Psychiatrist psy2= new Psychiatrist();
        psy2.examine(mood_S);
        System.out.println("How are you feeling today?");
        System.out.println( psy2.getMoody().getMood() );
        psy2.getMoody().expressFeelings();
        System.out.println("Observation: "+psy2.getMoody().toString());
        System.out.println();

        System.out.println("Q2");


    }
}
