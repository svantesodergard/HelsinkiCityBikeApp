use helsinki_city_bike;
set foreign_key_checks=0;
load data infile '/data/2021-05.csv'
into table journey fields terminated by ','
enclosed by '"'
lines terminated by '\n'
ignore 1 rows
(@Departure,@Return,@DepartureStationId,@DepartureStationName,@ReturnStationId,@ReturnStationName,@CoveredDistance,@Duration)
set arrival=@Return, departure=@Departure, distance_covered_in_meters=@CoveredDistance, arrival_station_id=@ReturnStationId,
    departure_station_id=@DepartureStationId;

set foreign_key_checks=1;