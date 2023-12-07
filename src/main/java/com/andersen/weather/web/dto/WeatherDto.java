package com.andersen.weather.web.dto;

import com.andersen.weather.entity.Temperature;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import java.time.LocalDate;
import java.util.List;

@Data
public class WeatherDto {
    private Long id;
    private LocalDate date;
    @NotBlank(message = "Field lat can't be empty")
    private double lat;
    @NotBlank(message = "Field lon can't be empty")
    private double lon;
    @NotBlank(message = "Field city can't be empty")
    private String city;
    @NotBlank(message = "Field state can't be empty")
    private String state;
    @Range(min = -50, max = 50)
    private List<Temperature> temperatures;
}
