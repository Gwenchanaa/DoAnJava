/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author CUONG
 */
/*INSERT INTO [dbo].[Orders]
           ([OrderID]
           ,[UserID]
           ,[CustomerID]
           ,[OrderDate])
     VALUES
           (<OrderID, nvarchar(7),>
           ,<UserID, nvarchar(7),>
           ,<CustomerID, nvarchar(7),>
           ,<OrderDate, date,>)*/
public class Order {
           String orderid,userid,customerid,orderdate;

    public Order() {
    }

    public Order(String orderid, String userid, String customerid, String orderdate) {
        this.orderid = orderid;
        this.userid = userid;
        this.customerid = customerid;
        this.orderdate = orderdate;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }
           
}
