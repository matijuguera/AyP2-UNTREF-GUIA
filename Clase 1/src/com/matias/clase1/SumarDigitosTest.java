package com.matias.clase1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumarDigitosTest {
	@Test
	public void probandoUnNumeroPositivo() {
		assertEquals(22,SumarDigitos.Sumar(1984));
	}
	@Test
	public void probandoUnNumeroNegativo() {
		assertEquals(22,SumarDigitos.Sumar(-1984));
	}
}
