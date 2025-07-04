package Day_9;

public class AreaofCircle {

    //funciton to calculate area of the circle
    public static float calAreaOfCircle(int A){
        final float pie = 3.1416f; //took final and float for storing pie value
        float area = A * pie;

        return Math.round(area * 100)/100f; //approach to round off till 2 decimal point
    }

    //function to return area of circle
    public float areaofCircle(int A){
        return calAreaOfCircle(A);
    }
}
