import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
import java.text.DecimalFormat;
public class floor {
    public static void main(String[] args) {
        String dimensions;
        Scanner a = new Scanner( System.in );
        Scanner b = new Scanner( System.in );
        Scanner c = new Scanner( System.in );
        System.out.println("Enter the dimensions of the floor. [w*h]");
        dimensions = a.next();
        String[] wh = dimensions.split("\\*");
        float w = Float.parseFloat(wh[0]);
        float h = Float.parseFloat(wh[1]);
        float f = (w*h);
        System.out.println("Assuming square tile, enter its side length.");
        String xb = b.next();
        System.out.println("Enter the cost of one tile.");
        String yb = c.next();
        float x = Float.parseFloat(xb);
        float y = Float.parseFloat(yb);
        float e = (x*x);
        float z = (f/e);
        float m = (z*y);
        double v = m;
        Locale lc = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(lc);
        System.out.println("You would have to buy " + z + " tiles, which would total " + currencyFormatter.format(v) + ".");

    
    }
}