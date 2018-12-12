package Entity;

public class Hall {
    private Integer ID;
    private String title;
    private Integer NumberOfSeats;
    private Integer NumberOfRows;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getNumberOfSeats() {
        return NumberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        NumberOfSeats = numberOfSeats;
    }

    public Integer getNumberOfRows() {
        return NumberOfRows;
    }

    public void setNumberOfRows(Integer numberOfRows) {
        NumberOfRows = numberOfRows;
    }
}
