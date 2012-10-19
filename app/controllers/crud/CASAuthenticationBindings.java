package controllers.crud;

import controllers.CRUD;
import controllers.Secure;
import play.*;
import play.mvc.*;

/**
 * Controller which takes care of simple authentication passwords.
 * @author OpenARMS Service team
 */
@With(Secure.class)
@CRUD.For(models.authentication.cas.CASAuthenticationBinding.class)
public class CASAuthenticationBindings extends CRUD {

}
