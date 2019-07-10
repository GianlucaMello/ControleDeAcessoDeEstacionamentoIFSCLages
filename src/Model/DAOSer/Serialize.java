package Model.DAOSer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.io.File;
public class Serialize<T> implements Serializable {
    public void Serialize(File file, ArrayList<T> list) throws FileNotFoundException, IOException {
        File path = new File(file.toString());
        try{
            path.createNewFile();
            try (ObjectOutputStream memoryObject = new ObjectOutputStream(new FileOutputStream(path))) {
                memoryObject.writeObject(list);
                memoryObject.flush();
                memoryObject.close();
            }
        }catch (IOException ex){
            System.err.println("Error: " + ex.getMessage()); 
        }
    }
     public ArrayList<T> DeSerialize(File file) throws ClassNotFoundException{
         ArrayList<T> list = new ArrayList<>();
         try{
             File path = new File(file.toString());
             if (file.exists()){
                 try (ObjectInputStream memoryObject = new ObjectInputStream(new FileInputStream(path))) {
                     list = (ArrayList<T>) memoryObject.readObject();
                 }
             }
         } catch(IOException ex){
             System.err.println("Error: " + ex.getMessage());
         }
         return list;
         
     }
}
