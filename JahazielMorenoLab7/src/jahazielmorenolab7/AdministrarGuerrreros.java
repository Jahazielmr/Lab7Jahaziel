package jahazielmorenolab7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdministrarGuerrreros {
    
        
    private ArrayList<Guerrero> listaGuerrreros = new ArrayList();
    private File archivo = null;

    public AdministrarGuerrreros() {
        
    }

    public AdministrarGuerrreros (String path){
        archivo = new File(path);
    }

    public ArrayList<Guerrero> getListaGuerrreros() {
        return listaGuerrreros;
    }

    public void setListaGuerrreros(ArrayList<Guerrero> listaGuerrreros) {
        this.listaGuerrreros = listaGuerrreros;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setGuerrero (Guerrero guerrero){
        listaGuerrreros.add(guerrero);
    }

    
    
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;        
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Guerrero t : listaGuerrreros) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
    public void cargarArchivoBinario(){//pasar del rom al ram!
        try {
            listaGuerrreros = new ArrayList();
            
            Guerrero temp;
            if (archivo.exists()){
                FileInputStream entrada= new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                
                try {
                    while((temp = (Guerrero) objeto.readObject())!=null){
                        listaGuerrreros.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final el archivo
                }
                objeto.close();
                entrada.close();       
            }
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //Google traduce,//algotitmo para reconocer patrones
        
    }
    
    
}
