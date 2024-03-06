package dao;

public class Etudiant {

	    private String id;
	    private String nom;
	    private String prenom;
	    private String email;

	    public String getId() {
	        return id;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public String getPrenom() {
	        return prenom;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    public void setPrenom(String prenom) {
	        this.prenom = prenom;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getEmail() {
	        return email;
	    }

		public Etudiant(String id,String nom,String prenom, String email) {
			this.id=id;
			this.nom=nom;
			this.prenom=prenom;
			this.email=email;
			// TODO Auto-generated constructor stub
		}
	}


