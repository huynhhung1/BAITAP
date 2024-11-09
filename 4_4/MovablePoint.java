package BTC4;

import java.awt.*;

public class MovablePoint extends Point4_4 {
    float xSpeed=0.0f;
    float ySpeed=0.0f;
    public MovablePoint() {
        super();
    }
    public MovablePoint(float x,float y,float xSpeed,float ySpeed) {
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;

    }
    public MovablePoint(float xSpeed,float ySpeed) {
        super(xSpeed,ySpeed);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float getXSpeed() {
        return xSpeed;
    }
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;

    }
    public void setSpeed(float xSpeed,float ySpeed) {
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{xSpeed,ySpeed};

    }
    public String toString(){
        return super.toString()+",speed=("+xSpeed+","+ySpeed+")";
    }
    public MovablePoint move(){
        setXY(getX()+xSpeed,getY()+ySpeed);
        return this;

    }
}