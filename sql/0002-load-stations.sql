use helsinki_city_bike;
load data infile './stations.csv'
into table station fields terminated by ','
lines terminated by '\n'
ignore 1 rows
(@FID,@ID,@Nimi,@Namn,@Name,@Osoite,@Adress,@Kaupunki,@Stad,@Operaattor,@Kapasiteet,@x,@y)
set id=@ID, capacity=@Kapasiteet, name=@Nimi, x=@x, y=@y;