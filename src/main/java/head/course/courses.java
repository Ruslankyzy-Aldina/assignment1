package head.course;

public class courses {
    private String subject;
    private int credits;
    private int time;
    //constructor
    public courses(String subject, int credits, int time ){
        this.subject = subject;
        this.credits = credits;
        this.time = time;
    }
    public courses(){

    }
    //parameters
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }

    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits){
        this.credits = credits;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    //methods
    public String program(){
        return this.subject + " "+ this.credits+ " credits " + this.time +" hours";
    }

}
