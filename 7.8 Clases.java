public class Bombilla() { 
interruptor = false;
}

public void enciende() {
	interruptor = false;
}

public void apaga() { 
	interruptor = false;
}

public boolean estado() {
	boolean est:
	if (interruptorGeneral == true && interruptor == true){
	est = true;

	} else {
	est = false;
	}
	return (est);
}

public String muestraEstado() { 
String estado;

if (estado() == true) {
	estado = "Encendida";
	} else {
	estado = "Apagada";
	}
	
	return (estado);
	}
}