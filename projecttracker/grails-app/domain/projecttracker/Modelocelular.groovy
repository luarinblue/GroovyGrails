package projecttracker

class Modelocelular {

	String nombre
	
    static constraints = {
		nombre(size:1..25)
    }
}
