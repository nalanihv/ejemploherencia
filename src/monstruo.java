//extends nombre_clase_padre

public class monstruo extends personaje {
    //atributos:
    /* cuernos
    tentaculos
    color
     */
    private boolean tienecuernos;
    private boolean tienetentaculos;
    private String color;
    private arraylist<String> habilidades;
    public monstruo(String nombre, double estatura, double peso) {
        super(nombre, estatura, peso);
    }
    public void espantar(){
    System.out.println("boo");}

    public void  trabajar(){
        System.out.println("trabajar");
    }
    public void reir(){
        System.out.println("jaja");
    }
    //metodos
    /*espantar
    trabajar
    hacer_reir
     */

    public boolean isTienecuernos() {
        return tienecuernos;
    }

    public void setTienecuernos(boolean tienecuernos) {
        this.tienecuernos = tienecuernos;
    }

    public boolean isTienetentaculos() {
        return tienetentaculos;
    }

    public void setTienetentaculos(boolean tienetentaculos) {
        this.tienetentaculos = tienetentaculos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public arraylist<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(arraylist<String> habilidades) {
        this.habilidades = habilidades;
    }

    public monstruo(String nombre, double estatura, double peso, boolean tienecuernos, boolean tienetentaculos, String color, arraylist<String> habilidades) {
        super(nombre, estatura, peso);
        this.tienecuernos = tienecuernos;
        this.tienetentaculos = tienetentaculos;
        this.color = color;
        this.habilidades = habilidades;
        System.out.println("soy el contructor de moustro");
    }
}
