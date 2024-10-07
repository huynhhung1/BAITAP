public class testb1_9 {
    public static void main(String[] args) {
        b1_9 b1_9= new b1_9(1.1f,2.2f,10,3.3f,4.4f);
        System.out.println(b1_9);

        b1_9.setX(80.0f);
        b1_9.setY(35.0f);
        b1_9.setRadius(5);
        b1_9.setXDelta(4.0f);
        b1_9.setYDelta(6.0f);
        System.out.println(b1_9);
        System.out.println("x is:"+b1_9.getX());
        System.out.println("y is:"+b1_9.getY());
        System.out.println("radius is:"+b1_9.getRadius());
        System.out.println("xDelta is:"+ b1_9.getXDelta());
        System.out.println("yDelta is:"+ b1_9.getYDelta());
        float xMin = 0.0f;
        float xMax = 100.0f;
        float yMin = 0.0f;
        float yMax = 50.0f;
        for (int i=0;i<15;i++){
            b1_9.move();
            System.out.println(b1_9);
            float xNew = b1_9.getX();
            float yNew = b1_9.getY();
            int radius = b1_9.getRadius();
            if (( xNew + radius)> xMax || (xNew-radius)< xMin){
                b1_9.reflectHorizontal();
                if (( yNew + radius)> xMax || (xNew-radius)< xMin){
                    b1_9.reflectVertical();
                }
            }
        }






    }


}
