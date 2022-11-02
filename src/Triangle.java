public class Triangle {
    float a;
    float b;
    float c;

    float area() {
        double ar = 0;
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            double x = (a + b + c) / 2;
            ar = Math.sqrt(x * (x - a) * (x - b) * (x - c));
        }
        return (float) ar;
    }
}
