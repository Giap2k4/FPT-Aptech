package thi;

public class testBank {
    public static void main(String[] args) {
        Bank b = new Bank(1000,100);
        System.out.println("Lãi suất hàng tháng là: "+b.calulateInterest());
    }
}
