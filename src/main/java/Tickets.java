import java.util.Date;

public class Tickets {
    private Integer ID;
    private String ReleaseDate;
    private Integer SesionID;
    private Integer PlaceID;
    private Integer Booking;
    private Integer Price;
    private Integer SellerID;
    private Place place;
    private Sesion sesion;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        ReleaseDate = releaseDate;
    }

    public Integer getSesionID() {
        return SesionID;
    }

    public void setSesionID(Integer sesionID) {
        SesionID = sesionID;
    }

    public Integer getPlaceID() {
        return PlaceID;
    }

    public void setPlaceID(Integer placeID) {
        PlaceID = placeID;
    }

    public Integer getBooking() {
        return Booking;
    }

    public void setBooking(Integer booking) {
        Booking = booking;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }

    public Integer getSellerID() {
        return SellerID;
    }

    public void setSellerID(Integer sellerID) {
        SellerID = sellerID;
    }


    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Sesion getSesion() {
        return sesion;
    }

    public void setSesion(Sesion sesion) {
        this.sesion = sesion;
    }
}
