``` bash
E:\java-projects\java-plus-volume

docker run -d --name java-plus \
-p 3306:3306 \
-v //e/java-projects/java-plus-volume/mysql-conf:/etc/mysql/conf.d \
-v //e/java-projects/java-plus-volume/mysql-data:/var/lib/mysql \
-e MYSQL_ROOT_PASSWORD=zxcv1234 \
mysql:5.7

docker run -d --name java-plus \
-p 3306:3306 \
-v /mysql-volume/mysql-conf:/etc/mysql/conf.d \
-v /mysql-volume/mysql-data:/var/lib/mysql \
-e MYSQL_ROOT_PASSWORD=zxcv1234 \
mysql:5.7

docker run -d --name java-plus2 \
-p 3344:3306 \
-v //E/java-projects/java-plus-volume/mysql-conf:/etc/mysql/conf.d \
-v //E/java-projects/java-plus-volume/mysql-data:/var/lib/mysql \
-e MYSQL_ROOT_PASSWORD=zxcv1234 \
mysql:5.7

docker run -d --name java-plus \
-p 3306:3306 \
my-mysql:0.1
```