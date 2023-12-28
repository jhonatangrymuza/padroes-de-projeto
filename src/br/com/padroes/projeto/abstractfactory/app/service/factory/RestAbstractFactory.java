package br.com.padroes.projeto.abstractfactory.app.service.factory;

import br.com.padroes.projeto.abstractfactory.app.service.services.CarRestApiService;
import br.com.padroes.projeto.abstractfactory.app.service.services.CarService;
import br.com.padroes.projeto.abstractfactory.app.service.services.UserRestApiService;
import br.com.padroes.projeto.abstractfactory.app.service.services.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserRestApiService();
	}

	@Override
	public CarService getCarService() {
		return new CarRestApiService();
	}

}
