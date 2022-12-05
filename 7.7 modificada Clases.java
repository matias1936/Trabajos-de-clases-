public class CuentaCorriente {
Banco banco;

CuentaCorriente(String nombre, String dni, Banco banco) {

this(0, -50, dni);
this.nombre = nombre;
this.banco = banco;
}

void cambiarBanco(Banco banco) {
this.banco = banco;
}

void mostrarInformacion() {
System.out.println("Información del banco");

if (banco == null) {
System.out.println("Cuenta no asociada a ningun banco");
} else {
banco.mostrarInformacion();
}
System.out.println("Información de la cuenta");
System.out.println("Titular: " + nombre);
System.out.println("Dni: " + dni);
System.out.println("Saldo: " + saldo);
System.out.println("Límite descubierto: " + límite);
}
}