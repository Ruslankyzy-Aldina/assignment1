package head.university;

public class Uni {
    private String name;
    private int years;
    private String city;
    public Uni(String name,String city, int years){
        this.name=name;
        this.years = years;
        this.city = city;

    }

    public Uni() {

    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears(){
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String City){
        this.city = city;
    }

    public String print(){
        return this.name + " "+ this.years + " years " + this.city ;
    }

}
