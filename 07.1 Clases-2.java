class main{
    public static void main(String[] args) {
        // CuentaCorriente cuenta = new CuentaCorriente("Juan", "45033378");
        // System.out.println(cuenta.nombre);
        // cuenta.sacarDinero(5);
        // cuenta.ingresarDinero(250);
        // cuenta.mostrarInformacion();
        // System.out.println(cuenta.nombreBanco);
        // cuenta.cambiarNombreBanco("Galicia");
        // System.out.println(cuenta.nombreBanco);

        // Banco banco = new Banco("Santander", "Avellaneda 4523");
        // System.out.println(banco.nombre);
        // System.out.println(banco.direccion);
        // System.out.println(banco.capital);

        // banco.modificarBanco("Avellaneda 4500", 500000);
        // System.out.println(banco.nombre);
        // System.out.println(banco.direccion);
        // System.out.println(banco.capital);
        // banco.informacionDeBanco();
        // cuenta.modificarBanco(banco);
        // cuenta.verBanco();       
    }
}

class CuentaCorriente {
    protected double saldo;
    String nombre;
    String dni;
    Banco banco;
    String nombreBanco = "Santander";
    protected double limite;

    CuentaCorriente(String nombre, String dni){
        this.nombre=nombre;
        this.dni=dni;
        this.saldo=0;
        this.limite=-100;
    }

    CuentaCorriente(double saldo){
        this.nombre="";
        this.dni="";
        this.saldo=saldo;
        this.limite=-100;
    }
    
    CuentaCorriente(double saldo, double limite, String dni){
        this.nombre="";
        this.dni=dni;
        this.saldo=saldo;
        this.limite=limite;
    }

    void cambiarNombreBanco(String nuevoNombre){
        nombreBanco = nuevoNombre;
    }


    void sacarDinero(double cantidad_a_retirar){
        if(saldo-cantidad_a_retirar>limite){
            saldo-=cantidad_a_retirar;
            System.out.println("Se retiraron $" + new StringBuilder().append(cantidad_a_retirar).toString() + " correctamente.");
            System.out.println("El total en cuenta es de $" + new StringBuilder().append(saldo).toString() + ".");
        }
    }

    void ingresarDinero(double cantidad_a_ingresar){
            saldo+=cantidad_a_ingresar;
            System.out.println("Se ingresaron $" + new StringBuilder().append(cantidad_a_ingresar).toString() + " correctamente.");
            System.out.println("El total en cuenta es de $" + new StringBuilder().append(saldo).toString() + ".");
    }

    void mostrarInformacion(){
        System.out.println("Informacion de la cuenta: ");
        System.out.println("Nombre: "+nombre);
        System.out.println("Dni: "+dni);
        System.out.println("Saldo: "+ new StringBuilder().append(saldo).toString());
        System.out.println("Limite: "+ new StringBuilder().append(limite).toString());
    }

    void modificarBanco(Banco nuevoBanco){
        banco = nuevoBanco;
    }

    void verBanco(){
        banco.informacionDeBanco();
    }
}

class Banco{
    String nombre;
    double capital;
    String direccion;

    Banco(String nombre, String direccion){
        this.capital = 100000000;
        this.direccion = direccion;
        this.nombre = nombre;
    }

    void modificarBanco(String nuevaDireccion, double nuevoCapital){
        direccion = nuevaDireccion;
        capital = nuevoCapital;
    }

    void informacionDeBanco(){
        System.out.println("Informacion del banco: ");
        System.out.println("Nombre: "+nombre);
        System.out.println("Capital: "+ new StringBuilder().append(capital).toString());
        System.out.println("Direccion: "+direccion);
    }
}