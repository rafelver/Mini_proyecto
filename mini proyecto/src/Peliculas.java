import java.io.Serializable;

public class Peliculas implements Serializable{

	private String nombre,genero;
	private int año;
	
	
	public Peliculas(String nom,String gen,int a) {
		nombre=nom;
		genero=gen;
		año=a;
	}

	public Peliculas(){
		nombre="";
		genero="";
		año=0;
	}
	
	public void setnombrepel (String nom){
		nombre=nom;
	}
	
	public String getnombrepel (){
		return nombre;
	}
	
	public void setgeneropel (String gen){
		genero=gen;
	}
	
	public String getgeneropel (){
		return genero;
	}
	
	public void setañopel(int a){
		año=a;
	}
	
	public int getañopel(){
		return año;
	}
	
	
}
