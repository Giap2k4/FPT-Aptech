package array;

import java.util.ArrayList;
import java.util.List;

public class testArray {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("Nghệ An");
        arr.add("Hà Nội");
        arr.add("Hà Tĩnh");
        arr.add("Quảng Bình");
        arr.add("Quảng Ngãi");
        System.out.println(arr);
//      THÊM
        arr.add(2,"Phú Yên");
        arr.add(3,"Phong");
        System.out.println(arr);
//      SỬA
        arr.set(4,"Lâm Đồng");
        System.out.println(arr);
//      XÓA
        arr.remove(4);
        System.out.println(arr);
//      XÓA DÙNG HÀM removeIf()
        arr.removeIf(n -> (n.charAt(0) == 'P'));
        System.out.println(arr);
//      TẠO MẢNG MỚI CHỨA CÁC ĐỐI TƯỢNG CẦN XÓA
        List<String> arr1 = new ArrayList<>();
        arr1.add("Quảng Bình");
        arr1.add("Quảng Ngãi");

        arr.removeAll(arr1);
        System.out.println(arr);

//      XÓA OBJ TẠI VÍ TRÍ CỦA NÓ
        arr.remove(1);
        System.out.println(arr);
//      XÓA OBJ
        arr.remove("Nghệ An");
        System.out.println("Xóa đối tượng \"Nghệ An\": " + arr);
    }
}
