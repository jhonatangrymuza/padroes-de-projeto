package br.com.padroes.projeto.abstractfactory.apple.factory.abstractFactory;

import br.com.padroes.projeto.abstractfactory.apple.model.certificate.Certificate;
import br.com.padroes.projeto.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
