package renanpr.poc.feign.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import renanpr.poc.feign.client.MockapiClient;
import renanpr.poc.feign.vo.CharacterVo;

import java.util.List;

@RestController
@RequestMapping(value = "/mockapi", produces = MediaType.APPLICATION_JSON_VALUE)
public class MockapiController {

    private final MockapiClient mockapiClient;

    public MockapiController(MockapiClient mockapiClient) {
        this.mockapiClient = mockapiClient;
    }

    @GetMapping(value = "/people/{characterId}")
    public CharacterVo getCharacterById(@PathVariable("characterId") Long characterId) {
        return mockapiClient.getCharacterById(characterId);
    }

    @GetMapping(value = "/people")
    public List<CharacterVo> getCharacters() {
        return mockapiClient.getCharacters();
    }
}
