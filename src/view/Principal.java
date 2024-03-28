// git@github.com:01Trixie/SemaforoLista05_Ex1.git
import java.util.concurrent.Semaphore;
import controller.CruzamentoController;

package view;

public class Principal {

	public static void main(String[] args) {
		String sentido[] = {"Norte", "Sul", "Leste", "Oeste"};
		int permissao1 = 1;
		Semaphore semaforo1 = new Semaphore(permissao1);
		for(int idCarro = 0; idCarro < 4; idCarro++) {
			Thread tcruza = new CruzamentoController(idCarro, sentido, semaforo1);
			tcruza.start();
		}

	}

}
