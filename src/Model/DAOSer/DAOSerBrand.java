package Model.DAOSer;

import Model.bo.Brand;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOSerBrand implements InterfaceDAO<Brand> {

    private final File file = new File(".\\src\\Serialização\\Brand.txt");

    @Override
    public void Create(Brand object) {
        Serialize<Brand> serialize = new Serialize();
        List<Brand> listBrand;

        try {
            listBrand = GetAll();
            listBrand.add(object);
            serialize.Serialize(file, (ArrayList) listBrand);
        } catch (IOException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }

    @Override
    public void Delete(int id) {
        Serialize<Brand> serialize = new Serialize();
        List<Brand> listBrand;
        listBrand = GetAll();
        for (int i = 0; i < listBrand.size(); i++) {
            if (listBrand.get(i).getId() == id) {
                listBrand.remove(i);
                break;
            }
        }
        for (int i = 0; i < listBrand.size(); i++) {
            listBrand.get(i).setId(i + 1);
        }
        try {
            serialize.Serialize(file, (ArrayList) listBrand);
        } catch (IOException ex) {
            System.err.println("Error: " + ex.getMessage());
        }

    }

    @Override
    public List<Brand> GetAll() {
        Serialize<Brand> serialize = new Serialize();
        List<Brand> listBrand = new ArrayList<>();
        try {
            listBrand = serialize.DeSerialize(file);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOSerBrand.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listBrand;
    }

    @Override
    public Brand GetById(int id) {
        List<Brand> listBrand;
        listBrand = GetAll();
        for (Brand current : listBrand) {
            if(current.getId() == id){
                return current;
            }
        }
        return null;
    }

    @Override
    public void Update(int id, Brand object) {
        Serialize<Brand> serialize = new Serialize();
        List<Brand> listBrand;
        listBrand = GetAll();
        for (int i = 0; i < listBrand.size(); i++) {
            if (listBrand.get(i).getId() == id) {
                listBrand.set(i, object);
                break;
            }
        }
        try {
            serialize.Serialize(file, (ArrayList) listBrand);
        } catch (IOException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
}
