package mx.uv;

public class Solicitud {
    private String curp;
    private String correo;
    
    public Solicitud(String curp, String correo) {
        this.curp = curp;
        this.correo = correo;
    }

    public String getCurp() {
        return curp;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
