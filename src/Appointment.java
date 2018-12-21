public class Appointment {
    private TimeInterval TMI;

    public Appointment(TimeInterval TMI) {
        this.TMI = TMI;
    }

    public TimeInterval getTime() {
        return this.TMI;
    }

    public boolean conflictsWith(Appointment other) {
        return getTime().overlapsWith(other.getTime());
    }
}