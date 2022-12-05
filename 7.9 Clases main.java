public class Main {
 public static void main(String[]args) { 
	SintonizadorFM a = new SintonizadorFM(107);
	a.up(); a.up(); a.up(); a.up();
	a.display();
	SintonizadorFM b = new SintonizadorFM(80.5);
	b.down(); b.down(); b.down(); 
	b.display();
	a = new SintonizadorFM(200);
	a.display();
	}
}