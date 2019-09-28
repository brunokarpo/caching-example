package nom.brunokarpo.cachingexample.resource.dto

import nom.brunokarpo.cachingexample.model.Person
import java.util.*

data class PersonDTO(
        var codigo: UUID? = null,
        var nome: String = "",
        var idade: Int = 0
) {

    constructor(person: Person): this(codigo = person.id, nome = person.name, idade = person.age)

    fun toPerson(): Person = Person(id = codigo, name = nome, age = idade)
}