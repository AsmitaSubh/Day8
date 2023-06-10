public class Quadratic
{
        public static void main(String[] args) {
            double a = 2.5;
            double b = -4.7;
            double c = 1.8;

            double delta = b * b - 4 * a * c;

            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        }
    }


