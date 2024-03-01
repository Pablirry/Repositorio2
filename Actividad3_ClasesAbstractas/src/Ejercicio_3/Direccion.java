package Ejercicio_3;

public class Direccion {

	protected String calle;
	protected String ciudad;
	protected String CP;
	protected String pais;

	/**
	 * @param calle
	 * @param ciudad
	 * @param string
	 * @param pais
	 */
	public Direccion(String calle, String ciudad, String string, String pais) {
		super();
		this.calle = calle;
		this.ciudad = ciudad;
		CP = string;
		this.pais = pais;
	}

	/**
	 * Constructor Predeterminado
	 */
	public Direccion() {
		super();
	}

	/**
	 * @return : String
	 */
	public String getCalle() {
		return calle;
	}

	/**
	 * @param calle : String
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}

	/**
	 * @return : String
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad : String
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * @return : String
	 */
	public String getCP() {
		return CP;
	}

	/**
	 * @param cP : String
	 */
	public void setCP(String cP) {
		CP = cP;
	}

	/**
	 * @return : String
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais : String
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "[calle=" + calle + ", ciudad=" + ciudad + ", CP=" + CP + ", pais=" + pais + "]";
	}

}
