package io.groom.mybatis.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Setter
@Getter
public class  Board {

    private Long seq;

    private String title;

    private String contents;

    @JsonProperty("reguser")
    private String regUser;

    @JsonProperty("regdata")
    private LocalDateTime regDate;
}
