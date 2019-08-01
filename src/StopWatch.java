

public class StopWatch {
    private long startime;
    private long endTime;


    public long getStartime() {
        return startime;
    }

    public void setStartime(long startime) {
        this.startime = startime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public StopWatch() {
        this.startime =System.currentTimeMillis();
    }


    public void start() {
        this.startime =System.currentTimeMillis();
    }

    public void stop() {
        this.endTime =System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startime;
    }

}
