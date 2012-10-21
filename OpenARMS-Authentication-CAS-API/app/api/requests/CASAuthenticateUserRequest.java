package api.requests;

import java.net.URL;
import play.Logger;

/**
 * A request for the service: Authenticate against an authentication backend.
 */
public class CASAuthenticateUserRequest extends AuthenticateUserRequest {
	public final static String BACKEND = "controllers.authentication.cas.CASAuthenticationBackend";
	public URL service;
	public String ticket;
	public CASAuthenticateUserRequest(String ticket) {
		super(BACKEND);
		this.ticket = ticket;
	}

}	