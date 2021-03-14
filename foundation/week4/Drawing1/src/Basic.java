public class Basic {

    //Shapes
    public static void drawImage(Graphics graphics){
        graphics.drawLine(0, 0, 200, 50);
        graphics.drawRect(50, 50, 100, 90);
        graphics.fillRect(60, 60, 100, 90);
        graphics.fillOval(120, 10, 180, 90);
    }
    //Colors
    public static void drawImage(Graphics graphics){
        graphics.fillRect(200,200,200,200);
        graphics.setColor(new Color(200,200,0,150));
        graphics.fillRect(210,210,200,200);
    }
    //Polygons
    public static void drawImage(Graphics graphics){
        int xpoints[] = {25, 145, 25, 145, 25};
        int ypoints[] = {25, 25, 145, 145, 25};
        int npoints = 5;

        graphics.drawPolygon(xpoints, ypoints, npoints);
    }
}
