package nom.brunokarpo.cachingexample.repository

import nom.brunokarpo.cachingexample.model.Person
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface PersonRepository: JpaRepository<Person, UUID>