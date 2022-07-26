package interface_comparable_1;


public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(){}

    public ComparableCircle(double radius){
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled){
        super(color, filled, radius);
    }

    public int compareTo(ComparableCircle o){
        if (getR() > o.getR()) return 1;
        else if (getR()< o.getR()) return -1;
        else return -1;
    }
}
