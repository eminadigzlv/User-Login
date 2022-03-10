package az.jobs.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class Tasks {

    private  long id;
    private  String tittle;
    private  String description;
    private LocalDate startDate;
    private  LocalDate endDate;
    private  String userName;

    public Tasks() {
        this.id = 0;
        this.tittle = "";
        this.description = "";
        this.startDate = null;
        this.endDate = null;
        this.userName = "";
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", userName='" + userName + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
