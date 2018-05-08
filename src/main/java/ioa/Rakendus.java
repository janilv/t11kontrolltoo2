package ioa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@SpringBootApplication

public class Rakendus{
	@Autowired
	@RequestMapping("/iooninimi")
	public String IooniNimi(){
		Ioon io1 =new Ioon("H", "+", 1);
		Ioon io2 =new Ioon("NO", "-", 1);
		
		if(io1.laeng != io2.laeng && io1.aatommasside_summa == io2.aatommasside_summa){
			return "Iooninimi koos laengutega on " + io1.nimetus + io1.aatommasside_summa + io1.laeng+ " " +io2.nimetus + io2.aatommasside_summa + io2.laeng + " ";} return null; 
	}
	
	@Autowired
	@RequestMapping("/ioonmass")
	public String MolekulideMass(){
		IoonMass im1= new IoonMass("H", 18);
		IoonMass im2= new IoonMass("NO", 33);
		return "Nende kahe molekuli masside summa on: " + (im1.molekulmass+im2.molekulmass);
	}
	
	public static void main(String[] args){
		SpringApplication.run(Rakendus.class);
	}
}