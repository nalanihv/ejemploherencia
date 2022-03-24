public class personaje {
    //nombre
    //estatura
    //peso
    protected  String nombre;
    protected double estatura;
    protected double peso;

    //comer
    //dormir
    //pensar


    public personaje( String nombre, double estatura, double peso) {
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        System.out.println("estoy en el constructor padre");
    }

    public String getNombre() {
        return nombre;}

    public void setNombre(String nombre) {
        this.nombre = nombre;}

    public double getEstatura() {
        return estatura;}

    public void setEstatura(double estatura) {
        this.estatura = estatura;}

    public double getPeso() {
        return peso;}

    public void setPeso(double peso) {
        this.peso = peso;}

    public void comer(){
        System.out.println("comiendo");
    }
    public void  dormir (){
        System.out.println("durmiendo");
    }
    public void pensar (){
        System.out.println("pensando");
    }
}
