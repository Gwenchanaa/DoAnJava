package BUS;

import DAO.ThongkeDAO;
import Model.StatisticProduct;
import java.util.Date;
import java.util.ArrayList;

public class ThongkeBUS {

    private ThongkeDAO tkDAO = new ThongkeDAO();
    public void checkDate(Date bd, Date kt) throws IllegalArgumentException{
          //check date start , date end  start có nhỏ hơn bằng end ko
          if(bd == null || kt == null){
              throw new IllegalArgumentException("Khong duoc de trong");
          } 
          if(bd.compareTo(kt)>0){
               throw new IllegalArgumentException("bat dau phai be hon bang ngay ket thuc");
          }
    }
    public ArrayList<StatisticProduct> getStatisticProducts(Date bd, Date kt) throws IllegalArgumentException {
      
        checkDate(bd,kt);
        
        return tkDAO.getStatisticProducts(bd, kt);
    }
}
