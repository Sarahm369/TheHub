import java.util.ArrayList;
import java.util.Date;

public class EventCalendar {
    private ArrayList<Event> events;

    public EventCalendar() {
        events = new ArrayList<Event>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void removeEvent(Event event) {
        events.remove(event);
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public ArrayList<Event> getEvents(Date startDate, Date endDate) {
        ArrayList<Event> filteredEvents = new ArrayList<Event>();
        for (Event event : events) {
            if (event.getStartDate().compareTo(startDate) >= 0 && event.getEndDate().compareTo(endDate) <= 0) {
                filteredEvents.add(event);
            }
        }
        return filteredEvents;
    }
}

class Event {
    private String name;
    private Date startDate;
    private Date endDate;
    private String location;
    private String description;

    public Event(String name, Date startDate, Date endDate, String location, String description) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
