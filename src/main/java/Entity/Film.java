package Entity;

public class Film {
    private Integer ID;
    private String title;
    private Integer duration;
    private String StartHire;
    private String EndHire;

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

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getStartHire() {
        return StartHire;
    }

    public void setStartHire(String startHire) {
        StartHire = startHire;
    }

    public String getEndHire() {
        return EndHire;
    }

    public void setEndHire(String endHire) {
        EndHire = endHire;
    }
}