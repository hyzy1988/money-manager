package pl.sda.moneymanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProjectOwnerDto {

//    @JsonProperty("login") <-- nie jest konieczne bo nazwy zgadzają się
    private String login;

}
