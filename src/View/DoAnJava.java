package View;

import DataCon.JDBC;

public class DoAnJava {

    public static void main(String[] args) {
//        String a = "user";
//        String b = "admin";
//        if ("u".equals(a.substring(0, 1))) {
//            System.out.println(a);
//            System.out.println(a.substring(0, 1));
//        } else {
//            System.out.println(b);
//            System.out.println(a.substring(0, 1));
//        }
      JDBC.getConnection();
    }

}
