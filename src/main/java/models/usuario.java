
package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="usuarios")

public class usuario {
    
    @Id
    @Column(name="ID")
    private int id;
    
    @Column(name="Nombre")
    private String nombre;
        
    @Column(name="Apellido")
    private String apellido;
        
    @Column(name="Ciudad")
    private String ciudad;
    
    public usuario() {
        
    }

    public usuario(String nombre, String apellido, String ciudad) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        
    }
    
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "usuario{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", ciudad=" + ciudad + '}';
    }
}
