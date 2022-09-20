public class BmiService {

    public double index(double height, double weight) {

        double result;
        double h2 = height * height;
        result = weight / h2;
        return result;

    }
}




 /*public int calculate(int h, int m) {
        int index = m / ((h * h)/10000);
        return index;*/