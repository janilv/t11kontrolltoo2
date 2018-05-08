package ioa;

public class Ioon implements IoonData{
	public String nimetus(){
		return nimetus;
	}
	
	public String laeng(){
		return laeng;
	}
	
	public int aatommasside_summa(){
		return aatommasside_summa;
	}
	
	String nimetus;
	String laeng;
	int aatommasside_summa;
	
	public Ioon(String nimetus, String laeng, int aatommasside_summa){
		this.nimetus = nimetus;
		this.laeng = laeng;
		this.aatommasside_summa = aatommasside_summa;
	}
}