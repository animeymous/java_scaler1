package Day_7;

public class TwoLineStarPattern {
    public void twoLineStarPattern(int row){
        for(int i = 0; i < row; i++){
            System.out.print("*"); //to print first star
            for (int j = 0; j < row -2; j++){
                System.out.print(" "); //to print spaces, which should be row - 2
            }
            System.out.println("*"); //to print last star
        }
    }
}
