
public class TongHaiSo {

	public static void main(String[] args) {
		// Khai báo
		double num1, num2, sum;
		
		// Khai báo đối tượng Scanner
	    Scanner banPhim = new Scanner(System.in);
	    
	    // In ra thông tin, mời User nhập số thứ nhất
	    
	    System.out.print("Mời nhập số thứ nhất");
	    num1= banPhim.nextDouble();
	    
	    System.out.print("Mời nhập số thứ hai");
	    num2= banPhim.nextDouble();
	    
	    // Tính Toán
	    
	    sum = num1+num2;
	    		
	    // Xuất ra
//	    System.out.print("Tổng của" + num1 + "và " + num2 + "là" + sum);
	    
	    
//	    System.out.print("Tổng của ");
//      System.out.print(num1);
//	    System.out.print("và ");
//	    System.out.print(num2);
//	    System.out.print("là ");
//	    System.out.print(sum);
	    
	    System.out.print("Tổng của %.2f và %.2f là %.2f", num1 ,num2 ,sum);
	}

}
