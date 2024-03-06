package presentation;

import java.util.List;

import dao.Etudiant;
import dao.EtudiantDAO;
import metier.EtudiantManager;

public class Presentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EtudiantDAO etudiantDAO = new EtudiantDAO();
        EtudiantManager etudiantManager = new EtudiantManager(etudiantDAO);

        // Ajout d'étudiants
        Etudiant etudiant1 = new Etudiant("1", "nom1", "prenom1", "nom1.prenom1@gmail.com");
        Etudiant etudiant2 = new Etudiant("2", "nom2", "prenom2", "nom2.prenom2@gmail.com");
        Etudiant etudiant3 = new Etudiant("3", "nom3", "prenom3", "nom3.prenom3@gmail.com");
        Etudiant etudiant4 = new Etudiant("4", "nom4", "prenom4", "nom4.prenom4@gmail.com");

        etudiantManager.addEtudiant(etudiant1);
        etudiantManager.addEtudiant(etudiant2);
        etudiantManager.addEtudiant(etudiant3);
        etudiantManager.addEtudiant(etudiant4);

        // Tester l'application
        List<Etudiant> etudiants = etudiantManager.getAllEtudiants();
        for (Etudiant e : etudiants) {
            System.out.println("ID: " + e.getId() + ", Nom: " + e.getNom() + ", Prénom: " + e.getPrenom() + ", Email: " + e.getEmail());
        }
    }
	}


