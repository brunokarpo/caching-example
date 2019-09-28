PRONY: build

build:
	./mvnw clean install


infra:
	docker run --rm --name=caching-example-postgres\
	 -e POSTGRES_DB=caching-example\
	 -e POSTGRES_USER=caching-username\
	 -e POSTGRES_PASSWORD=caching-password\
	 -p 5432:5432\
	 -d postgres:9.6-alpine