package ws;

import controller.PrendaDAO;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import pojos.Mensaje;
import pojos.Prenda;

@Path("prendas")
public class PrendaWS {
    @Context
    private UriInfo context;
    
    public PrendaWS() {
    }
    
    @Path("getAll")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Prenda> getAll() {
        List<Prenda> list = PrendaDAO.getAll();
        return list;
    }
    
    @Path("byId/{idprenda}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Prenda> getPrendaById (
            @PathParam("idprenda") Integer idprenda,
            @Context final HttpServletResponse response) {
        List<Prenda> list = null;
        
        if(idprenda == null) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        } else {
            list = PrendaDAO.getPrendaById(idprenda);
            response.setStatus(HttpServletResponse.SC_OK);
        }
        
        try { 
            response.flushBuffer(); 
        }catch(Exception e) {
        }
        
        return list;
    }
    
    @Path("buscarPrendas/{descripcion}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Prenda> buscarPrendas(
            @PathParam("descripcion") String descripcion,
            @Context final HttpServletResponse response) {
        List<Prenda> list = null;
        
        if(descripcion == null || descripcion.isEmpty()) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        } else {
            list = PrendaDAO.buscarPrendas(descripcion);
            response.setStatus(HttpServletResponse.SC_OK);
        }
        
        try { 
            response.flushBuffer(); 
        }catch(Exception e) {
        }
        
        return list;
    }
    
    @POST
    @Path("registrarPrenda")
    @Produces(MediaType.APPLICATION_JSON)
    public Mensaje registrarPrenda(
            @FormParam("idprenda") Integer idprenda,
            @FormParam("idcategoria") Integer idcategoria,
            @FormParam("piezas") Integer piezas,
            @FormParam("serie") String serie,
            @FormParam("porcentajeprestamo") float porcentajeprestamo,
            @FormParam("idsubcategoria") Integer idsubcategoria,
            @FormParam("descripcion") String descripcion,
            @FormParam("prestamo") float prestamo,
            @FormParam("modelo") String modelo,
            @FormParam("avaluo") float avaluo,
            @Context final HttpServletResponse response) {
        Mensaje resultado = null;
        Prenda prenda = new Prenda(idprenda, idcategoria, piezas, serie, porcentajeprestamo, idsubcategoria, descripcion, prestamo, modelo, avaluo);
        if(idprenda == null || 
                idcategoria == null || 
                piezas == null ||
                serie == null || serie.isEmpty() || 
                porcentajeprestamo == 0 ||
                idsubcategoria == 0 || 
                descripcion == null || descripcion.isEmpty() ||
                prestamo == 0 || 
                modelo == null || modelo.isEmpty() ||
                avaluo == 0) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        } else {
            resultado = PrendaDAO.registrarPrenda(prenda);
            response.setStatus(HttpServletResponse.SC_OK);
        }
        
        try { 
            response.flushBuffer(); 
        }catch(Exception e) {
        }
        
        return resultado;
    }
    
    @PUT
    @Path("actualizarPrenda")
    @Produces(MediaType.APPLICATION_JSON)
    public Mensaje actualizarPrenda(
            @FormParam("idprenda") Integer idprenda,
            @FormParam("idcategoria") Integer idcategoria,
            @FormParam("piezas") Integer piezas,
            @FormParam("serie") String serie,
            @FormParam("porcentajeprestamo") float porcentajeprestamo,
            @FormParam("idsubcategoria") Integer idsubcategoria,
            @FormParam("descripcion") String descripcion,
            @FormParam("prestamo") float prestamo,
            @FormParam("modelo") String modelo,
            @FormParam("avaluo") float avaluo,
            @Context final HttpServletResponse response) {
        Mensaje resultado = null;
        Prenda prenda = new Prenda(idprenda, idcategoria, piezas, serie, porcentajeprestamo, idsubcategoria, descripcion, prestamo, modelo, avaluo);
        if(idprenda == null || 
                idcategoria == null || 
                piezas == null ||
                serie == null || serie.isEmpty() || 
                porcentajeprestamo == 0 ||
                idsubcategoria == 0 || 
                descripcion == null || descripcion.isEmpty() ||
                prestamo == 0 || 
                modelo == null || modelo.isEmpty() ||
                avaluo == 0) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        } else {
            resultado = PrendaDAO.actualizarPrenda(prenda);
            response.setStatus(HttpServletResponse.SC_OK);
        }
        
        try { 
            response.flushBuffer(); 
        }catch(Exception e) {
        }
        
        return resultado;
    }
    
    @DELETE
    @Path("eliminarPrenda")
    @Produces(MediaType.APPLICATION_JSON)
    public Mensaje eliminarPrenda(
            @FormParam("idprenda") Integer idprenda,
            @Context final HttpServletResponse response) {
        Mensaje resultado = null;
        
        if(idprenda == null) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        } else {
            resultado = PrendaDAO.eliminarPrenda(idprenda);
            response.setStatus(HttpServletResponse.SC_OK);
        }
        
        try { 
            response.flushBuffer(); 
        }catch(Exception e) {
        }
        
        return resultado;
    }
}
