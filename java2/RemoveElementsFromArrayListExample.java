package array;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
//        ADD: LÀ THÊM PHẦN TỬ VÀO MẢNG
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Initial List: "+programmingLanguages);
//      REMOVE: XÓA PHẦN TỬ (VỊ TRÍ THỨ ...)
        programmingLanguages.remove(5);
        System.out.println("After remove(5): "+programmingLanguages);
//      REMOVE: XÓA PHẦN TỬ (OBJ ĐÓ)
        boolean isRemove = programmingLanguages.remove("Kotlin");
        System.out.println("After remove(\"Kotlin\")"+programmingLanguages);

        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");

//      REMOVE: XÓA TẤT CẢ CÁC OBJ TRONG MẢNG scriptingLanguages CÓ TRONG MẢNG programmingLanguages
        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll: "+programmingLanguages);
        System.out.println(programmingLanguages);

//      REMOVE: XÓA CÁC OBJ BẮT ĐẦU BẰNG KÍ TỰ 'T' VÀ Ở VỊ TRÍ 0 CỦA MẢNG
        programmingLanguages.removeIf(n -> (n.charAt(0) == 'T'));
//      REMOVE: XÓA CÁC OBJ BẮT ĐẦU BẰNG KÍ TỰ 'C' VÀ CODE CHẠY TẤT CẢ
        programmingLanguages.removeIf(s -> (s.startsWith("C")));
        System.out.println(programmingLanguages);

//        REMOVE: clear: XÓA TẤT CẢ CÁC OBJ TRONG MẢNG
        programmingLanguages.clear();
        System.out.println(programmingLanguages);
    }
}
