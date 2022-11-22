package cat.itacademy.barcelonactiva.ramirez.xavi.s04.t01.n02.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String Saluda(@RequestParam(defaultValue = "UNKNOWN") String nom) {

        return "Hola, " + nom + " Estas executant un projecte Gradle";
    }

    @RequestMapping(value = {"/HelloWorld2","/HelloWorld2/{nom}"})
    public String Saluda2(@PathVariable(required = false) String nom) {
        return "Hola, " + nom + " Estas executant un projecte Gradle";

    }
}
