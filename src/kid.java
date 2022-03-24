public class kid extends personaje{
    private String colorpuerta;
    public void reir(){
        System.out.println("jajaja");
    }
    public void llorar(){
        System.out.println("cuñaaaa");
    }

    public String getColorpuerta() {
        return colorpuerta;}

    public void setColorpuerta(String colorpuerta) {
        this.colorpuerta = colorpuerta;}

    public kid(String nombre, double estatura, double peso, String colorpuerta) {
        super(nombre, estatura, peso);
        this.colorpuerta = colorpuerta;
        System.out.println("estoy en constructor de kid");
    }
}
