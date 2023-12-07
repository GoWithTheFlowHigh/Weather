package com.andersen.weather.service;

import com.andersen.weather.entity.Weather;
import com.andersen.weather.repository.WeatherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeatherService {
    private final WeatherRepository repository;

    public Iterable<Weather> getWeatherInCities() {
        return repository.findAll();
    }
}
