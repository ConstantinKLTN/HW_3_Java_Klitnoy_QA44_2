public class BmiService {

    public double index(double h, double m) {

        double result;
        double h2 = h * h;
        result = m / h2;
        return result;

    }
}




 /*public int calculate(int h, int m) {
        int index = m / ((h * h)/10000);
        return index;*/