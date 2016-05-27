
package metodos;


public class usuario {
    private int edad;

    //VAMOS A IMPLEMENTAR EL METODO GET PARA EL MISMO ATRIBUTO
    public int getEdad(){
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
            
    if(edad<0){ //se pide valor (get) ACCESORIO
       edad=0; //asigna valor (set) MUTADOR
    System.out.println("no meter edades menores de cero");
    
    this.edad = edad;
    }
}
}
