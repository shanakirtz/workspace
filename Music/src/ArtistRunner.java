import java.util.*;
public class ArtistRunner {

	public static void main(String[] args) {
		
		Artists a = new Artists("bandName", "songName" );
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter band name.");
		a.setBandName(scan.nextLine());
		
		System.out.println("Please enter song name.");
		a.setSongName(scan.nextLine());
		
		//System.out.println("The band's name is " + a.getBandName());
		//System.out.println("The song name is " + a.getSongName());
		
		System.out.println(a.toString());
	}

}
