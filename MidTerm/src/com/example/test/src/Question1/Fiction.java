package Question1;

public class Fiction extends Book implements iBorrowable{
    int borrowDate;
    int returnDate;
    public int getBorrowDate() {
        return borrowDate;
    }

    public int getReturnDate() {
        return returnDate;
    }


    public Fiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public void setBorrowDate(int day) {

        this.borrowDate=day;
    }

    @Override
    public void setReturnDate(int day) {

        this.returnDate=returnDate;
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
        res=getTitle().concat(" all events are imaginary and not based on real facts");
        return res;
    };

}
