public class Main {
    public static void main (String[] args) {
        calcTriangleArea(10.0, 5.0);
        calcCircleArea(5.0);
    }
    public static double calcTriangleArea(double bottom, double height) {
        double area = bottom * height / 2;
        System.out.printf("三角形の底辺の長さが%.1fcm、高さが%.1fcmの場合、面積は%.1fcm^2\n", bottom, height, area);
        return area;
    }
    
    public static double calcCircleArea(double radius) {
        double area = radius * radius * Math.PI;
        System.out.printf("円の半径が%.1fcmの場合、面積は%.1fcm^2\n", radius, area);
        return area;
    }
}
