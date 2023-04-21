package br.com.erudio;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    // definir template
    private static final String template = "Hello, %s!";
    // mockando um id, a cada chamada ele soma o id
    private final AtomicLong counter = new AtomicLong();

    // metodo responsavel por devolver endpoint Greeting
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
