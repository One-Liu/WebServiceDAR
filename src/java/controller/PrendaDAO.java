package controller;

import java.util.List;
import mybatis.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import pojos.Mensaje;
import pojos.Prenda;

public class PrendaDAO {
    public static List<Prenda> getAll() {
        List<Prenda> prendas = null;
        SqlSession conn = MyBatisUtil.getSession();
        if(conn != null) {
            try {
                prendas = conn.selectList("Prenda.getAllPrendas");
            } catch(Exception ex) {
                ex.printStackTrace();
            } finally {
                conn.close();
            }
        }
        return prendas;
    }
    
    public static List<Prenda> getPrendaById(Integer idPrenda) {
        List<Prenda> list = null;
        SqlSession conn = MyBatisUtil.getSession();
        if(conn != null) {
            try {
                list = conn.selectList("Prenda.getPrendaById", idPrenda);
            } catch(Exception ex) {
                ex.printStackTrace();
            } finally {
                conn.close();
            }
        }
        return list;
    }
    public static List<Prenda> buscarPrendas(String descripcion) {
        List<Prenda> list = null;
        SqlSession conn = MyBatisUtil.getSession();
        try {
            list = conn.selectList("Prenda.buscarPrendas", descripcion);
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            conn.close();
        }
        return list;
    } 
    
    public static Mensaje registrarPrenda(Prenda prenda) {
        Mensaje resultado;
        SqlSession conn = MyBatisUtil.getSession();
        try {
            conn.insert("Prenda.registrarPrenda",prenda);
            conn.commit();
            resultado = new Mensaje("Prenda registrada exitosamente",false);
        } catch(Exception ex) {
            resultado = new Mensaje(ex.getMessage(),true);
        } finally {
            conn.close();
        }
        return resultado;
    }
    
    public static Mensaje actualizarPrenda(Prenda prenda) {
        Mensaje resultado;
        SqlSession conn = MyBatisUtil.getSession();
        try {
            conn.update("Prenda.actualizarPrenda", prenda);
            conn.commit();
            resultado = new Mensaje("Prenda actualizada exitosamente", false);
        } catch(Exception ex) {
            resultado = new Mensaje(ex.getMessage(), true);
        } finally {
            conn.close();
        }
        return resultado;
    }
    
    public static Mensaje eliminarPrenda(Integer idprenda) {
        Mensaje resultado;
        SqlSession conn = MyBatisUtil.getSession();
        try {
            conn.delete("Prenda.eliminarPrenda",idprenda);
            conn.commit();
            resultado = new Mensaje("Prenda eliminada exitosamente",false);
        } catch(Exception ex) {
            resultado = new Mensaje(ex.getMessage(), true);
        } finally {
            conn.close();
        }
        return resultado;
    }
}
