public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(){

    }
    public float getxSpeed() {
        return xSpeed;
    }
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getySpeed() {
        return ySpeed;
    }
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] arrSpeed = new float[2];
        arrSpeed[0] = xSpeed;
        arrSpeed[1] = ySpeed;
        return arrSpeed;
    }
    public String toString(){
        return super.toString() +",Speed = (" +xSpeed+","+ySpeed+")";
    }
    public MoveablePoint move(){
        setX(getX() + getxSpeed());
        setY(getY()+ getySpeed());
        return this;
    }
}
