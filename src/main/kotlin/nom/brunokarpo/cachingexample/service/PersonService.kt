package nom.brunokarpo.cachingexample.service

import nom.brunokarpo.cachingexample.model.Person
import nom.brunokarpo.cachingexample.repository.PersonRepository
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

}