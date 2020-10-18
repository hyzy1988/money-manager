package pl.sda.moneymanager.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IncomeDto extends BaseDto {
    private long incomeValueInCent;

    @JsonProperty("osoba")
    private PersonDto person;
    private IncomeSourceDto incomeSource;

}
