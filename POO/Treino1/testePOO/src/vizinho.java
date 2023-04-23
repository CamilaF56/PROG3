public class vizinho {
    String name;
    byte idade;
    boolean calistenico;

    public void mortal() {
        if (idade < 35 || calistenico) {
            System.out.println(name + " deu um mortal");
        } else {
            System.out.println(name + " não conseguiu dar um mortal, muito velho ou sedentário");
        }
    }

}
