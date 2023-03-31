package thidk.testhello;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.sql.*;

public class product {
    @FXML
    protected TextField name;
    @FXML
    protected TextField price;
    @FXML
    protected TextField Description;
    @FXML
    protected TextField Qty;
    @FXML
    protected TextField id;
    @FXML
    protected Label label;

    public void onClickADD(){
        if(name.getText().isBlank() == false || price.getText().isBlank() == false || Description.getText().isBlank() == false || Qty.getText().isBlank() == false ){
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/checkemail","root","");
                String sql = "insert into product(name, price, description, qty) values (?,?,?,?)";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1,name.getText());
                pst.setString(2,price.getText());
                pst.setString(3,Description.getText());
                pst.setString(4,Qty.getText());

                int check = pst.executeUpdate();
                if (check > 0){
                    label.setText("Thêm sản phẩm thành công!");
                }else {
                    label.setText("Thêm sản phẩm thất bại!");
                }

            } catch (SQLException e) {
                label.setText("Lỗi kết nối cơ sở dữ liệu");
            }
        }else {
            label.setText("Hãy điền đầy đủ thông tin!");
        }
    }


    public void onClickUPDATE(ActionEvent actionEvent) {
        if(id.getText().isBlank() == false || name.getText().isBlank() == false || price.getText().isBlank() == false || Description.getText().isBlank() == false || Qty.getText().isBlank() == false ){
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/checkemail","root","");
                String sql = "update product set name = ?, price = ?, description = ?, qty = ? where id = ? ";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1,name.getText());
                pst.setString(2,price.getText());
                pst.setString(3,Description.getText());
                pst.setString(4,Qty.getText());
                pst.setString(5,id.getText());

                int check = pst.executeUpdate();
                if (check > 0){
                    label.setText("Sửa thành công!");
                }else {
                    label.setText("Sửa thất bại!");
                }

            } catch (SQLException e) {
                label.setText("Lỗi kết nối cơ sở dữ liệu");
            }
        }else {
            label.setText("Hãy điền đầy đủ thông tin!");
        }
    }

    public void onClickDELETE(ActionEvent actionEvent) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/checkemail","root","");
            String sql = "delete from product where id = ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,id.getText());
            int check = pst.executeUpdate();
            if (check>0){
                label.setText("Xóa thành công sản phẩm "+id.getText());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
