package Service;
import Model.DAOSer.DAOSerBrand;
import Model.bo.Brand;
import java.util.List;
public class ServiceBrand {
    public static void Update(int id, Brand brand){
        DAOSerBrand brandDAO = new DAOSerBrand();
        brandDAO.Update(id, brand);
    }
    public static void Delete(int id){
        DAOSerBrand brandDAO = new DAOSerBrand();
        brandDAO.Delete(id);
    }
    public static void Create(Brand brand){
        DAOSerBrand brandDAO = new DAOSerBrand();
        brandDAO.Create(brand);
    }
    public static Brand GetById(int id){
        DAOSerBrand brandDAO = new DAOSerBrand();
        return brandDAO.GetById(id);
    }
    public static List<Brand> GetAll(){
        DAOSerBrand brandDAO = new DAOSerBrand();
        return brandDAO.GetAll();
    }
}