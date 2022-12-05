public class Main {

public static void main(String[] args) {
CuentaCorriente c1, c2, c3;
Banco b1, b2;

b1 = new banco("International Java Bank");
b2 = new Banco("Caja de ahorros de Do-While", 10.6, "c/Larga s/N");

c1 = new CuentaCorriente("Pepita", "12345678-A", b1);
c2 = new CuentaCorriente("Ana", "98765432-Z", b1);
c1.mostrarInformacion();
c2.mostrarInformacion();

c3 = new CuentaCorriente("Sancho", "11222333-B");
c3.mostrarInformacion();
c3.cambiarBanco(b2);
c3.mostrarInformacion();
}
}