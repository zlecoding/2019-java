import java.util.Scanner;

public class Array2_2Print {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("입력하실 배열의 행 값을 입력해주세요.");
		int h = sc.nextInt();
		System.out.println("입력하실 배열의 열 값을 입력해주세요.");
		int r = sc.nextInt();
		
		int [][] a = new int [h][r];
		
		int sum = 0;
		
		for(int i=0; i<h; i++) {
			for(int j=0; j<r; j++) {
				a[i][j] = (int)(Math.random()*25)+1;
				sum += a[i][j];
				System.out.println(a[i][j]);
			}
		}
		
		double re = sum/(h*r);
		
		System.out.println("합: "+sum);
		System.out.println("평균: "+re);
		
	
	}

}
