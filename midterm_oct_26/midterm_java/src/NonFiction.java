public class NonFiction extends Book implements iBorrowable{
    private int startDay;
    private int endDay;


    public NonFiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public String description(){
        return this.getTitle() + "all events are true and based on real facts." ;
    }

    @Override
    public void setBorrowDay( int startDay){
        this.startDay= startDay;
    }

    @Override
    public void setReturnDay(int endDay){
        this.endDay= endDay;
    }

    @Override
    public boolean isAvailable(int day){
        if (day <startDay) return true;
        if (day > endDay) return true;
        return false;
    }


}
