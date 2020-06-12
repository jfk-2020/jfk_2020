package Class_Functionals.Prism;

public class Prism {
    private int pHeight;
    private double bottomArea;

    public Prism(int pHeight, double bottomArea) {
        this.pHeight = pHeight;
        this.bottomArea = bottomArea;
    }

    public double volume() {
        return pHeight * bottomArea;
    }
}
