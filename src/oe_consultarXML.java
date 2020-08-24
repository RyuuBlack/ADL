

public class oe_consultarXML {

	String respuesta;
	String version;
	String fechaConsulta;

	String nombres;
	String primerApellido;
	String segundoApellido;
	String genero;

	String estadoNaturalNacional;
	String fechaExpedicion;
	String ciudad;
	String departamento;
	String numero;

	String min;
	String max;

	String llaveNaturalNacional;

	String estadoCuentaCartera;
	String periodicidad;
	String entidad;
	String ultimaActualizacion;
	String numeroObligacion;
	String fechaApertura;
	String fechaVencimiento;
	String bloqueada;
	String tipoObligacion;
	String tipoCuenta;
	String garante;
	String comportamiento;
	String formaPago;
	String codSuscriptor;

	String valorInicial;
	String saldoActual;
	String saldoMora;
	String cuota;
	String cuotasCanceladas;
	String totalCuotas;

	String codigo;
	String fecha;

	String llaveCuentaCartera;


	public oe_consultarXML(String respuesta,
			               String version,
			               String fechaConsulta,
			               String nombres,
			               String primerApellido,
			               String segundoApellido,
			               String genero,
			               String estadoNaturalNacional,
			               String fechaExpedicion,
			               String ciudad,
			               String departamento,
			               String numero,
			               String min,
			               String max,
			               String llaveNaturalNacional,
			               String estadoCuentaCartera,
			               String periodicidad,
			               String entidad,
			               String ultimaActualizacion,
			               String numeroObligacion,
			               String fechaApertura,
			               String fechaVencimiento,
			               String bloqueada,
			               String tipoObligacion,
			               String tipoCuenta,
			               String garante,
			               String comportamiento,
			               String formaPago,
			               String codSuscriptor,
			               String valorInicial,
			               String saldoActual,
			               String saldoMora,
			               String cuota,
			               String cuotasCanceladas,
			               String totalCuotas,
			               String codigo,
			               String fecha,
			               String llaveCuentaCartera) {

		this.respuesta = respuesta;
		this.version = version;
		this.fechaConsulta = fechaConsulta;
		this.nombres = nombres;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.genero = genero;
		this.estadoNaturalNacional = estadoNaturalNacional;
		this.fechaExpedicion = fechaExpedicion;
		this.ciudad = ciudad;
		this.departamento = departamento;
		this.numero = numero;
		this.min = min;
		this.max = max;
		this.llaveNaturalNacional = llaveNaturalNacional;
		this.estadoCuentaCartera = estadoCuentaCartera;
		this.periodicidad = periodicidad;
		this.entidad = entidad;
		this.ultimaActualizacion = ultimaActualizacion;
		this.numeroObligacion = numeroObligacion;
		this.fechaApertura = fechaApertura;
		this.fechaVencimiento = fechaVencimiento;
		this.bloqueada = bloqueada;
		this.tipoObligacion = tipoObligacion;
		this.tipoCuenta = tipoCuenta;
		this.garante = garante;
		this.comportamiento = comportamiento;
		this.formaPago = formaPago;
		this.codSuscriptor = codSuscriptor;
		this.valorInicial = valorInicial;
		this.saldoActual = saldoActual;
		this.saldoMora = saldoMora;
		this.cuota = cuota;
		this.cuotasCanceladas = cuotasCanceladas;
		this.totalCuotas = totalCuotas;
		this.codigo = codigo;
		this.fecha = fecha;
		this.llaveCuentaCartera = llaveCuentaCartera;
	}


	public String getLlaveCuentaCartera() {
		return llaveCuentaCartera;
	}


	public void setLlaveCuentaCartera(String llaveCuentaCartera) {
		this.llaveCuentaCartera = llaveCuentaCartera;
	}


	public String getRespuesta() {
		return respuesta;
	}


	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}


	public String getVersion() {
		return version;
	}


	public void setVersion(String version) {
		this.version = version;
	}


	public String getFechaConsulta() {
		return fechaConsulta;
	}


	public void setFechaConsulta(String fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getPrimerApellido() {
		return primerApellido;
	}


	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}


	public String getSegundoApellido() {
		return segundoApellido;
	}


	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getEstadoNaturalNacional() {
		return estadoNaturalNacional;
	}


	public void setEstadoNaturalNacional(String estadoNaturalNacional) {
		this.estadoNaturalNacional = estadoNaturalNacional;
	}


	public String getFechaExpedicion() {
		return fechaExpedicion;
	}


	public void setFechaExpedicion(String fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getMin() {
		return min;
	}


	public void setMin(String min) {
		this.min = min;
	}


	public String getMax() {
		return max;
	}


	public void setMax(String max) {
		this.max = max;
	}


	public String getLlaveNaturalNacional() {
		return llaveNaturalNacional;
	}


	public void setLlaveNaturalNacional(String llaveNaturalNacional) {
		this.llaveNaturalNacional = llaveNaturalNacional;
	}


	public String getEstadoCuentaCartera() {
		return estadoCuentaCartera;
	}


	public void setEstadoCuentaCartera(String estadoCuentaCartera) {
		this.estadoCuentaCartera = estadoCuentaCartera;
	}


	public String getPeriodicidad() {
		return periodicidad;
	}


	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}


	public String getEntidad() {
		return entidad;
	}


	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}


	public String getUltimaActualizacion() {
		return ultimaActualizacion;
	}


	public void setUltimaActualizacion(String ultimaActualizacion) {
		this.ultimaActualizacion = ultimaActualizacion;
	}


	public String getNumeroObligacion() {
		return numeroObligacion;
	}


	public void setNumeroObligacion(String numeroObligacion) {
		this.numeroObligacion = numeroObligacion;
	}


	public String getFechaApertura() {
		return fechaApertura;
	}


	public void setFechaApertura(String fechaApertura) {
		this.fechaApertura = fechaApertura;
	}


	public String getFechaVencimiento() {
		return fechaVencimiento;
	}


	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}


	public String getBloqueada() {
		return bloqueada;
	}


	public void setBloqueada(String bloqueada) {
		this.bloqueada = bloqueada;
	}


	public String getTipoObligacion() {
		return tipoObligacion;
	}


	public void setTipoObligacion(String tipoObligacion) {
		this.tipoObligacion = tipoObligacion;
	}


	public String getTipoCuenta() {
		return tipoCuenta;
	}


	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}


	public String getGarante() {
		return garante;
	}


	public void setGarante(String garante) {
		this.garante = garante;
	}


	public String getComportamiento() {
		return comportamiento;
	}


	public void setComportamiento(String comportamiento) {
		this.comportamiento = comportamiento;
	}


	public String getFormaPago() {
		return formaPago;
	}


	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}


	public String getCodSuscriptor() {
		return codSuscriptor;
	}


	public void setCodSuscriptor(String codSuscriptor) {
		this.codSuscriptor = codSuscriptor;
	}


	public String getValorInicial() {
		return valorInicial;
	}


	public void setValorInicial(String valorInicial) {
		this.valorInicial = valorInicial;
	}


	public String getSaldoActual() {
		return saldoActual;
	}


	public void setSaldoActual(String saldoActual) {
		this.saldoActual = saldoActual;
	}


	public String getSaldoMora() {
		return saldoMora;
	}


	public void setSaldoMora(String saldoMora) {
		this.saldoMora = saldoMora;
	}


	public String getCuota() {
		return cuota;
	}


	public void setCuota(String cuota) {
		this.cuota = cuota;
	}


	public String getCuotasCanceladas() {
		return cuotasCanceladas;
	}


	public void setCuotasCanceladas(String cuotasCanceladas) {
		this.cuotasCanceladas = cuotasCanceladas;
	}


	public String getTotalCuotas() {
		return totalCuotas;
	}


	public void setTotalCuotas(String totalCuotas) {
		this.totalCuotas = totalCuotas;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}











}
