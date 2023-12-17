package mx.uv;

public class Apoyo {
    private String curp;
    private String tipoSangre;
    private String nombre;
    private String direccion;
    private String imagen;
    private int telefono;
    
    public Apoyo(String curp, String tipoSangre, String nombre, String direccion, String imagen, int telefono) {
        this.curp = curp;
        this.tipoSangre = tipoSangre;
        this.nombre = nombre;
        this.direccion = direccion;
        this.imagen = imagen;
        this.telefono = telefono;
    }

    public String getCurp() {
        return curp;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getImagen() {
        return imagen;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }    
}
