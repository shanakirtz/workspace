
public class Artists {


	private String bandName;
	private String songName;



	public Artists(String band, String song)
	{
		bandName = band;
		songName = song;
	}

	public void setBandName(String band)
	{
		bandName = band;
	}
	
	public void setSongName(String song)
	{
		songName = song;
	}
	
	public String getBandName()
	{
		return bandName;
	}
	
	public String getSongName()
	{
		return songName;
	}
	
	public String toString() 
	{
		String str = "The band's name is " + bandName + " and the song name is " + songName + ".";
		return str;
	}
}
