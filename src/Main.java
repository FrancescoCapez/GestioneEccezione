import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Inserisci il primo numero:");
            int a = scanner.nextInt();
            System.out.println("Inserisci il secondo numero:");
            try {
                int b = scanner.nextInt();

                double c = a / b;
                System.out.println("IL VALORE DI c " + c);
            } catch (ArithmeticException e) {
                e.printStackTrace();
                System.err.println("Divisone per zero: " + e.getMessage());
            }
        } catch (InputMismatchException ie) {
            System.err.println("Devi inserire un numero!");
        }
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        String parola;
        try {
            parola = tastiera.readLine();
        } catch (IOException e) {
            System.out.println("errore nella lettura da tastiera");
        }
        File file = new File("prova.txt.");
        String riga;

        InputStream is = null;
        BufferedReader br = null;
        try {
            is = new FileInputStream(file);
            br = new BufferedReader(new InputStreamReader(is));
            riga = br.readLine();
            System.out.println(riga);
        } catch (FileNotFoundException e) {
            System.err.println("File non trovato");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            br.close();
        } catch (IOException e) {
            throw  new RuntimeException(e);
        }
        // scrittura file
        File f = new File ("prova.txt");
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(f));
            bw.write("ciao");
            bw.flush();
        } catch (IOException e) {
            System.err.println("Errore apertura file in output!");
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                System.err.println("Errore nella chiusura di file in output");
            }
        }
        DemoException DE = new DemoException();
        try {
            System.out.println(DE.somma(1,2));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}