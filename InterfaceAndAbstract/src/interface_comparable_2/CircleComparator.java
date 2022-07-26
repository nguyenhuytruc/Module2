package interface_comparable_2;

import interface_comparable_1.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle>{
    public int compare(Circle c1, Circle c2){
        if (c1.getR() > c2.getR()) return 1;
        else if (c1.getR() < c2.getR())return -1;
        else return  0;
    }
}
