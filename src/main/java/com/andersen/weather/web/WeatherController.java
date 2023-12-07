package com.andersen.weather.web;

import com.andersen.weather.entity.Weather;
import com.andersen.weather.service.WeatherService;
import com.andersen.weather.web.dto.WeatherDto;
import com.andersen.weather.web.mapper.WeatherMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/weather")
@RequiredArgsConstructor
public class WeatherController {
    private final WeatherService service;
    private final WeatherMapper mapper;

    @GetMapping
    public List<WeatherDto> getWeatherInCities() {
        Iterable<Weather> weatherInCities = service.getWeatherInCities();
        return StreamSupport.stream(weatherInCities.spliterator(), false).
                map(mapper::mapToWeatherDto).collect(Collectors.toList());
    }
}
