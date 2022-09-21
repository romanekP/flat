public class Flat {
    int floor;
    String city;
    boolean balcony;

    Flat(int floor, String city, boolean balcony) {
        this.floor = floor;
        this.city = city;
        this.balcony = balcony;
    }
    public int getFloor(){
        return floor;
    }
    public String getCity(){
        return city;
    }
}
