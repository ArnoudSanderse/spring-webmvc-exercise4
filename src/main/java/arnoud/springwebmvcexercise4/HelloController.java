package arnoud.springwebmvcexercise4;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author arnoud
 */
@Controller
public class HelloController {
   
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String get(Model model, HttpServletRequest request, HttpServletResponse response) {
        String message = "";
        if(request.getParameter("message") != null){
            message = request.getParameter("message").toString();
        }
        model.addAttribute("Message", message);
        return "hello";
    } 
}