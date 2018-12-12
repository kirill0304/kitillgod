public class Place {
    private Integer ID;
    private Integer HallID;
    private Integer NumberOfRow;
    private Integer NumberOfSeats;
    private Hall hall;


    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getHallID() {
        return HallID;
    }

    public void setHallID(Integer hallID) {
        HallID = hallID;
    }

    public Integer getNumberOfRow() {
        return NumberOfRow;
    }

    public void setNumberOfRow(Integer numberOfRow) {
        NumberOfRow = numberOfRow;
    }

    public Integer getNumberOfSeats() {
        return NumberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        NumberOfSeats = numberOfSeats;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }
}
