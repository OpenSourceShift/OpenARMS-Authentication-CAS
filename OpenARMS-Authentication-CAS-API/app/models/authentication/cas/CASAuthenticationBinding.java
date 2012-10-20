package models.authentication.cas;

import javax.persistence.Entity;

import models.AuthenticationBinding;

import play.data.validation.Required;

@Entity
public class CASAuthenticationBinding extends AuthenticationBinding {

	@Required
	public String service;
	
	@Required
	public String externalIdentifier;
	
}
