

public class Sesion {
    private Integer ID;
    private Integer HallID;
    private String DataFilm;
    private Integer TimeFilm;
    private Integer FilmID;
    private Film film;
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

    public String getDataFilm() {
        return DataFilm;
    }

    public void setDataFilm(String dataFilm) {
        DataFilm = dataFilm;
    }

    public Integer getTimeFilm() {
        return TimeFilm;
    }

    public void setTimeFilm(Integer timeFilm) {
        TimeFilm = timeFilm;
    }

    public Integer getFilmID() {
        return FilmID;
    }

    public void setFilmID(Integer filmID) {
        FilmID = filmID;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }
}
