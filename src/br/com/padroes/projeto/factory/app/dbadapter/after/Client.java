package br.com.padroes.projeto.factory.app.dbadapter.after;

import br.com.padroes.projeto.factory.app.dbadapter.after.db.DB;
import br.com.padroes.projeto.factory.app.dbadapter.after.factory.OracleFactory;
import br.com.padroes.projeto.factory.app.dbadapter.after.factory.PostgresFactory;

public class Client {

	public static void main(String[] args) {
		DB dbPostgres = new PostgresFactory().getDatabase();
		dbPostgres.query("SELECT * FROM users");
		dbPostgres.update("INSERT INTO users VALUES ('User', 25)");
		System.out.println("\n");
		DB db = new OracleFactory().getDatabase();
		db.query("SELECT * FROM users");
		db.update("INSERT INTO users VALUES ('User', 25)");
	}
}
