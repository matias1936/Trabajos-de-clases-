public class Main {

public static void main(String[] args) {
Texto t = new Texto(5);

t.addPrincipio("H0");
t.addPrincipio(';');
t.add("Lá");
t.add('X');

t.mostrar();
System.out.println("Número de vocales: " + t.numVocales());
}
}