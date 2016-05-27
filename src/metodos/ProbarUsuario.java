
package metodos;

public class ProbarUsuario {
    public static void main(String[] args) {
        //creamos un objeto con el constructor de defecto de la clase usuario
        //REGLAS JAVA
        //1. En el metodo mian no debe existir ninguna asignacion
        //2. por cada atributo debe tener metodo mutador
        
        usuario u1=new usuario();
    u1.setEdad(19);//asinar valor (set)MUTADOR

        System.out.println("no debes meter edades menores de cero");
    
    
        System.out.println("tu edad es" + u1.getEdad()); //pide valor (get)ACCESORIO
    }
}
    

