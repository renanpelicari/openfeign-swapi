package renanpr.poc.feign.service;

import org.springframework.stereotype.Service;
import renanpr.poc.feign.client.SwapiClient;
import renanpr.poc.feign.vo.CharacterVo;

import java.util.Optional;
import java.util.Random;

@Service
public class SwapiService {

    private final SwapiClient swapiClient;

    public SwapiService(SwapiClient swapiClient) {
        this.swapiClient = swapiClient;
    }

    public CharacterVo getCharacterById(final Long characterId) {
        final Long id = Optional.ofNullable(characterId)
                .orElse(new Random().nextLong());
        return swapiClient.getCharacterById(id);
    }
}
