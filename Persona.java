
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    private String codigo;
    private String nombre;
    private String email;
    
public Persona(){
    
}

public Persona(String codigo, String nombre, String email){
    this.nombre = nombre;
    this.codigo = codigo;
    this.email = email;
}



//Start GetterSetterExtension Source Code

    /**GET Method Propertie codigo*/
    public String getCodigo(){
        return this.codigo;
    }//end method getCodigo

    /**SET Method Propertie codigo*/
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }//end method setCodigo

    /**GET Method Propertie nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**SET Method Propertie nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**GET Method Propertie email*/
    public String getEmail(){
        return this.email;
    }//end method getEmail

    /**SET Method Propertie email*/
    public void setEmail(String email){
        this.email = email;
    }//end method setEmail

//End GetterSetterExtension Source Code


}//End class