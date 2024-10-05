public class b1_3   {
    private float length;
    private float width;

    public b1_3( float length, float width) {
        this.length = length;
        this.width = width;

    }

    public b1_3() {

    }

    public float getLength() {
        return length;

    }
    public void setLength( float length ) {
        this.length = length;

    }
    public float getWidth() {
        return width;

    }
    public void setWidth( float width ) {
        this.width = width;

    }
    public float getArea(){
        return length * width;




    }
    public float getPerimeter(){
        return 2*(length+width);

    }
    @Override
    public String toString() {
        return "b1_3 [length=" + length + ", width=" + width + "]";

    }

}
