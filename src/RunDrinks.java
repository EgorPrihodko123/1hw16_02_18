import Drinks.American_Coffee;
import Drinks.Black_Coffee;
import Drinks.Green_Tea;

public class RunDrinks {
    public static void main(String[] args) {


        American_Coffee cof = new American_Coffee();
    cof.full_price(2,0,0);
        Black_Coffee cof2=new Black_Coffee();
        cof2.full_price(3,2,5);
        Green_Tea tea=new Green_Tea();
        tea.full_price(2,3,5);
    }
}