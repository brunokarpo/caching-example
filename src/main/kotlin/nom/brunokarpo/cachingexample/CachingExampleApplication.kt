package nom.brunokarpo.cachingexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CachingExampleApplication

fun main(args: Array<String>) {
    runApplication<CachingExampleApplication>(*args)
}
