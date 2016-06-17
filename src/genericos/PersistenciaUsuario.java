package genericos;

import java.util.ArrayList;
import java.io.*;

public class PersistenciaUsuario {
   //Esta clase model de tipo logico, solamente contiene metodos que representan acciones    
   //concretas, la sintaxis y estructura de dicho metodo depende de la accion.
    
    ArrayList<Usuario> usuarios;

    public PersistenciaUsuario() {
        usuarios=new ArrayList<>();
        
    }
//Primero generamo el metodo que nos guarda un usuario
    public void guardar(Usuario u)throws Exception{
//Paso 1: generar el archivo a guardarse
    File f=new File ("archivaldo.raton");
    //Indicar que se va a guardar
    FileOutputStream fos=new FileOutputStream(f);
    //Generar el objeto que nos va a ayudar a guardar el ArrayList de usuarios
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    //Ahora si a guardar el objeto
    usuarios.add(u);
    oos.writeObject(usuarios);
    }
}

