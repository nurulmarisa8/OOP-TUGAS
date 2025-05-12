package appbook.models;

public abstract class LibraryItem {
    
    protected String title;
    protected int itemId;
    protected Boolean isBorrowed;


    public LibraryItem(String title, int itemId, Boolean isBorrowed){
        this.title = title;
        this.itemId = itemId;
        this.isBorrowed = isBorrowed;
    }

    public abstract void getDescription(String itemId);

    public abstract String borrowItem(int days);

    public abstract double calculateFine(int daysLate);

    public String returnItem(){
        this.isBorrowed = false;
        return title + " di kembalikan";
    }

    
}
