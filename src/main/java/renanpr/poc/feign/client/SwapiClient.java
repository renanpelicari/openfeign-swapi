package renanpr.poc.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import renanpr.poc.feign.config.FeignConfig;
import renanpr.poc.feign.vo.CharacterVo;

@Service
@FeignClient(value = "star-wars", url = "https://swapi.co/api", configuration = FeignConfig.class)
public interface SwapiClient {

    @GetMapping(value = "/people/{characterId}")
    CharacterVo getCharacterById(@PathVariable("characterId") Long characterId);
}
