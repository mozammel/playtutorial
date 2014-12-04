package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok("Hello World!!!");
    }
    
    public static Result hello(String name) {
    	return ok("Hello " + name);
    }

}
