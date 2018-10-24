package renanpr.poc.feign.vo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonDeserialize(builder = CharacterVo.CharacterVoBuilder.class)
public class CharacterVo {

    private String name;

    @JsonPOJOBuilder(withPrefix = "")
    public static final class CharacterVoBuilder {
    }
}
