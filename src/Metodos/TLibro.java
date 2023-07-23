/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Metodos;
import java.io.Serializable;

/**
 *
 * @author USER
 */
public class TLibro implements Serializable {
    
    private String ISBN;
    private String Titulo;
    private String Autor;
    private int Paginas;
    private float Precio;
    
    TLibro(){
        ISBN = "";
        Titulo = "";
        Autor = "";
        Paginas = 0;
        Precio = 0;
    }
    
    public void setISBN(String cod){
        ISBN = cod.trim();
    }
    
    public void setTitulo(String Tit){
        Titulo = Tit.trim();
    }
    
    public void setAutor(String Aut){
        Autor = Aut.trim();
    }
    
    public void setPaginas(int Pag){
        if(Pag > 0){
            Paginas = Pag;
        }
    }
    
    public void setPrecio(float Pre){
        if(Pre > 0){
            Precio = Pre;
       }
    }
    
    public String getISBN(){
        return ISBN;
    }
    
    public String getTitulo(){
        return Titulo;
    }
    
    
    public String getAutor(){
        return Autor;
    }
    
    public int getPagina(){
        return Paginas;
    }
    public float getPrecio(){
        return Precio;
    }
}
