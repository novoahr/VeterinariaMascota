/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import Dao.MascotaDao;
import entidades.Mascota;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author USUARIO
 */
@ManagedBean
@ViewScoped
public class MascotaBean {
 
    private Mascota mascota;
    
    public MascotaBean() {
        this.mascota = new Mascota();
    }
    
    
  
    public void guardarMascota(){
        
        try{
            MascotaDao mascotadao = new MascotaDao();
            mascotadao.guardarMascota(mascota);
        }catch(Exception e) {
            System.out.println("error"+ e);
        }
        
     }
    
    public boolean actualizarMascota(Mascota mascota){
        
        boolean respuesta = true;
        try{
        MascotaDao mascotadao = new MascotaDao();
        mascotadao.ActualizarMascota(mascota);
        }catch(Exception e){
            respuesta = false;
        }
        return respuesta;
    }
    public ArrayList<Mascota> listarMascotas(){
        
        ArrayList<Mascota> lista = new ArrayList<>();
        try{
        MascotaDao mascotadao = new MascotaDao();
        //lista= mascotadao.listarMascota();
        }catch(Exception e){
           
        }
            return lista;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
   
}
