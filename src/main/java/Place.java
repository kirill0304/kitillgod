public class Place {
    private Integer ID;
    private Integer HallID;
    private Integer NumberOfRow;
    private Integer NumberOfSeat;
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

    public Integer getNumberOfSeat() {
        return NumberOfSeat;
    }

    public void setNumberOfSeat(Integer numberOfSeat) {
        NumberOfSeat = numberOfSeat;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }
}
