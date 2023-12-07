package com.andersen.weather.entity;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "date_weather")
    private LocalDate date;
    private double lat;
    private double lon;
    private String city;
    @Column(name = "state_of_city")
    private String state;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "weather_id")
    private List<Temperature> temperatures;
}
