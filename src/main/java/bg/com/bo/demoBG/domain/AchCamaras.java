package bg.com.bo.demoBG.domain;

public class AchCamaras {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column GANADERO.ACH_CAMARAS.CODIGO
	 * @mbg.generated
	 */
	private Integer codigo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column GANADERO.ACH_CAMARAS.DESCRIPCION
	 * @mbg.generated
	 */
	private String descripcion;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column GANADERO.ACH_CAMARAS.TZ_LOCK
	 * @mbg.generated
	 */
	private Integer tz_lock;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column GANADERO.ACH_CAMARAS.CODIGO
	 * @return  the value of GANADERO.ACH_CAMARAS.CODIGO
	 * @mbg.generated
	 */
	public Integer getCodigo() {
		return codigo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column GANADERO.ACH_CAMARAS.CODIGO
	 * @param codigo  the value for GANADERO.ACH_CAMARAS.CODIGO
	 * @mbg.generated
	 */
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column GANADERO.ACH_CAMARAS.DESCRIPCION
	 * @return  the value of GANADERO.ACH_CAMARAS.DESCRIPCION
	 * @mbg.generated
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column GANADERO.ACH_CAMARAS.DESCRIPCION
	 * @param descripcion  the value for GANADERO.ACH_CAMARAS.DESCRIPCION
	 * @mbg.generated
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion == null ? null : descripcion.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column GANADERO.ACH_CAMARAS.TZ_LOCK
	 * @return  the value of GANADERO.ACH_CAMARAS.TZ_LOCK
	 * @mbg.generated
	 */
	public Integer getTz_lock() {
		return tz_lock;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column GANADERO.ACH_CAMARAS.TZ_LOCK
	 * @param tz_lock  the value for GANADERO.ACH_CAMARAS.TZ_LOCK
	 * @mbg.generated
	 */
	public void setTz_lock(Integer tz_lock) {
		this.tz_lock = tz_lock;
	}
}