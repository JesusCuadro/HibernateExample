
package controllers;

import models.usuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class usuarioController {
    
    public String createUsuario(String nombre, String apellido, String ciudad){
        
        SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(usuario.class).buildSessionFactory();
        
        Session session = miFactory.openSession();
        
        try{
            
            usuario usuario = new usuario(nombre, apellido, ciudad);
            session.beginTransaction();
            session.save(usuario);
            session.getTransaction().commit();
            
            miFactory.close();
            
            return "Usuario creado";
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return "Error al registrar usuario";

    }
    
    public String deleteUsuario(int id){
        
    SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(usuario.class).buildSessionFactory();
        
        Session session = miFactory.openSession();
        
        try{
            
            session.beginTransaction();
            
            usuario usuario = session.get(usuario.class, id);
            
            session.delete(usuario);
            
            session.getTransaction().commit();
            
            miFactory.close();
            
            return "Usuario eliminado correctamente";
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return "Error al eliminar usuario";
    }
}
