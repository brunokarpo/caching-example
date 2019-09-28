package nom.brunokarpo.cachingexample.model

import java.io.Serializable
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "person")
data class Person(

        @Id
        var id: UUID? = null,
        var name: String,
        var age: Int
) : Serializable