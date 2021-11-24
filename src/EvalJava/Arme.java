package EvalJava;

public class Arme {

	//attributs
	private String nom;
	private int puissance;
	
	EType typeArme;

	public Arme(String nom, int puissance, EType typeArme) {
		super();
		this.nom = nom;
		this.puissance = puissance;
		this.typeArme = typeArme;
	}
	
	//fonctions
	public void armeUsed() {
		switch (typeArme) {
			case EPEE:
	            System.out.println("Je COUPE la conversation.");
	            break;
	                
	        case COUTEAU:
	            System.out.println("Je TRANCHE dans le vif du sujet.");
	            break;
	                     
	        case MASSE:
	            System.out.println("Je suis a la raMASSE.");
	            break;
	            
	        case PISTOLET:
	        	System.out.println("Je TIR comme un lapin.");
	        	break;
	                    
	        case ARC:
	            System.out.println("Je TRANSPERCE les ames sensibles.");
	            break;
	            
	        case MAIN:
	        	System.out.println("J'ai pas d'arme, je me bat a la MAIN.");
	        	break;
	            
	        default:
	            System.out.println("J'ai pas d'arme.");
	            break;
		}
	}
	
	//getter
	public EType getTypeArme() {
		return typeArme;
	}

	public int getPuissance() {
		return puissance;
	}

	//toString
	@Override
	public String toString() {
		return "un(e) " + nom + ", de puissance " + puissance + ", c'est une arme de type " + typeArme ;
	}
	
	
}
