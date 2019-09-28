package nom.brunokarpo.cachingexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class CachingExampleApplication

fun main(args: Array<String>) {
    runApplication<CachingExampleApplication>(*args)
}
