
public class myInfo {


	public static void main(String[] args) {
		
		Info myInfo = new Info("Shana", "Boca Colony Dr", 22, 3743336);
		
		System.out.println("your name is " + myInfo.getName());
		System.out.println("your address is " + myInfo.getAddress());
		System.out.println("your age is " + myInfo.getAge());
		System.out.println("your phone is " + myInfo.getPhone());
		
		
		Info friendInfo = new Info("Mark", "Hot Guy Street", 28, 5559999);
		
		System.out.println("friend's name is " + friendInfo.getName());
		System.out.println("friend's address is " + friendInfo.getAddress());
		System.out.println("friend's age is " + friendInfo.getAge());
		System.out.println("friend's phone is " + friendInfo.getPhone());
		
		Info familyInfo = new Info("Crazies", "Insane Asylum Lane", 56, 911911);
		
		System.out.println("family name is " + familyInfo.getName());
		System.out.println("family address is " + familyInfo.getAddress());
		System.out.println("family age is " + familyInfo.getAge());
		System.out.println("family phone is " + familyInfo.getPhone());
	}
	

}
