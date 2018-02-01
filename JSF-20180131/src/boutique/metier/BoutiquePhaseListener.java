package boutique.metier;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class BoutiquePhaseListener implements PhaseListener {

	@Override
	public void afterPhase(PhaseEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Sortie de la phase : "+event.getPhaseId());
	}

	@Override
	public void beforePhase(PhaseEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Entrée dans la phase : "+event.getPhaseId());

	}

	@Override
	public PhaseId getPhaseId() {
		// TODO Auto-generated method stub
		//On renvoi la reference de la/les phase(s) à laquelle ce listener est sensible
		return PhaseId.ANY_PHASE;
		//return null;
	}

}
