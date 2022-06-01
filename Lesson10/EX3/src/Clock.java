public class Clock {
    int hours = 12;
    int minutes = 0;
    public void setHours() {
        this.hours = hours;
        if (this.hours>13)
            this.hours=1;
    }
    public void setMinutes() {
        this.minutes = minutes+1;
        if (this.minutes>=59){
            this.hours++;
            this.minutes=0;
        }
    }
    public void getHours() {
        if (this.hours<10)
            System.out.print('0');
        System.out.print(this.hours);
        System.out.print(':');
    }
    public void getMinutes() {
        if (this.minutes<10)
            System.out.print('0');
        System.out.print(this.minutes);
    }
    public void next(){
        setMinutes();
        setHours();
        getHours();
        getMinutes();
    }
}
