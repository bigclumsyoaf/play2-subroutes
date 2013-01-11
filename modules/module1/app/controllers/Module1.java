package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Module1 extends Controller {

    public static Result index() {
        return ok(module1.render("This is module 1."));
    }

}
