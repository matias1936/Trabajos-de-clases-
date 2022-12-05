class main{
    public static void main(String[] args) {
        Sintetizador sintentizador = new Sintetizador(80, 50, 100);
        System.out.println(sintentizador.frecuencia);
        sintentizador.down();
        System.out.println(sintentizador.frecuencia);
        for(int i=0; i<42; i++){
            sintentizador.up();
        }
        System.out.println(sintentizador.frecuencia);
        sintentizador.down();
        System.out.println(sintentizador.frecuencia);        
    }
}

class Sintetizador{
    double frecuencia;
    double frecuencia_maxima;
    double frecuencia_minima;
    Sintetizador(double frecuencia_inicial, double frecuencia_minima, double frecuencia_maxima){
        this.frecuencia = frecuencia_inicial;
        this.frecuencia_minima = frecuencia_minima;
        this.frecuencia_maxima = frecuencia_maxima;
    }
    void up(){
        frecuencia+=0.5;
        if(frecuencia>frecuencia_maxima){
            frecuencia = frecuencia_minima;
        }
    }

    void down(){
        frecuencia-=0.5;
        if(frecuencia<frecuencia_minima){
            frecuencia = frecuencia_maxima;
        }
    }
}