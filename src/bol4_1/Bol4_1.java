
package bol4_1;


public class Bol4_1 {

    
    public static void main(String[] args) {
        
        
        Libro objL1 = new Libro("Walden", "Henry David Thoreau", 1854, (short) 262);
        
        objL1.amosar();
        
       
     
        Libro objL2 = new Libro ();
        objL2.setTitulo("El nombre del viento");
        objL2.setAutor("Patrick Rothfuss");
        objL2.setAno(2007);
        objL2.setNumPaginas((short)662);
        objL2.amosar();
        
      
        
        
        
    }
    
}
