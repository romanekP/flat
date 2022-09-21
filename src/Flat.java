public class Flat {
    private int floor;
    private String city;
    private boolean balcony;

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
    public boolean getBalcony(){
        return balcony;
    }
    public void setBalcony(boolean balcony){
        this.balcony = balcony;
    }
    public void setCity(String city){
        this.city = city;
    }
}
