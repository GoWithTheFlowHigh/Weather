CREATE  TABLE if not exists weather (
                                  id                   bigserial  primary key  ,
                                  date_weather         date DEFAULT CURRENT_DATE   ,
                                  lat                  numeric(6,4)  NOT NULL  ,
                                  lon                  numeric(7,4)  NOT NULL  ,
                                  city                 varchar(50)  NOT NULL  ,
                                  state_of_city              varchar(50)  NOT NULL
);
CREATE  TABLE if not exists temperature (
                                      id                   bigserial  primary key  ,
                                      temp_value           double precision  NOT NULL  ,
                                      weather_id           integer
);

ALTER TABLE temperature ADD CONSTRAINT fk_temperature_to_weather FOREIGN KEY ( weather_id ) REFERENCES weather( id ) ON DELETE CASCADE;
