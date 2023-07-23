/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
/**
 *
 * @author USER
 */
public class TVecLibros {
    
    private int Tam;
    private TLibro vec[];
    
    public TVecLibros(){
        Tam = 0;
        vec = null;
    }
    
    public void setTam(int N){
        int i;
        Tam = N;
        if(Tam > 0){
            vec = new TLibro[Tam];
            for(i = 0; i < Tam; i++){
                vec[i] = new TLibro();
            }
        }
        else{
            vec = null;
        }
    }
    
    public void setVec(int Pos, TLibro Lib){
        if(Pos >= 0 && Pos < Tam){
            vec[Pos]= Lib;
        }
    }
    
    public int getTam(){
        return Tam;
    }
    
    public TLibro getVec(int Pos){
        return vec[Pos];
    }
    
    public void Guardar(String Archivo){
        int i;
        ObjectOutputStream OS;
        try{
        OS = new ObjectOutputStream(new FileOutputStream(Archivo));
        OS.writeInt(Tam);
        for(i = 0; i < Tam;i++){
            OS.writeObject(vec[i]);
        }
        OS.flush();
        OS.close();
        }
        catch(IOException Error){
         Error.printStackTrace();
        }
    }
    
    public void Cargar(String Archivo){
        int i;
        ObjectInputStream IS;
        try{
         IS = new ObjectInputStream(new FileInputStream(Archivo));
         Tam = IS.readInt();
         vec = new TLibro[Tam];
         for(i = 0; i < Tam;i++){
             vec[i]=(TLibro) IS.readObject();
         }
         IS.close();
        }
        catch(IOException | ClassNotFoundException Error){
            Error.printStackTrace();
        }
        
    }
}
