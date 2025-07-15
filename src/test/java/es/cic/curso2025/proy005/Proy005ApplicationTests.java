package es.cic.curso2025.proy005;

import java.util.ArrayList;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
// import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class Proy005ApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testTelefonoDelete() throws Exception {
		mockMvc.perform(delete("/telefono/1"))
				.andExpect(status().isOk()).andReturn();
	}

	@Test
	void testLista() {
		ArrayList miLista = new ArrayList();
		miLista.add("Hola");

		String resultado = (String) miLista.get(0);

		ArrayList<String> miLista2 = new ArrayList<>();
		miLista2.add("Hola Mundo");
		String resultado2 = miLista2.get(0);
	}
}
