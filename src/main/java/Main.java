import com.fasterxml.jackson.databind.ObjectMapper;
import org.hibernate.Session;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        Session session = HibernateUtil.getSessionFactory().openSesion();
        session.beginTransaction();
        Film film1 = new Film();
                film1.setID(1);
                film1.setTitle("Miss you");
                film1.setDuration(120);
                film1.setStartHire("12-10-2012");
                film1.setEndHire("03-04-2013");

         Hall hall1 = new Hall();
            hall1.setID(1);
            hall1.setTitle("Moscow");
            hall1.setNumberOfRows(12);
            hall1.setNumberOfSeats(13);

         Sesion sesion1 = new Sesion();
                sesion1.setID(1);
                sesion1.setHallID(1);
                sesion1.setDataFilm("03-11-2012");
                sesion1.setTimeFilm(120);
                sesion1.setFilm(film1);
                sesion1.setFilmID(film1.getID());
                sesion1.setHall(hall1);
                sesion1.setHallID(hall1.getID());


         Place place1 = new Place();
                place1.setID(1);
                place1.setHall(hall1);
                place1.setHallID(hall1.getID());
                place1.setNumberOfRow(2);
                place1.setNumberOfSeats(4);



         Tickets tickets1 = new Tickets();
                tickets1.setID(1);
                tickets1.setReleaseDate("20-04-2012");
                tickets1.setSesion(sesion1);
                tickets1.setSesionID(sesion1.getID());
                tickets1.setPlace(place1);
                tickets1.setPlaceID(place1.getID());
                tickets1.setBooking(0);
                tickets1.setPrice(20);


        session.save(film1);
        session.save(hall1);
        session.save(sesion1);
        session.save(place1);
        session.save(tickets1);

        session.getTransaction().commit();

    }

}
