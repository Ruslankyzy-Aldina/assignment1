package head.professor;

public class professor {
    private String fullname;
    private int experience;


    public professor(String fullname, int experience) {
        this.fullname = fullname;
        this.experience = experience;
    }

    public professor() {}

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String teacher() {
        return this.fullname + " " + this.experience + " years";
    }
}
