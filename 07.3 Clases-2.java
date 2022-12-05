class main{
    public static void main(String[] args) {
        Foco[] focos = {new Foco(), new Foco()};
        Casa casa = new Casa(focos);
        System.out.println(casa.focos[1].estado);
        casa.focos[1].interruptor();
        System.out.println(casa.focos[1].estado);
        casa.focos[0].interruptor();
        System.out.println(casa.focos[0].estado);

        System.out.println("Salta el fusible");
        casa.fusible();
        System.out.println(casa.focos[0].estado);
        System.out.println(casa.focos[1].estado);        
    }
}

class Casa{
    Foco[] focos;

    Casa(Foco[] focos){
        this.focos = focos;
    }

    void fusible(){
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