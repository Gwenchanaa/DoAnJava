package BUS;

import DAO.ThongkeDAO;
import Model.StatisticProduct;
import java.sql.Date;
import java.util.ArrayList;

public class ThongkeBUS {

    private ThongkeDAO tkDAO = new ThongkeDAO();
    public void checkDate(Date start, Date end) throws IllegalArgumentException{
          //check date start , date end  start có nhỏ hơn bằng end ko
          if(start == null || end == null){
              throw new IllegalArgumentException("Khong duoc de trong");
          } 
          if(start.compareTo(end)>0){
               throw new IllegalArgumentException("bat dau phai be hon bang ngay ket thuc");
          }
    }
    public ArrayList<StatisticProduct> getStatisticProducts(Date start, Date end) throws IllegalArgumentException {
      
        checkDate(start,end);
        
        return tkDAO.getStatisticProducts(start, end);
    }
}
