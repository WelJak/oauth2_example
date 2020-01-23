package weljak.oauth2poc.webapi;

import com.nimbusds.oauth2.sdk.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/index")
public class HomeController {
    @GetMapping("/{person}")
    public String getIndex(@PathVariable(required = false) Optional<String> person){
        String possiblePerson = person.filter(StringUtils::isNotBlank).orElse("unknown person");
        return String.format("hello %s",possiblePerson);
    }

}
