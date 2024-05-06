package BUS;

import DAO.ThongkeDAO;
import Model.StatisticProduct;
import Model.StatisticReceipt;
import java.util.Date;
import java.util.ArrayList;

public class ThongkeBUS {

    private ThongkeDAO tkDAO = new ThongkeDAO();

    public void checkDate(Date bd, Date kt) throws IllegalArgumentException {
        //check date start , date end  start có nhỏ hơn bằng end ko
        if (bd == null || kt == null) {
            throw new IllegalArgumentException("Vui lòng không để trống ngày khi thống kê doanh thu và chi tiêu!! ");
        }
        if (bd.compareTo(kt) > 0) {
            throw new IllegalArgumentException("Ngày bắt đầu phải nhỏ hơn hoặc bằng ngày kết thúc!!");
        }
    }

    public ArrayList<StatisticProduct> getStatisticProducts(Date bd, Date kt) throws IllegalArgumentException {
        checkDate(bd, kt);
        return tkDAO.getStatisticProducts(bd, kt);
    }


    public ArrayList<StatisticProduct> getStatisticReceipts() {
        return tkDAO.getStatisticReceipts();
    }

    public ArrayList<StatisticReceipt> getStatisticReceipt(Date bd, Date kt) throws IllegalArgumentException {
         checkDate(bd, kt);
        return tkDAO.getStatisticDetailsReceipt(bd, kt);
    }
}
