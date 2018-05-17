package br.com.db1.start.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.db1.start.calculadora.Calculadora;

class CalculadoraTest {

	@Test
	void testCalculadora() {
		Calculadora valores = new Calculadora(10, 10);

		assertEquals(0, valores.subtrair().intValue());
		assertEquals(20, valores.somar().intValue());
		assertEquals(100, valores.multiplicar().intValue());
		assertEquals(1, valores.dividir().intValue());

	}

	
	
}
