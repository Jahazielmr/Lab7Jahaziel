package jahazielmorenolab7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdministrarBatallas {
    
    private ArrayList <Batalla> batallas = new ArrayList();
    private File archivo= null;
    
    
    public AdministrarBatallas (String path){
        archivo = new File(path);
    }

    public AdministrarBatallas() {
    }

    public ArrayList<Batalla> getBatallas() {
        return batallas;
    }

    public void setBatallas(ArrayList<Batalla> batallas) {
        this.batallas = batallas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setBatalla (Batalla batalla){
        batallas.add(batalla);
    }
    
    
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;        
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Batalla t : batallas) {
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
            batallas = new ArrayList();
            
            Batalla temp;
            if (archivo.exists()){
                FileInputStream entrada= new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                
                try {
                    while((temp = (Batalla) objeto.readObject())!=null){//simpre lanzara un exception
                        batallas.add(temp);
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
