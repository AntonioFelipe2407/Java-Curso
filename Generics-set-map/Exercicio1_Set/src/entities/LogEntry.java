package entities;

import java.time.Instant;
import java.util.Objects;

public class LogEntry {
    private String userName;
    private Instant moment;

    //Constructor
    public LogEntry(String userName, Instant moment) {
        this.userName = userName;
        this.moment = moment;
    }

    //Gatters and Setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    //HashCode e Equals comparam o nome
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(userName, logEntry.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(userName);
    }
}
