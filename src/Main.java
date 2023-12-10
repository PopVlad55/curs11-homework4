import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        DaySchedule mondaySchedule = new DaySchedule(DayOfWeek.MONDAY);
        mondaySchedule.addActivity("Lunch");
        mondaySchedule.addActivity("Go to work");
        mondaySchedule.addActivity("Dinner");

        System.out.println("Monday Schedule: " + mondaySchedule);


        DaySchedule fridaySchedule = new DaySchedule(DayOfWeek.FRIDAY);
        fridaySchedule.addActivity("Lunch");
        fridaySchedule.addActivity("Bike ride");
        fridaySchedule.addActivity("Road trip");

        System.out.println("Friday Schedule: " + fridaySchedule);

    }
}
