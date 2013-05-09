package edu.tallerweb.pptls;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.tallerweb.pptls.Forma;
import edu.tallerweb.pptls.Resultado;
import edu.tallerweb.pptls.Mano;
public class PartidaTests {

	
	@Test
	public void quePiedraEmpataConPiedra() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("piedra empata con  piedra",Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));
	}
	

	
	@Test
	public void quePiedraPierdeConPapel() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("piedra le gana a papel",Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));
	}
	@Test
	public void quePiedraGanaATijera(){	
		
	Mano jugadorUno = new Mano(Forma.PIEDRA);
	Mano jugadorDos = new Mano(Forma.TIJERA);
	
	assertEquals("piedra le gana a tijera",Resultado.GANA,jugadorUno.jugarCon(jugadorDos));
	}
	@Test
	public void quePiedraAplastaLagarto(){	
		
	Mano jugadorUno = new Mano(Forma.PIEDRA);
	Mano jugadorDos = new Mano(Forma.LAGARTO);
	
	assertEquals("piedra aplasta a lagarto",Resultado.GANA,jugadorUno.jugarCon(jugadorDos));
	}
	@Test
	public void queSpockSeEnvenenaCONLagarto(){	
		
		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.LAGARTO);
		
		assertEquals("spock se envenena con lagarto",Resultado.PIERDE,jugadorUno.jugarCon(jugadorDos));
		}
			
		
		
		
		
	}


