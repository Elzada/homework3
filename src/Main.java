public class Main {

    public static void main(String[] args) {
        String names[] = new String[3];
        names[0] = "Miraida";
        names[1] = "Zharkynay";
        names[2] = "Elena";

        for (String justcoffee : names) {

            switch (justcoffee) {
                case "Miraida":

                    System.out.println("Доброе утро," + justcoffee + "!");
                    break;
                case "Zharkynay":

                    System.out.println("Доброе день,"  + justcoffee + "!");
                    break;
                case "Elena":

                    System.out.println("Доброе вечер," + justcoffee + "!");
                    break;


            }
        }
    }
}



