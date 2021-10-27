package Question1;

public class Reference extends Book{
    private String category;
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public Reference(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public String description() {

        String res;
        res=getTitle().concat(" all information is real");
        return res;
    }
}
