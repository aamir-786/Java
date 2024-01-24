public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    Time(int hours , int minutes , int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

    }
    Time(){
        Time time;

    }
   int  Sethours(int hours){
        //this.hours = hours;
    return hours;
    }
     void  SetMinutes(int minutes){
     this.minutes = minutes;
    }
    void  SetSeconds(int seconds){
        this.seconds=seconds;
    }
    void GetHours(int hours){
        this.hours = hours;
    }
    int GetMinutes(){
        return minutes;
    }
    int GetSeconds(){
        return seconds;
    }
    // method toString
    public String toString(){
        return   hours + " hours " +   minutes+ " minutes "  + seconds + " seconds";
    }
   void compareTo(Object o){

   }
}
