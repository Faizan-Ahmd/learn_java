import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How many stars you want ");
		int numOfStar=scan.nextInt();
		for(int i=1;i<=numOfStar;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=numOfStar-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
