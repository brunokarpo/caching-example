package nom.brunokarpo.cachingexample.resource

import nom.brunokarpo.cachingexample.resource.dto.PersonDTO
import nom.brunokarpo.cachingexample.service.PersonService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.URI

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

}