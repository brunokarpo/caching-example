package nom.brunokarpo.cachingexample.service

import nom.brunokarpo.cachingexample.model.Person
import nom.brunokarpo.cachingexample.repository.PersonRepository
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service
import java.util.*

@Service
class PersonService(
        private val repository: PersonRepository
) {

    fun create(person: Person): Person {
        person.id = UUID.randomUUID()
        return repository.save(person)
    }

    @Cacheable(value = "PERSON", key = "#id")
    fun retrieveById(id: UUID): Person {
        Thread.sleep(10000)
        return repository.getOne(id)
    }

}