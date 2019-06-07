/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import entidades.Mascota;
import java.util.ArrayList;
import org.hibernate.Session;

public interface IMascota {
    public abstract boolean guardarMascota(Mascota mascota);
    public abstract ArrayList<Mascota> listarMascota(Session sesion);
    public abstract void ActualizarMascota(Mascota mascota);
    public abstract ArrayList<Mascota> listarRaza(Session sesion);
    public abstract ArrayList<Mascota> listarNombre(Session sesion);
    public abstract Integer ContarRegistroMas(Session sesion);
}
