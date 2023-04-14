package pojos;

public class Prenda {
    private Integer idprenda;
    private Integer idcategoria;
    private Integer piezas;
    private String serie;
    private float porcentajeprestamo;
    private Integer idsubcategoria;
    private String descripcion;
    private float prestamo;
    private String modelo;
    private float avaluo;

    public Prenda() {
    }

    public Prenda(Integer idprenda, Integer idcategoria, Integer piezas, String serie, float porcentajeprestamo, Integer idsubcategoria, String descripcion, float prestamo, String modelo, float avaluo) {
        this.idprenda = idprenda;
        this.idcategoria = idcategoria;
        this.piezas = piezas;
        this.serie = serie;
        this.porcentajeprestamo = porcentajeprestamo;
        this.idsubcategoria = idsubcategoria;
        this.descripcion = descripcion;
        this.prestamo = prestamo;
        this.modelo = modelo;
        this.avaluo = avaluo;
    }

    public Integer getIdprenda() {
        return idprenda;
    }

    public void setIdprenda(Integer idprenda) {
        this.idprenda = idprenda;
    }

    public Integer getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(Integer idcategoria) {
        this.idcategoria = idcategoria;
    }

    public Integer getPiezas() {
        return piezas;
    }

    public void setPiezas(Integer piezas) {
        this.piezas = piezas;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public float getPorcentajeprestamo() {
        return porcentajeprestamo;
    }

    public void setPorcentajeprestamo(float porcentajeprestamo) {
        this.porcentajeprestamo = porcentajeprestamo;
    }

    public Integer getIdsubcategoria() {
        return idsubcategoria;
    }

    public void setIdsubcategoria(Integer idsubcategoria) {
        this.idsubcategoria = idsubcategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(float prestamo) {
        this.prestamo = prestamo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getAvaluo() {
        return avaluo;
    }

    public void setAvaluo(float avaluo) {
        this.avaluo = avaluo;
    }
}
