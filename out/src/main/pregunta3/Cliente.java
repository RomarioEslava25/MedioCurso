package main.pregunta3;

public class Cliente {
    private String nombres;
    private String apepat;
    private int dni;

    public Cliente() {}

    public Cliente(String nombres, String apepat, int dni) {
        this.nombres = nombres;
        this.apepat = apepat;
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApepat() {
        return apepat;
    }

    public void setApepat(String apepat) {
        this.apepat = apepat;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombres='" + nombres + '\'' + ", apepat='" + apepat + '\'' + ", dni=" + dni + '}';
    }
}
