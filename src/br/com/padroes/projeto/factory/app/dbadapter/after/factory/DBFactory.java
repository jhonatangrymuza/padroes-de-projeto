package br.com.padroes.projeto.factory.app.dbadapter.after.factory;

import br.com.padroes.projeto.factory.app.dbadapter.after.db.DB;

public interface DBFactory {
	DB getDatabase();
}
