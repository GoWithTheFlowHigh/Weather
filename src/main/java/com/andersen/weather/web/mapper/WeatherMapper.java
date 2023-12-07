package com.andersen.weather.web.mapper;

import com.andersen.weather.entity.Weather;
import com.andersen.weather.web.dto.WeatherDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WeatherMapper {
    WeatherDto mapToWeatherDto(Weather weather);

    Weather mapToWeather(WeatherDto dto);

}
