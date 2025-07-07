package Day_9;

public class FavouriteChocolate {

    //this function will calculate how many number number of chocolates user can buy
    public int calculateChocolate(int A, int B, int C){
        int result = A/B; // total money / cost of one chocolate

        return Math.min(result, C); // if no. of chocs exceeding we will return maximum chocs else whatever value we got
    }

    public int favouriteChocolate(int A, int B, int C){
        return calculateChocolate(A, B,C);
    }
}
