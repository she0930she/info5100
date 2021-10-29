public class Sad extends Moody{
    public Sad() {
    }
    public String getMood(){
        return "I am sad today.";
    }
    public void expressFeelings(){
        System.out.println("sobbinggggg.");
    }
    @Override
    public String toString(){
        return "Subject cries a lot";
    }

}
