
package Prueba;

import Dao.MascotaDao;
import entidades.Mascota;

public class Ejemplo1 {

   
    public static void main(String[] args) {
        MascotaDao mascotadao = new MascotaDao();
        Mascota mimascota = new Mascota(4, "Luna", "juan", "Pastor Aleman");
        
        mascotadao.guardarMascota(mimascota);
    }
    
}
