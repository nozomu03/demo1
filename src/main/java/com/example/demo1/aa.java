package com.example.demo1;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class aa {
    @GetMapping(value = "/greet1")
    public String aa(@RequestParam String say, @RequestParam String to) {
        return to + ", " + say;
    }

    @PostMapping(value = {"/greet1/{say}/{to}", "/greet1/{say}"})
    public String Greething(
            @PathVariable Optional<String> say,
            @PathVariable Optional<String> to
    ){
        String temp0 = say.isPresent() ? say.get() : "Unkown";
        String temp = to.isPresent() ? to.get() : "Unkown";
        return temp0 + " " + temp;
    }
}
