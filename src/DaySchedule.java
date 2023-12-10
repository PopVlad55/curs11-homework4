import java.time.DayOfWeek;
import java.util.List;
import java.util.ArrayList;

class DaySchedule {
    private DayOfWeek day;
    private List<String> activities;

    public DaySchedule(DayOfWeek day) {
        this.day = day;
        this.activities = new ArrayList<>();
    }

    public DayOfWeek getDay() {
        return day;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void addActivity(String activity){
        activities.add(activity);
    }

    @Override
    public String toString() {
        return  day + " schedule: " + activities;

    }
}
