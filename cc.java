import java.util.Arrays;
public class cc {
    public static void main(String[] args) {
        String card = args[0];
        char checkb = card.charAt(card.length()-1);
        String check = Character.toString(checkb);
        String carda = card.substring(0,card.length()-1);
        String cardb[] = carda.split("(?!^)");
        int[] cardc = new int[cardb.length];
        for (int u = 0; u < cardb.length; u++) {
            try {
                cardc[u] = Integer.parseInt(cardb[u]);
            } catch (NumberFormatException nfe) {};
        }
        for (int i = 0; i < cardb.length; i++) {
            if ((i+1) % 2 == 1) {
                int x = cardc[i];
                x = (x*2);
                cardc[i] = x;
            } else {}
        }
        for (int i = 0; i < cardb.length; i++) {
            int x = cardc[i];
            if (x >= 10) {                
                cardc[i] = (x-9);
            }
        }
        int a = 0;
        for (int i = 0; i < cardb.length; i++) {
            a += cardc[i];
        }
        a = (a*9);
        int mod = (a % 10);
        boolean eval = (Integer.parseInt(check)==mod);
        if (eval) {
            System.out.println("This card number is valid.");
        } else {
            System.out.println("This card number is not valid.");
        }
    }
}