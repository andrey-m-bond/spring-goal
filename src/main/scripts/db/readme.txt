1. to install MariaDB container:

	docker run --name mariadb -p 33067:3306 -v /var/lib/mysql:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=root_pass -d yobasystems/alpine-mariadb


2. to run sql scripts:
	docker exec -i mariadb sh -c "mysql --host=localhost --user=root --password=root_pass" < C:\WORK\spring-goal\src\main\db\scripts\01-create-users.sql
	docker exec -i mariadb sh -c "mysql --host=localhost --user=root --password=root_pass" < C:\WORK\spring-goal\src\main\db\scripts\02-db-setup.sql