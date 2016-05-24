
package constructores;


public class Animal {
  
    String nombre;
    String especie;
    boolean carnivoro;
    
     public Animal(String valor){
        nombre=valor;
    }
     public Animal(){
         nombre="lobo";
     }
     public Animal (String valor1, String valor2){
         especie=valor1;
         nombre=valor2;
     }
}
