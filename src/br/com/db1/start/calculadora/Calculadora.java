package br.com.db1.start.calculadora;

public class Calculadora {

	private Integer valor1;
	private Integer valor2;

	public Calculadora() {
	}

	public Calculadora(Integer valor1, Integer valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	public Integer getValor1() {
		return valor1;
	}

	public void setValor1(Integer valor1) {
		this.valor1 = valor1;
	}

	public Integer getValor2() {
		return valor2;
	}

	public void setValor2(Integer valor2) {
		this.valor2 = valor2;
	}

	public Integer somar() {
		return valor1 + valor2;
	}

	public Integer dividir() {
		return valor1 / valor2;
	}

	public Integer subtrair() {
		return valor1 - valor2;
	}

	public Integer multiplicar() {
		return valor1 * valor2;
	}
}
