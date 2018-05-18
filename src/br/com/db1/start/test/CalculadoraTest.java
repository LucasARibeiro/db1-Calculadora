package br.com.db1.start.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.db1.start.calculadora.Calculadora;

class CalculadoraTest {

	@Test
	void testCalculadora() {
		Calculadora valores = new Calculadora(10d, 10d);

		assertTrue(0 == valores.subtrair());
		assertTrue(20 == valores.somar());
		assertTrue(100 == valores.multiplicar());
		assertTrue(1 == valores.dividir());

		
		assertEquals(0d,valores.subtrair().doubleValue());
		assertEquals(20d, valores.somar().doubleValue());
		assertEquals(100d, valores.multiplicar().doubleValue());
		assertEquals(1d	, valores.dividir().doubleValue());
	}

}
