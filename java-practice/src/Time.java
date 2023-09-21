public class Time {
    private int hours;
    private int minutes;

    public Time(int h, int m) {
        hours = h;
        minutes = m;
    }

    @Override
    public String toString() {
        return (hours < 10 ?"0":"")+hours + ":" + (minutes < 10 ? "0" : "") + minutes;
    }

    public static void main(String[] args) {
        Time time = new Time(16, 30);
        System.out.println("Time: " + time);
    }
}