package Controller;

import model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.UserJPARespository;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController
{
    @Autowired
    private UserJPARespository userJPARespository;

    @RequestMapping(method = RequestMethod.GET,value = "/all")
    public List<Users> findAll()
 {
      return userJPARespository.findAll();
 }
 @GetMapping(value = "/{name}")
    public Users findByName(@PathVariable final String name)
 {
   return  userJPARespository.findByName(name);
 }

 @PostMapping(value = "/load")
    public Users load(@RequestBody final  Users users){
        userJPARespository.save(users);
        return userJPARespository.findByName(users.getName());
 }

}
