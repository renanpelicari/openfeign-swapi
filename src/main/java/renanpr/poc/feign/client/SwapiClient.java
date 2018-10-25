package renanpr.poc.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import renanpr.poc.feign.vo.CharacterVo;

@FeignClient(name = "swapiClient", url = "https://swapi.co/api")
public interface SwapiClient {

    @RequestMapping(method = RequestMethod.GET, value = "/people/{characterId}")
    CharacterVo getCharacterById(@PathVariable("characterId") Long characterId);
}
