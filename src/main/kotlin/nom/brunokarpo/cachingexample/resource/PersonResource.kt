package nom.brunokarpo.cachingexample.resource

import nom.brunokarpo.cachingexample.resource.dto.PersonDTO
import nom.brunokarpo.cachingexample.service.PersonService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI
import java.util.*

@RestController
@RequestMapping("/person")
class PersonResource(
        private val service: PersonService
) {

    @PostMapping
    fun create(@RequestBody dto: PersonDTO): ResponseEntity<PersonDTO> {
        val person = service.create(dto.toPerson())

        return ResponseEntity.created(URI("/person/${person.id}")).body(PersonDTO(person))
    }

    @GetMapping
    fun retrieveByCodigo(@RequestParam("codigo") codigo: UUID): ResponseEntity<PersonDTO> {
        val person = service.retrieveById(codigo)

        return ResponseEntity.ok(PersonDTO(person))
    }

}