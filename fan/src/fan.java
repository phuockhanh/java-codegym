public class fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public static int getSLOW() {
        return SLOW;
    }

    public static int getMEDIUM() {
        return MEDIUM;
    }

    public static int getFAST() {
        return FAST;
    }

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
    fan(){

    }
    public String toString(){
        String properties = "";
        if(isOn()==true){
            properties = "Speed : "+getSpeed() + "  Color: " + getColor() + " Radius : " +getRadius() + " fan is on ";
            return properties;
        }
        else{
            properties = " Color : " + getColor() + " Radius : " +getRadius() + " fan is off ";
            return properties;
        }
    }

    public static void main(String[] args) {
        fan fan1 = new fan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());
        fan fan2= new fan();
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan1.setOn(false);
        System.out.println(fan2.toString());
    }
}
