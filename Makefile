PRONY: build

_clean:
	./mvnw clean

build:
	./mvnw clean install


infra:
	docker run --rm --name=caching-example-postgres\
	 -e POSTGRES_DB=caching-example\
	 -e POSTGRES_USER=caching-username\
	 -e POSTGRES_PASSWORD=caching-password\
	 -p 5432:5432\
	 -d postgres:9.6-alpine

	docker run --rm --name=caching-example-redis\
	 -p 6379:6379\
	 -d redis:5.0.6-alpine


infra-stop:
	docker container stop caching-example-postgres caching-example-redis


execute: _clean
	docker-compose up -d --build

stop:
	docker-compose down