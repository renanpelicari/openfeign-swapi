package renanpr.poc.feign.vo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonDeserialize(builder = CharacterVo.CharacterVoBuilder.class)
public class CharacterVo {

    private Long id;

    private String name;

    private String avatar;

    @JsonPOJOBuilder(withPrefix = "")
    public static final class CharacterVoBuilder {
    }
}
