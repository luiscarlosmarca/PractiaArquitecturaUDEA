package co.edu.udea.microservicioudearegistration.api;

import co.edu.udea.microservicioudearegistration.dto.Contact;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class ContactApi {

   @GetMapping(value = "/contact")
   public Contact miContacto()
   {
       return new Contact(10L, "Robin", "CGarcia", "+57 310 891 71 02", "robin.coronado@gmail");
   }
}
