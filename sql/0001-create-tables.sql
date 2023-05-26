create table journey (id bigint not null, arrival datetime(6), departure datetime(6), distance_covered_in_meters bigint, arrival_station_id bigint, departure_station_id bigint, primary key (id)) engine=InnoDB;
create table station (id bigint not null, capacity bigint, name varchar(255), x float(53), y float(53), primary key (id)) engine=InnoDB;
alter table journey drop index UK_gyr8s0r7c5bax3yo0q2s406kd;
alter table journey add constraint UK_gyr8s0r7c5bax3yo0q2s406kd unique (arrival_station_id);
alter table journey drop index UK_rv05gepox0e3ul3mdd5othuf9;
alter table journey add constraint UK_rv05gepox0e3ul3mdd5othuf9 unique (departure_station_id);
alter table journey add constraint FKjjpwoe5290pxy38x132ljqt18 foreign key (arrival_station_id) references station (id);
alter table journey add constraint FKgpbf9n2lfi46av66by1fwntu foreign key (departure_station_id) references station (id);