package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// Bloco
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.database.Operations.execute(Var.valueOf("app.entity.Teste"),
						Var.valueOf("update Teste set nome = :nome where id = :id"),
						Var.valueOf("nome", Var.valueOf("Jesus")), Var.valueOf("id", Var.valueOf(4)));
				return Var.VAR_NULL;
			}
		}.call();
	}

}
