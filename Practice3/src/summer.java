import java.util.Scanner;

public class summer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String TimeofDay = scanner.nextLine();
        String Outfit = "";
        String Shoes="";

        if (degrees >= 10 && degrees <= 18) {
            if (TimeofDay.equals("Morning")) {
                Outfit = "Sweatshirt";
                Shoes = "Sneakers";

            } else if (TimeofDay.equals("Afternoon")) {
                Outfit = "Shirt";
                Shoes = "Moccasins";

            } else if (TimeofDay.equals("Evening")){
                Outfit = "Shirt";
                Shoes = "Moccasins";

            }
        }

        else if (degrees >= 18 && degrees <= 24) {
            if (TimeofDay.equals("Morning")) {
                Outfit = "Shirt";
                Shoes = "Moccasins";

            } else if (TimeofDay.equals("Afternoon")) {
                Outfit = "T-Shirt";
                Shoes = "Sandals";

            } else if (TimeofDay.equals("Evening")){
                Outfit = "Shirt";
                Shoes = "Moccasins";

            }
        }

        else if (degrees>=25){
            if (TimeofDay.equals("Morning")) {
                Outfit = "T-Shirt";
                Shoes = "Sandals";

            } else if (TimeofDay.equals("Afternoon")) {
                Outfit = "Swim Suit";
                Shoes = "Barefoot";

            } else if (TimeofDay.equals("Evening")){
                Outfit = "Shirt";
                Shoes = "Moccasins";

            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, Outfit, Shoes);
    }
}

