public class slideExample {
    public static void main(String[] args) {

        int k[] = { 1, 2, 3 };

        k[1] = k[2];

        int x[] = new int[10];

        for (int i = 0; i < x.length; i++) { //atribui

            x[i] = i; 

        }

        for (int i = 0; i < x.length; i++) { //mostrei

            System.out.println(x[i] + " "); 

        }

        System.out.println(k[1]);
    }
}