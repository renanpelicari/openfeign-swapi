package renanpr.poc.feign.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import renanpr.poc.feign.service.SwapiService;
import renanpr.poc.feign.vo.CharacterVo;

@RestController
@RequestMapping(value = "/swapi", produces = MediaType.APPLICATION_JSON_VALUE)
public class SwapiController {

    private final SwapiService swapiService;

    public SwapiController(SwapiService swapiService) {
        this.swapiService = swapiService;
    }

    @GetMapping(value = "/people/{characterId}")
    public CharacterVo getCharacterById(@PathVariable("characterId") Long characterId) {
        return swapiService.getCharacterById(characterId);
    }
}
