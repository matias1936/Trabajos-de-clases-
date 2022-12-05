class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int horas;
        int n;
        System.out.println("Ingresa una cantidad de horas");
        horas = sc.nextInt();

        System.out.println("Ingresa un numero para n (en segundos)");
        n = sc.nextInt();

    }
}

class Hora{
    int hora;
    int minutos;
    int segundos;


    Hora(int hora){
        this.hora = hora;
        this.minutos = hora*60;
        this.segundos = hora*60*60;
    }

    void calcularDiferencia(){
        
        for(int i=0; i<focos.length; i++){
            focos[i].apagar();
        }
    }
}

class Foco{
    Boolean estado;

    Foco(){
        this.estado=false;
    }

    void apagar(){
        this.estado=false;
    }

    void interruptor(){
        this.estado = !this.estado;
    }
}