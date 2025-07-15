package es.cic.curso2025.proy005;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Proy005ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testLista(){
		ArrayList miLista = new ArrayList();
		miLista.add("Hola");

		String resultado = (String) miLista.get(0);

		ArrayList<String> miLista2 = new ArrayList<>();
		miLista2.add("Hola Mundo");
		String resultado2 = miLista2.get(0);
	}
}
