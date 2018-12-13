
import Entity.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.hibernate.Query;
import org.hibernate.Session;
import persistence.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Session session = HibernateUtil.getSessionFactory().openSession();
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
                place1.setNumberOfSeat(4);



         Tickets tickets1 = new Tickets();
                tickets1.setID(1);
                tickets1.setReleaseDate("20-04-2012");
                tickets1.setSesion(sesion1);
                tickets1.setSesionID(sesion1.getID());
                tickets1.setPlace(place1);
                tickets1.setPlaceID(place1.getID());
                tickets1.setBooking(0);
                tickets1.setPrice(20);

        Query query1= session.createQuery("SELECT a FROM Film a");
        List<Film> film2 =query1.list();
        System.out.println(film2);

        Query query = session.createQuery("SELECT a FROM Film a");
        List<Film> film = query.list();
        query = session.createQuery("SELECT a FROM Hall a");
        List<Hall> hall = query.list();
        query = session.createQuery("SELECT a FROM Place a");
        List<Place> place = query.list();
        query = session.createQuery("SELECT a FROM Sesion a");
        List<Sesion> sesion = query.list();
        query = session.createQuery("SELECT a FROM Tickets a");
        List<Tickets> tickets = query.list();


        XmlMapper xmlMapper = new XmlMapper();
        try {
            xmlMapper.writeValue(new File("src/main/java/tests/Hall.xml"), hall);
            xmlMapper.writeValue(new File("src/main/java/tests/Tickets.xml"), tickets);
            xmlMapper.writeValue(new File("src/main/java/tests/Sesion.xml"), sesion);
            xmlMapper.writeValue(new File("src/main/java/tests/Place.xml"), place);
            xmlMapper.writeValue(new File("src/main/java/tests/Film.xml"), film);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Query queryy = session.createQuery("SELECT a FROM Film a");
        List<Film> film0 = queryy.list();
        queryy = session.createQuery("SELECT a FROM Hall a");
        List<Hall> hall0 = queryy.list();
        queryy = session.createQuery("SELECT a FROM Place a");
        List<Place> place0 = queryy.list();
        queryy = session.createQuery("SELECT a FROM Sesion a");
        List<Sesion> sesion0 = queryy.list();
        queryy = session.createQuery("SELECT a FROM Tickets a");
        List<Tickets> tickets0 = queryy.list();


        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("src/main/java/tests/Hall.json"), hall0);
            objectMapper.writeValue(new File("src/main/java/tests/Tickets.json"), tickets0);
            objectMapper.writeValue(new File("src/main/java/tests/Sesion.json"), sesion0);
            objectMapper.writeValue(new File("src/main/java/tests/Place.json"), place0);
            objectMapper.writeValue(new File("src/main/java/tests/Film.json"), film0);
        } catch (IOException e) {
            e.printStackTrace();
        }



        session.save(film1);
        session.save(hall1);
        session.save(sesion1);
        session.save(place1);
        session.save(tickets1);

        session.getTransaction().commit();

    }


}
