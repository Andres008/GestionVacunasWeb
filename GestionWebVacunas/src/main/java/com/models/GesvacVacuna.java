package com.models;

import java.math.BigDecimal;
import java.util.List;


public class GesvacVacuna {
private long id;

	private BigDecimal cantidad;

	private String estado;

	private String marca;

	private List<GesvacDosi> gesvacDosis;

	public GesvacVacuna() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public List<GesvacDosi> getGesvacDosis() {
		return this.gesvacDosis;
	}

	public void setGesvacDosis(List<GesvacDosi> gesvacDosis) {
		this.gesvacDosis = gesvacDosis;
	}

	public GesvacDosi addGesvacDosi(GesvacDosi gesvacDosi) {
		getGesvacDosis().add(gesvacDosi);
		gesvacDosi.setGesvacVacuna(this);

		return gesvacDosi;
	}

	public GesvacDosi removeGesvacDosi(GesvacDosi gesvacDosi) {
		getGesvacDosis().remove(gesvacDosi);
		gesvacDosi.setGesvacVacuna(null);

		return gesvacDosi;
	}

}