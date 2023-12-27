package br.com.padroes.projeto.factory.apple.halfSimple.factory;

import br.com.padroes.projeto.factory.apple.halfSimple.model.IPhone;
import br.com.padroes.projeto.factory.apple.halfSimple.model.IPhoneX;
import br.com.padroes.projeto.factory.apple.halfSimple.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX();
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax();
		} else return null;
	}

}
