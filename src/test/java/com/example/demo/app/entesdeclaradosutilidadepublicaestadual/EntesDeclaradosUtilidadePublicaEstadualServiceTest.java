package com.example.demo.app.entesdeclaradosutilidadepublicaestadual;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.com.example.demo.app.api.EnteDeclaradoUtilidadePublicaEstadual;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class EntesDeclaradosUtilidadePublicaEstadualServiceTest {

	@Autowired
	private EntesDeclaradosUtilidadePublicaEstadualService service;

	@Test
	public void veriryTransformEntityInDTO() throws JsonProcessingException, Exception {
		EnteDeclaradoUtilidadePublicaEstadual entityTest = new EnteDeclaradoUtilidadePublicaEstadual();
		entityTest.setCdcomarca(1);
		entityTest.setCdentepub(1565L);
		entityTest.setDtLei("17/09/1975");
		entityTest.setDtLeiExtenso("17/09/1975");
		entityTest.setLei("5.133");
		entityTest.setNomeComarca("Abelardo Luz");
		entityTest
				.setNomeComarcaEntidade("Abelardo Luz - ASSOCIAÇÃO ATLÉTICA BEIRA RIO ( Lei n. 5.133 de 17/09/1975 )");
		entityTest.setNomeEntidade("ASSOCIAÇÃO ATLÉTICA BEIRA RIO");

		EntesDeclaradosUtilidadePublicaEstadualDTO dtoTest = new EntesDeclaradosUtilidadePublicaEstadualDTO(1565L,
				"5.133", "ASSOCIAÇÃO ATLÉTICA BEIRA RIO", 1L);

		List<EnteDeclaradoUtilidadePublicaEstadual> entities = new ArrayList<>();
		entities.add(entityTest);

		List<EntesDeclaradosUtilidadePublicaEstadualDTO> dtoList = service.entityToDto(entities);
		EntesDeclaradosUtilidadePublicaEstadualDTO dto = dtoList.stream().findFirst().get();
		assertEquals(1, dtoList.size());
		assertThat(dtoTest).usingRecursiveComparison().isEqualTo(dto);
	}

	@Test
	public void verifyFilterByIdVerify() {
		String responseExpected = "[{\"id\":1,\"cdentepub\":1565,\"lei\":\"5.133\",\"nomeEntidade\":\"ASSOCIAÇĂO ATLÉTICA BEIRA RIO\"}]";
		String response = service.filterById(1L);
		assertEquals(responseExpected, response);
	}

	@Test
	public void verifyFilterByNomeEntidade() {
		String responseExpected = "[{\"id\":1,\"cdentepub\":909,\"lei\":\"7.281\",\"nomeEntidade\":\"SOCIEDADE RECREATIVA ESPORTIVA 1ş DE MAIO\"},{\"id\":2,\"cdentepub\":912,\"lei\":\"14.759\",\"nomeEntidade\":\"SOCIEDADE RECREATIVA ESPORTIVA E CULTURAL COMERCIAL\"},{\"id\":3,\"cdentepub\":915,\"lei\":\"6.686\",\"nomeEntidade\":\"SOCIEDADE RECREATIVA ESPORTIVA E CULTURAL NOVO HORIZONTE\"},{\"id\":4,\"cdentepub\":917,\"lei\":\"5.232\",\"nomeEntidade\":\"SOCIEDADE RECREATIVA ESPORTIVA FLUMINENSE FUTEBOL CLUBE\"},{\"id\":5,\"cdentepub\":911,\"lei\":\"11.473\",\"nomeEntidade\":\"SOCIEDADE RECREATIVA ESPORTIVA AMIGOS DO GRAVATÁ\"},{\"id\":6,\"cdentepub\":914,\"lei\":\"3.582\",\"nomeEntidade\":\"SOCIEDADE RECREATIVA ESPORTIVA E CULTURAL GUARANY\"},{\"id\":7,\"cdentepub\":916,\"lei\":\"5.891\",\"nomeEntidade\":\"SOCIEDADE RECREATIVA ESPORTIVA E CULTURAL PALMEIRAS\"}]";
		String response = service.filterByNomeEntidade("SOCIEDADE RECREATIVA ESPORTIVA");
		assertEquals(responseExpected, response);
	}

	@Test
	public void verifyGetWithPagination() {
		String responseExpected = "[{\"id\":1,\"cdentepub\":123,\"lei\":\"6.374\",\"nomeEntidade\":\"ASSOCIAÇĂO DE PAIS E AMIGOS DOS EXCEPCIONAIS (APAE)\"},{\"id\":2,\"cdentepub\":2699,\"lei\":\"13.09\",\"nomeEntidade\":\"ASSOCIAÇĂO DE PAIS E AMIGOS DOS EXCEPCIONAIS (APAE)\"},{\"id\":3,\"cdentepub\":2664,\"lei\":\"13.091\",\"nomeEntidade\":\"ASSOCIAÇĂO DE PAIS E AMIGOS DOS EXCEPCIONAIS (APAE) DE IPUAÇÚ\"},{\"id\":4,\"cdentepub\":3172,\"lei\":\"10.424\",\"nomeEntidade\":\"ASSOCIAÇĂO DOS IDOSOS\"},{\"id\":5,\"cdentepub\":3445,\"lei\":\"9.937\",\"nomeEntidade\":\"ASSOCIAÇĂO DOS SERVIDORES MUNICIPAIS\"}]";
		String response = service.getWithPagination(1, 5);
		assertEquals(responseExpected, response);
	}

	@Test
	public void verifyTransformDtoToJson() {
		EntesDeclaradosUtilidadePublicaEstadualDTO dtoTest = new EntesDeclaradosUtilidadePublicaEstadualDTO(1565L,
				"5.133", "ASSOCIAÇÃO ATLÉTICA BEIRA RIO", 1L);
		List<EntesDeclaradosUtilidadePublicaEstadualDTO> dtoListTest = new ArrayList<>();
		dtoListTest.add(dtoTest);
		String json = service.dtoToJson(dtoListTest);

		assertEquals(
				"[{\"id\":1,\"cdentepub\":1565,\"lei\":\"5.133\",\"nomeEntidade\":\"ASSOCIAÇÃO ATLÉTICA BEIRA RIO\"}]",
				json);
	}

}
