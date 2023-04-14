package pojos;

public class Catalogo {
    private Integer idcatalogo;
    private String nombre;
    private Integer idtipo;
    private Integer orden;

    //Necesario para el auto-mapping de JSON
    public Catalogo() {}
    
    public Catalogo(Integer idCatalogo, String nombre, Integer idTipo, Integer orden) {
        this.idcatalogo = idCatalogo;
        this.nombre = nombre;
        this.idtipo = idTipo;
        this.orden = orden;
    }
    
    public Integer getIdCatalogo() {
        return idcatalogo;
    }

    public void setIdCatalogo(Integer idCatalogo) {
        this.idcatalogo = idCatalogo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdTipo() {
        return idtipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idtipo = idTipo;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }
}
