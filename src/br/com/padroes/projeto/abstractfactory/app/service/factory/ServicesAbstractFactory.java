package br.com.padroes.projeto.abstractfactory.app.service.factory;

import br.com.padroes.projeto.abstractfactory.app.service.services.CarService;
import br.com.padroes.projeto.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {

	UserService getUserService();
	
	CarService getCarService();
}
