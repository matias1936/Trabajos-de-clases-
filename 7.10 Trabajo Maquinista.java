class main{
	public static void main(String[] args){
	}
}

class Maquinista{
	String nombre;
	double dni;
	double sueldo;
	String rango;
	
	Maquinista(String nombre, double dni,
double sueldo, String rango){
	this.nombre=nombre;
	this.dni=dni;
	this.sueldo=sueldo;
	this.rango=rango;
	}
}

class Mecanico{
	String nombre;
	double telefono;
	String especialidad;
	
	Mecanico(String nombre, double
telefono, String especialidad){
	this.nombre=nombre;
	this.telefono=telefono;
	this.especialidad=especialidad;
	}
}

class JefEstacion{
	String nombre;
	double dni;
	
	JefEstacion(String nombre, double dni)
{
	this.nombre=nombre;
	this.dni=dni;
	}
}

class Vagon{
	protected double capacidadMaxima;
	protected double capacidadActual;
	protected String mercancia;
	
	protected  Vagon(double
capacidadMaxima, double
capacidadActual, String mercancia){
	this.capacidadMaxima=capacidadMaxima;
	
this.capacidadActual=capacidadActual;
	this.mercancia=mercancia;
	}
}
class Locomotora{
	String matricula;
	double potencialMotores;
	String añoDeFabricacion;
	Mecanico mecanico;
	
	Locomotora(String matricula,
double potenciaMotores, String
añoDeFabricacion, Mecanico mecanico)
{
	this.matricula=matricula;
	
this.potenciaMotores=potenciaMotores;
	this.añoDeFabricacion=añoDeFabricacion;
	this.mecanico=mecanico;
	}
}

class Tren{
	Locomotora locomotora;
	Vagon[] vagones;
	Maquinista maquinista;
	
	Tren(Locomotora locomotora, Vagon[]
vagones, Maquinista maquinista){
	this.locomotora=locomotora;
	this.vagones=vagones;
	this.maquinista=maquinista;
	}
}