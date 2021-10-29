public class Psychiatrist {
    private Moody moody;
//    private Moody mood_observe;

    public void examine( Moody mood){
        this.moody= mood;
        moody.getMood();
    }
    public void observe(Moody mood){
        mood.toString();
    }


    public Moody getMoody() {
        return moody;
    }


    @Override
    public String toString(){
        return moody.toString();
    }
}
