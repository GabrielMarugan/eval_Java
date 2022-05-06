package edu.mns.dfs.eval;

import edu.mns.dfs.eval.models.Utilisateur;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EvalApplicationTests {

	@Autowired
	private WebApplicationContext context;

	private MockMvc mvc;

	@BeforeEach
	public void init(){
		mvc = MockMvcBuilders
				.webAppContextSetup(context)
				.build();
	}

	@Test
	void contextLoads() {
	}

	@Test
	void creerUtilisateur_listePaiementNotNull(){
		Utilisateur utilisateur = new Utilisateur();
		assertNotNull(utilisateur.getListeMoyenPaiement());
	}

	@Test
	void callApiGetListeEmploye_expected200(){

		try {
			mvc.perform(get("/liste-employe"))
					.andExpect(status().isOk());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	@Test
	void callApiGetListeEmploye_hadJson() throws Exception{


		mvc.perform(get("/liste-employe")
				.contentType(MediaType.APPLICATION_JSON)
		);

	}


}
