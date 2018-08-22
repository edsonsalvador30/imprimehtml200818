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
				System.out.println(cronapi.list.Operations.getLast((cronapi.database.Operations
						.query(Var.valueOf("app.entity.Prova"), Var.valueOf("select p.materia from Prova p"))))
						.getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

}
