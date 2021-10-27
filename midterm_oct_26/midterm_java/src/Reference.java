public class Reference extends Book{
    private String category;

    public Reference(String title, double price, String publishYear, String category) {
        super(title, price, publishYear);
        this.category = category;
    }

    @Override
    public String description(){
        return this.getTitle() + " all information is real." ;
    }
}
