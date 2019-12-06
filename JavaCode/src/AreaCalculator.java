public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(35));
        System.out.println(area(10, 15));
    }

    public static double area(double radius){
        if(radius < 0){
            return -1;
        }else{
            double areaOfCircle = (3.14159*radius*radius);
            return areaOfCircle;
        }
    }

    public static double area(double x, double y){
        if(x<0 || y<0){
            return -1;
        }else{
            double areaOfRectangle = x*y;
            return areaOfRectangle;
        }
    }

}