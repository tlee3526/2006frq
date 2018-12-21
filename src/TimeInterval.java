public class TimeInterval {
    public static int start;
    public static int end;


    public TimeInterval(int start,int end)
    {
        this.start=start;
        this.end=end;
    }
    public boolean overlapsWith(TimeInterval interval) {
        if (this.start < interval.end && this.start > interval.start) {
            return true;
        }
        else if(interval.start > this.start && interval.end < this.end) {
            return true;
        }
        else{
            return false;
        }
    }
}