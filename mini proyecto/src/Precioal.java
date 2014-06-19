import java.io.Serializable;


public class Precioal implements Serializable{
  
	private float precionorm,precioofer,prenormalventa,preofertaventa;
	
	
	public Precioal(float prenor,float preofer,float prenorventa,float preoferventa) {
		precionorm=prenor;
		precioofer=preofer;
		prenormalventa=prenorventa;
		preofertaventa=preoferventa;
	}
	
	public Precioal() {
		precionorm=0.0f;
		precioofer=0.0f;
		prenormalventa=0.0f;
		preofertaventa=0.0f;
	}
	
	public void setPrecionormal (float prenor){
		precionorm=prenor;
	}
	
	public float getPrecionormal(){
		return precionorm;
	}
	
	public void setPreciooferta (float preofer){
		precioofer=preofer;
	}
	
	public float getPreciooferta(){
		return precioofer;
	}

	public void setPrecionormalvent (float prenorventa){
		prenormalventa=prenorventa;
	}
	public float getPrecionormalvent(){
		return prenormalventa;
	}
	public void setPrecioofertavent (float preoferventa){
		preofertaventa=preoferventa;
	}
	public float getPrecioofertavent (){
		return preofertaventa;
	}
}



