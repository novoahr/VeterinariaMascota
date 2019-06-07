/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Interface.IMascota;
import Utilitarios.HibernateUtil;
import entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MascotaDao implements IMascota{

    @Override
    public boolean guardarMascota(Mascota mascota) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.beginTransaction();
        boolean respuesta = true;
        try{
        sesion.save(mascota);
        transaccion.commit();
        }catch(Exception e){
            respuesta = false;
        }
        sesion.close();
        return respuesta;
    }

    @Override
    public ArrayList<Mascota> listarMascota(Session sesion) {
  ArrayList<Mascota> milista = new ArrayList<>();

        //crear la consulta hacia la base de datos
        Query query = sesion.createQuery("FROM Mascota");

        //ejecutar la consulta y obtener la lista
        milista = (ArrayList<Mascota>) query.list();
        return milista;
    }

    @Override
    public void ActualizarMascota(Mascota mascota) {
Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.beginTransaction();
        sesion.update(mascota);
        transaccion.commit();
        sesion.close();
    }

    @Override
    public ArrayList<Mascota> listarRaza(Session sesion) {
        String hql = "FROM Mascota where raza='Pastor Aleman'";        
        Query query = sesion.createQuery(hql);
        List< Mascota > lista= (List< Mascota >) query.list();
	return (ArrayList<Mascota>)lista;

    }

    @Override
    public ArrayList<Mascota> listarNombre(Session sesion) {
        String hql = " FROM Mascota where nombreMascota='Sandor'";        
        Query query = sesion.createQuery(hql);
        List< Mascota > lista= (List< Mascota >) query.list();
	return (ArrayList<Mascota>)lista;
    }

    @Override
    public Integer ContarRegistroMas(Session sesion) {
        String hql = "select count(*) from Mascota";
        Query query = sesion.createQuery(hql);
        Long FilasTab=(Long) query.uniqueResult();
        Integer cont=FilasTab.intValue();
        return cont;
    }


    
}
