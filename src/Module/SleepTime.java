package Module;

public class SleepTime extends Baby{

    private int hour;
    private int minute;
    private int second;

    public SleepTime (){
        hour = 0;
        minute = 0;
        second = 0;
    }

    public SleepTime(int Hour, int Minute, int Second){

        hour = Hour;
        minute = Minute;
        second = Second;

    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
