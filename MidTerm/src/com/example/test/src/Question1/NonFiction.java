package Question1;

public class NonFiction extends Book implements iBorrowable{
    int borrowDate;

    public int getBorrowDate() {
        return borrowDate;
    }

    public int getReturnDate() {
        return returnDate;
    }

    int returnDate;

    public NonFiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public void setBorrowDate(int day) {
        this.borrowDate=day;

    }

    @Override
    public void setReturnDate(int day) {
        this.returnDate=day;

    }

    @Override
    public boolean isAvailable(int day) {
        if (getBorrowDate()==getReturnDate()| (getReturnDate()<day & day<getBorrowDate()))
        {
            return true;
        }
        return false;
    }

    public String description(){
        String res;
        res=getTitle().concat(" all events are true and based on real facts");
        return res;
    };
}
