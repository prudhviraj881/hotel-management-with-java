import java.util.Scanner;
class Hotel {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int collected = display();
		total = total+collected;
		System.out.println("Please press 0 to CONTINUE.......1 to EXIT.");
		int num;
		num = sc.nextInt();
		while(num<1) {
			int collect = display();
			total=total+collect;
			System.out.println("Please press 0 to CONTINUE.......1 to EXIT.");
			num = sc.nextInt();
		}
			System.out.println("Total : "+total);
	}	
	public static int display() {
		Scanner sc = new Scanner(System.in);
		int ttl = 0;
		int[] a={20,30,10,30,25,20};
		String[] b={"Dosa","Idly","Vada","Poori","Lemon rice","Upma"};
		for(int i=0;i<a.length;i++) {
		System.out.println((i+1)+". "+b[i]+"= "+a[i]); 
		}
		System.out.println("Select a item :");
		int item = sc.nextInt();
		ttl=ttl + a[item-1];
		return ttl;
	}
}