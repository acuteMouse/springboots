package user.UserController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * 功能：
 * Created by cgl on 2017/5/10 0010.
 */
@Controller
@RequestMapping("")
public class UserController {

    @RequestMapping("/index")
    public String hello(Map map) {

        map.put("name","jimy");
        return "index";
    }

    @RequestMapping("/hi")
    public String hi() {
        return "hi";
    }

    @RequestMapping("/ok")
    public String ok() {
        return "ok";
    }
}
