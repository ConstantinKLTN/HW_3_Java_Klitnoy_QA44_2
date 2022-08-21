public class Main {

        public static void main(String[] args) {

            BmiService service = new BmiService();
            java.text.DecimalFormat df = new java.text.DecimalFormat("#.##");


            System.out.println();
            System.out.println("Рост: 1м 75см, вес: 115");
            System.out.println("Ваш индекс массы тела: " + df.format(service.index(1.75, 115)));

            System.out.println();
            System.out.println("Рост: 1м 65см, вес: 56");
            System.out.println("Ваш индекс массы тела: " + df.format(service.index(1.65, 56)));

            System.out.println();
            System.out.println("Рост: 1м 97см, вес: 110");
            System.out.println("Ваш индекс массы тела: " + df.format(service.index(1.97, 110)));

    }
    /*BmiService service = new BmiService();
        int h; // Рост человека
        int m; // Вес человека
        int index = service.calculate(165,55);
        System.out.println();
        System.out.println("Ваш индекс массы тела:");
        System.out.println(index);*/
}
