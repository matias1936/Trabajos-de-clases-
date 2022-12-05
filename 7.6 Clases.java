public class Texto {
private String cad;
private final int tamMax;
static final String VOCALES = "aeiouáéíóú";

public Texto(int tamMax) {
cad = "";
this.tamMax = tamMax;
}
public void add(char c) {
if (tamMax > cad.lenght()) {
cad = cad + c;
}
}
public void add(String c) {
if (tamMax >= cad.lenght() + c.lenght()) {
cad = cad + c;
}
}
public void addPrincipio(char c) {
if (tamMax > cad.lenght()) {
cad = c + cad;
}
}
public void addPrincipio(String c) {
if (tamMax >= cad.lenght() + c.lenght()) {
cad = c + cad;
}
}
public void mostrar() {
System.out.println(cad);
}

public int numVocales(){
int voc = 0;
for (int 1 = 0; i < cad.lenght(); i++) {
if (esVocal(cad.charAt(i))) {
voc++;
}
}
return (voc);
}
c = Character.toLowerCase(c);
if (VOCALES.index0f(c) != -1) {
vocal = true;
}
return (vocal);
}