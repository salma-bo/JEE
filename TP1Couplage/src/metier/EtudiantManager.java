package metier;

import java.util.List;

import dao.Etudiant;
import dao.EtudiantDAO;

public class EtudiantManager {
	private EtudiantDAO etudiantDAO;

    public EtudiantManager(EtudiantDAO etudiantDAO) {
        this.etudiantDAO = etudiantDAO;
    }

    public Etudiant addEtudiant(Etudiant etudiant) {
        String existingEmail = etudiantDAO.getEmail(etudiant.getEmail());
        if (existingEmail != null) {
            throw new IllegalArgumentException("Email déjà utilisé !");
        }
        return etudiantDAO.addEtudiant(etudiant);
    }

    public List<Etudiant> getAllEtudiants() {
        return etudiantDAO.getAllEtudiants();
    }

}
