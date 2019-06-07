/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Dao.MascotaDao;
import Utilitarios.HibernateUtil;
import entidades.Mascota;
import java.util.ArrayList;
import org.hibernate.Session;

/**
 *
 * @author USUARIO
 */
public class Ejemplo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador;
        MascotaDao mascotadao = new MascotaDao();
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        contador = mascotadao.ContarRegistroMas(sesion);
        System.out.println("La cantidad de Registros es: "+ contador);
      
    }
    
}
