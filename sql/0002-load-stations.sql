use helsinki_city_bike;
load data infile '/data/stations.csv'
into table station fields terminated by ','
enclosed by '"'
lines terminated by '\n'
ignore 1 rows
(@FID,@ID,@Nimi,@Namn,@Name,@Osoite,@Adress,@Kaupunki,@Stad,@Operaattor,@Kapasiteet,@x,@y)
set id=@ID, name=@Nimi, capacity=@Kapasiteet, x=@x, y=@y;