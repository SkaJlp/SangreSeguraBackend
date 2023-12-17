package mx.uv;

public class Institucion {
    private String correo;
    private String nombre;
    private String direccion;
    private String ubicacion;
    private String imagen;
    private int telefono;

    public Institucion(String correo, String nombre, String direccion, String ubicacion, String imagen, int telefono) {
        this.correo = correo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ubicacion = ubicacion;
        this.imagen = imagen;
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getImagen() {
        return imagen;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
