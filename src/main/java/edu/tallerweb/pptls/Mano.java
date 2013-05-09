package edu.tallerweb.pptls;
import edu.tallerweb.pptls.Forma;
import edu.tallerweb.pptls.Resultado;
/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano{

	public Forma forma;
	public Forma otra;
	public Resultado resultado;
	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
	public Mano(final Forma forma) {
		
		this.forma=forma;
		
	}

	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	

	
	
	
	
	Resultado jugarCon(final Mano otra) {
	
	
		
		if(this.forma==otra.forma)	
		{
			
				
		 this.resultado=resultado.EMPATA;
		
		}
		
		
		
	
		if(this.forma==forma.PIEDRA)
		{
		
		switch(otra.forma) {
			case  PAPEL:
			{
				
				this.resultado=Resultado.PIERDE;
				break;
			}
			
			case  TIJERA:
			{
				this.resultado=Resultado.GANA;
				break;
			}
			
			case  LAGARTO:
			{
				this.resultado=Resultado.GANA;
				break;
			}
			
			case SPOCK:
			{
				this.resultado=Resultado.PIERDE;
				break;
			}
		default:
			break;
		}}
		
		
		else if(this.forma==this.forma.SPOCK)
		{
			switch(otra.forma) {
			
			
			
			case  PIEDRA:
			{
				
				this.resultado=Resultado.GANA;
				break;
			}
			
			
			case  PAPEL:
			{
				
				this.resultado=Resultado.PIERDE;
				break;
			}
			
			case  TIJERA:
			{
				this.resultado=Resultado.GANA;
				break;
			}
			
			case  LAGARTO:
			{
				this.resultado=Resultado.PIERDE;
				break;
			}
			
			
		default:{
			break;
		}
			
		
		}}
			else if(this.forma==this.forma.PAPEL)
			{
				switch(otra.forma) {
				
				
				
				case  PIEDRA:
				{
					
					this.resultado=Resultado.GANA;
					break;
				}
						
				case  TIJERA:
				{
					this.resultado=Resultado.PIERDE;
					break;
				}
				
				case  LAGARTO:
				{
					this.resultado=Resultado.PIERDE;
					break;
				}
				
				case SPOCK:
				{
					this.resultado=Resultado.GANA;
					break;
				}
			default:
			{
				break;
			}
				}	
							
				
			}
			else if(forma==this.forma.LAGARTO)
			{
				switch(otra.forma) {
				
				
				
				case  PIEDRA:
				{
					
					this.resultado=Resultado.PIERDE;
					break;
				}
				
				
				case  PAPEL:
				{
					
					this.resultado=Resultado.GANA;
					break;
				}
				
				case  TIJERA:
				{
					this.resultado=Resultado.PIERDE;
					break;
				}
				
			
				
				case SPOCK:
				{
					this.resultado=Resultado.GANA;
					break;
				}
			    default:
			{
				break;
			}
				
				
				}	
						
			}else if(forma==this.forma.TIJERA)
			{
				switch(otra.forma) {
				
				
				
				case  PIEDRA:
				{
					
					this.resultado=Resultado.PIERDE;
					break;
				}
				
				
				case  PAPEL:
				{
					
					this.resultado=Resultado.GANA;
					break;
				}
				
			
				
				case  LAGARTO:
				{
					this.resultado=Resultado.GANA;
					break;
				}
				
				case SPOCK:
				{
					this.resultado=Resultado.PIERDE;
					break;
				}
			    
				default:
				{
					break;
				}
				
			}
			
		}	
		
		
		
	
	return this.resultado;
	
	
}
}
		