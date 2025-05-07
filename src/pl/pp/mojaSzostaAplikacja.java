package pl.pp;

public class mojaSzostaAplikacja {

        public static void main(String[] args) {

            int N = 50;
            System.out.println("Obliczamy silnię liczby " + N);


            long startIter = System.nanoTime();
            long factorialIter = factorialIterative(N);
            long endIter = System.nanoTime();
            long timeIter = endIter - startIter;

            System.out.println("Iteracyjniee: " + N + "! = " + factorialIter);
            System.out.println("Czas wykonania metody iteracyjnej: " + timeIter + " ns");


            long startRec = System.nanoTime();
            long factorialRec = factorialRecursive(N);
            long endRec = System.nanoTime();
            long timeRec = endRec - startRec;

            System.out.println("Rekurencyjnie: " + N + "! = " + factorialRec);
            System.out.println("Czas wykonania metody rekurencyjnej: " + timeRec + " ns");
        }


        public static long factorialIterative(int n) {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }


        public static long factorialRecursive(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * factorialRecursive(n - 1);
            }
        }
    }