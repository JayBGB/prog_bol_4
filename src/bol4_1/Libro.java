package bol4_1;


public class Libro {
    
    private String titulo, autor;
    private int ano;
    private short numPaginas;
    private float valoracion;
    
    
    // CONSTRUCTORES 
    
    public Libro () {
    
    }
    
    public Libro (String title, String author, int year, short pages){
        
      titulo=title;
      autor=author;
      ano=year;
      numPaginas=pages;
    
    }
    
    
    //SETTERS Y GETTERS
    
    public void setTitulo (String title){
    titulo=title;
    }
    
    public String getTitulo (){
    
    return titulo;
    }
    
    
    
    public void setAutor (String author){
    autor=author;
    }
   
    public String getAutor (){
    return autor;
    }
    
    
    
    public void setAno (int year) {
    ano=year;
    }
    
    public int getAno (){
    return ano;
    }
    
    
    
    public void setNumPaginas (short pages){
    numPaginas=pages;
    }
    
    public short getNumPaginas (){
    return numPaginas;
    }
    
 
   
    
    // METHODS
    
    public void amosar (){
    
        System.out.println("Título: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Año: "+ano);
        System.out.println("Número de páginas: "+numPaginas);
        System.out.println("Valoración: "+valoracion);
    
    }
    
    
    
    
}

     

