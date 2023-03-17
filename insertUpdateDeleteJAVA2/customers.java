package SQL2;

import java.sql.*;
import java.util.Scanner;

public class customers {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind","root","");


            System.out.println("1. Xem danh sách khách hàng bảng customers\n2. Thêm dữ liệu vào bảng\n3. Chỉnh sửa dữ liệu\n4. Xóa dữ liệu\n5. Thoát");
            while (true){
                PreparedStatement sqlSelect = cn.prepareStatement("SELECT CustomerID, ContactName, CompanyName,City FROM `customers` WHERE CustomerID like 'A%'");
                PreparedStatement sqlInsert = cn.prepareStatement("insert into customers(CustomerID, ContactName, CompanyName,City) values (?,?,?,?)");
                PreparedStatement sqlDelete = cn.prepareStatement("delete from customers where CustomerID = ?");
                System.out.printf("- Nhập lựa chọn: ");
                int a = sc.nextInt();
                sc.nextLine();
                switch (a){
                    case 1:
                        ResultSet rs = sqlSelect.executeQuery();
                        ResultSetMetaData rsmd = rs.getMetaData();
                        int column = rsmd.getColumnCount();
                        for (int i = 1; i <= column;++i){
                            System.out.printf("%-30s", rsmd.getColumnName(i));
                        }
                        System.out.println();
                        for (int i = 1; i<= column;++i){
                            System.out.printf("%-30s", "("+rsmd.getColumnClassName(i)+")");
                        }
                        System.out.println();
                        while (rs.next()){
                            for (int i = 1; i<=column;++i){
                                System.out.printf("%-30s",rs.getString(i));
                            }
                            System.out.println();
                        }
                        break;
                    case 2:
                        System.out.printf("- Nhập CustomerID(kí tự đầu tiên bắt buộc là 'A'): ");
                        String CustomerID = sc.nextLine();
                        System.out.printf("- Nhập ContactName: ");
                        String ContactName = sc.nextLine();
                        System.out.printf("- Nhập CompanyName: ");
                        String CompanyName = sc.nextLine();
                        System.out.printf("- Nhập City: ");
                        String City = sc.nextLine();

                        sqlInsert.setString(1,CustomerID);
                        sqlInsert.setString(2,ContactName);
                        sqlInsert.setString(3,CompanyName);
                        sqlInsert.setString(4,City);

                        int check = sqlInsert.executeUpdate();
                        if(check>=1){
                            System.out.println("=== Số dòng bị ảnh hưởng là "+check);
                            System.out.println("=> Cập nhật dữ liệu thành công!");
                        }else {
                            System.out.println("=== Số dòng bị ảnh hưởng là "+check);
                            System.out.println("=> Cập nhật dữ liệu thất bại!");
                        }
                        break;
                    case 3:
                        System.out.println("1. ContactName\n2. CompanyName\n3. City");
                        System.out.printf("- Chọn nội dung cần sửa: ");
                        int b = sc.nextInt();
                        sc.nextLine();
                        switch (b){
                            case 1:
                                PreparedStatement sqlUpdate1 = cn.prepareStatement("update customers set ContactName  = ? where CustomerID = ?");
                                System.out.printf("- Nhập ContactName mới: ");
                                String ContactName1 = sc.nextLine();
                                System.out.printf("- Nhập CusomerID: ");
                                String customer1 = sc.nextLine();
                                sqlUpdate1.setString(1,ContactName1);
                                sqlUpdate1.setString(2,customer1);
                                int check1 = sqlUpdate1.executeUpdate();
                                if(check1>=1){
                                    System.out.println("=== Số dòng bị ảnh hưởng là "+check1);
                                    System.out.println("=> Cập nhật dữ liệu thành công!");
                                }else {
                                    System.out.println("=== Số dòng bị ảnh hưởng là "+check1);
                                    System.out.println("=> Cập nhật dữ liệu thất bại!");
                                }
                                break;
                            case 2:
                                PreparedStatement sqlUpdate2 = cn.prepareStatement("update customers set CompanyName  = ? where CustomerID = ?");
                                System.out.printf("- Nhập CompanyName mới: ");
                                String CompanyName1 = sc.nextLine();
                                System.out.printf("- Nhập CusomerID: ");
                                String customer2 = sc.nextLine();
                                sqlUpdate2.setString(1,CompanyName1);
                                sqlUpdate2.setString(2,customer2);
                                int check2 = sqlUpdate2.executeUpdate();
                                if(check2>=1){
                                    System.out.println("=== Số dòng bị ảnh hưởng là "+check2);
                                    System.out.println("=> Cập nhật dữ liệu thành công!");
                                }else {
                                    System.out.println("=== Số dòng bị ảnh hưởng là "+check2);
                                    System.out.println("=> Cập nhật dữ liệu thất bại!");
                                }
                                break;
                            case 3:
                                PreparedStatement sqlUpdate3 = cn.prepareStatement("update customers set City  = ? where CustomerID = ?");
                                System.out.printf("- Nhập City mới: ");
                                String City1 = sc.nextLine();
                                System.out.printf("- Nhập CusomerID: ");
                                String customer3 = sc.nextLine();
                                sqlUpdate3.setString(1,City1);
                                sqlUpdate3.setString(2,customer3);
                                int check3 = sqlUpdate3.executeUpdate();
                                if(check3>=1){
                                    System.out.println("=== Số dòng bị ảnh hưởng là "+check3);
                                    System.out.println("=> Cập nhật dữ liệu thành công!");
                                }else {
                                    System.out.println("=== Số dòng bị ảnh hưởng là "+check3);
                                    System.out.println("=> Cập nhật dữ liệu thất bại!");
                                }
                                break;
                        }
                        break;
                    case 4:
                        System.out.printf("- Nhập CustomerID cần xóa: ");
                        String b1 = sc.nextLine();
                        sqlDelete.setString(1,b1);
                        int check1 = sqlDelete.executeUpdate();
                        if(check1>=1){
                            System.out.println("=== Số dòng bị ảnh hưởng là "+check1);
                            System.out.println("=> Cập nhật dữ liệu thành công!");
                        }else {
                            System.out.println("=== Số dòng bị ảnh hưởng là "+check1);
                            System.out.println("=> Cập nhật dữ liệu thất bại!");
                        }
                        break;
                    case 5:
                        return;
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
