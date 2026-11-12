public class DemoException {// file: DemoException.java

    public int somma(int a, int b) throws Exception {
        int somma = a + b;
        if (somma > 10) throw new Exception("Somma:" + somma + ">10 !!");
        return (somma);
    }

    public int doppio(int a) {
        try {
            return somma(a, a);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}