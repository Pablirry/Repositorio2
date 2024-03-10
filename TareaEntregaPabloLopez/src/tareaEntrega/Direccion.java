package tareaEntrega;

public class Direccion {

	private String calle;
	private String ciudad;
	private int cp;
	private String pais;

	private final int CP_DEFECTO = 0;

	/**
	 * Constructor con el CP por defecto
	 * 
	 * @param calle  : String
	 * @param ciudad : String
	 * @param pais   : String
	 */

	public Direccion(String calle, String ciudad, String pais) {
		super();
		this.calle = calle;
		this.ciudad = ciudad;
		this.cp = CP_DEFECTO;
		this.pais = pais;
	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param calle  : String
	 * @param ciudad : String
	 * @param cp     : entero
	 * @param pais   : String
	 */
	public Direccion(String calle, String ciudad, int cp, String pais) {
		super();
		this.calle = calle;
		this.ciudad = ciudad;
		this.cp = cp;
		this.pais = pais;
	}

	/**
	 * Metodo get del atributo calle
	 * 
	 * @return : String
	 */

	public String getCalle() {
		return calle;
	}

	/**
	 * Metodo set del atributo calle
	 * 
	 * @param calle : String
	 */

	public void setCalle(String calle) {
		this.calle = calle;
	}

	/**
	 * Metodo get del atributo ciudad
	 * 
	 * @return : String
	 */

	public String getCiudad() {
		return ciudad;
	}

	/**
	 * Metodo set del atributo ciudad
	 * 
	 * @param ciudad : String
	 */

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * Metodo get del atributo cp
	 * 
	 * @return: entero
	 */

	public int getCp() {
		return cp;
	}

	/**
	 * Metodo set del atributo cp
	 * 
	 * @param cp : entero
	 */

	public void setCp(int cp) {
		this.cp = cp;
	}

	/**
	 * Metodo get del atributo pais
	 * 
	 * @return: String
	 */

	public String getPais() {
		return pais;
	}

	/**
	 * Metodo set del atributo pais
	 * 
	 * @param pais : String
	 */

	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * Metodo toString de la clase direccion
	 */

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", ciudad=" + ciudad + ", cp=" + cp + ", pais=" + pais + "]";
	}

}
