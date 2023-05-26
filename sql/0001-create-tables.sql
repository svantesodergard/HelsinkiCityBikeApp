create database if not exists helsinki_city_bike;
use helsinki_city_bike;

create table journey (id bigint auto_increment primary key not null, arrival datetime(6), departure datetime(6), distance_covered_in_meters bigint, arrival_station_id bigint, departure_station_id bigint);
create table station (id bigint not null, capacity bigint, name varchar(255), x float(53), y float(53), primary key (id)) engine=InnoDB;
alter table journey add constraint FKjjpwoe5290pxy38x132ljqt18 foreign key (arrival_station_id) references station (id);
alter table journey add constraint FKgpbf9n2lfi46av66by1fwntu foreign key (departure_station_id) references station (id);