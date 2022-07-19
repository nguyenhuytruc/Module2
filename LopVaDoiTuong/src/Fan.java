public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Fan(){

    }
    public String toString(){
        if(on){
            return "Speed: " + getSpeed() + ", Color:" + getColor() + ", Radius: " + getRadius() + " fan is on";
        }else {
            return "Speed: " + getSpeed() + ", Color: " + getColor() + ", Radius: " + getRadius() + " fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10.0);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        Fan fan2=new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        System.out.println("fan1: "+ fan1);
        System.out.println("fan2: "+ fan2);
    }
}
