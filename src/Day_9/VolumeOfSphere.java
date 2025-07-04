package Day_9;

public class VolumeOfSphere {

    //function to calculate volume of sphere
    public static double calSphereVolume(int A){
        return (4.0 / 3.0) * Math.PI * Math.pow(A, 3);
    }

    //function to return volume of sphere
    public double volumeOfSphere(int A){
        return calSphereVolume(A);
    }
}
