package dao;


import java.util.ArrayList;
import java.util.List;

public class EtudiantDAO {
	private List<Etudiant> etudiants = new ArrayList<>();

    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
        return etudiant;
    }

    public List<Etudiant> getAllEtudiants() {
        return etudiants;
    }

    public String getEmail(String email) {
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getEmail().equals(email)) {
                return email;
            }
        }
        return null;
    }

}
