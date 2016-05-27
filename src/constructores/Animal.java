
package constructores;


public class Animal {
  
    String nombre;
    String especie;
    boolean carnivoro;
    
     public Animal(String valor){
        this.nombre=valor;
    }
     public Animal(){
         nombre="lobo";
     }
     public Animal(boolean algo, String nombre){
         carnivoro=algo;
         
     }
     
     public Animal (String valor1, String valor2){
         especie=valor1;
         nombre=valor2;
     }
}
