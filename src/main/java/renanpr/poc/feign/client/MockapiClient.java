package renanpr.poc.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import renanpr.poc.feign.vo.CharacterVo;

import java.util.List;

@FeignClient(name = "mockapiClient", url = "http://5bd1c0cfbded6100135c2fcf.mockapi.io")
public interface MockapiClient {

    @GetMapping(value = "/people/{characterId}")
    CharacterVo getCharacterById(@PathVariable("characterId") Long characterId);

    @GetMapping(value = "/people")
    List<CharacterVo> getCharacters();
}
