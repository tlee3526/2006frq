public class Runner {

    public static void main(String[] args) {

        TimeInterval one = new TimeInterval(8,11);
        TimeInterval two = new TimeInterval(12,13);

        Appointment OneA=new Appointment(one);
        Appointment TwoB=new Appointment(two);

        System.out.println(OneA.conflictsWith(TwoB));

        DailySchedule Calender = new DailySchedule();

        System.out.println(Calender.addAppt(OneA,false));
        System.out.println(Calender.addAppt(TwoB,false));

        Calender.getSchedule();

    }
}
}
