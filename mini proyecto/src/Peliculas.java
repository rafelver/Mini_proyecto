import java.io.Serializable;

public class Peliculas implements Serializable{

	private String nombre,genero;
	private int a�o;
	
	
	public Peliculas(String nom,String gen,int a) {
		nombre=nom;
		genero=gen;
		a�o=a;
	}

	public Peliculas(){
		nombre="";
		genero="";
		a�o=0;
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
	
	public void seta�opel(int a){
		a�o=a;
	}
	
	public int geta�opel(){
		return a�o;
	}
	
	
}
