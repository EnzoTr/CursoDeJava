package FacultadEnzo;

class profesor extends persona {

    private double sueldo;
    private int añosAntiguedad;

    // CONSTRUCTOR

    public profesor(String nombre, String apellido, int legajo, int sueldo, int añosAntiguedad) {
        super(nombre, apellido, legajo);
        this.sueldo = sueldo;
        this.añosAntiguedad = añosAntiguedad;
    }

    // GETTERS & SETTERS

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getAñosAntiguedad() {
        return añosAntiguedad;
    }

    public void setAñosAntiguedad(int añosAntiguedad) {
        this.añosAntiguedad = añosAntiguedad;
    }


    // METODOS

    public void calcularSueldo(){
        double total = this.sueldo + (this.sueldo * (0.1*this.añosAntiguedad));
        System.out.println("El sueldo del profesor " + super.getNombre() + " es de: $" + total);
    }

    @Override
    public String toString() {
        return "Profesor: "+super.toString();
    }

    @Override
    public void modificarDatos(String nombre, String Apellido, int legajo) {
        super.setNombre(nombre);
        super.setApellido(Apellido);
        try{
            super.setLegajo(legajo);
        }catch (Exception e){
            System.out.println("ESO NO PARECE SER UN NÚMERO DE LEGAJO");
        }
    }
}