import java.time.LocalDate;

public class Spielort {
    int Id;
    String team1;
    String team2;
    LocalDate date;
    String city;
    int capacity;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Spielort(){

    }

    public Spielort(int Id, String team1, String team2, LocalDate date, String city, int capacity) {
        this.Id = Id;
        this.team1 = team1;
        this.team2 = team2;
        this.date = date;
        this.city = city;
        this.capacity = capacity;
    }
}