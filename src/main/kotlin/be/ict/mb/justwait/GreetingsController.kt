package be.ict.mb.justwait

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import java.util.concurrent.TimeUnit
import kotlin.random.Random

@RestController
@RequestMapping("/greetings")
class GreetingsController {

    @GetMapping("/hello")
    fun hello(): Mono<String> {
        Random.nextLong(100, 500).let(TimeUnit.MILLISECONDS::sleep)
        return Mono.just("Hello!")
    }
}