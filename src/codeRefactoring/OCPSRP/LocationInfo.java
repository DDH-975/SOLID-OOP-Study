package codeRefactoring.OCPSRP;

public class LocationInfo {
    private String location;
    private int nx;
    private int ny;

    public LocationInfo(String location, int nx, int ny) {
        this.location = location;
        this.nx = nx;
        this.ny = ny;
    }

    public String getCity(){ return location; }
    public int getNx(){ return nx; }
    public int getNy(){ return ny; }
}
