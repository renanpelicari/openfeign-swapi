package renanpr.poc.feign.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import renanpr.poc.feign.client.SwapiClient;
import renanpr.poc.feign.vo.CharacterVo;

import java.util.Optional;
import java.util.Random;

@RestController
@RequestMapping(value = "/swapi", produces = MediaType.APPLICATION_JSON_VALUE)
public class SwapiController {

    private final SwapiClient swapiClient;

    public SwapiController(SwapiClient swapiClient) {
        this.swapiClient = swapiClient;
    }

    @GetMapping(value = "/people/{characterId}")
    public CharacterVo getCharacterById(@PathVariable("characterId") Long characterId) {
        final Long id = Optional.ofNullable(characterId)
                .orElse(new Random().nextLong());
        return swapiClient.getCharacterById(id);
    }
}
