package pojos;

public class Mensaje {
    private boolean error;
    private String mensaje;

    //Necesario para el auto-mapping de JSON
    public Mensaje() {}

    public Mensaje(String mensaje, boolean error) {
        this.mensaje = mensaje;
        this.error = error;
    }
    
    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
