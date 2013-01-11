package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Module2 extends Controller {

    public static Result index() {
        return ok(module2.render("This is module 2."));
    }

}
