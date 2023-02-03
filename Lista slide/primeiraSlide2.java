public class primeiraSlide2 {
    public static void main(String[] args) {

        for (int i = 30; i <= 60; i++) {

            float c = 0.0f;
            c = (5 * (i - 32)) / 9;

            System.out.println("[Fahrenheint: " + i + "]");
            System.out.println("[Celsius: " + c + "]\n");

        }

    }
}