package Modelos;

import java.sql.Time;

import sun.util.calendar.BaseCalendar.Date;



public class Permiso {
	String carne;
	Date FechaDePermiso;
	Time HoraIngreso,HoraSalida;
	public Permiso(String carne, Date fechaDePermiso, Time horaIngreso,
			Time horaSalida) {
		super();
		this.carne = carne;
		FechaDePermiso = fechaDePermiso;
		HoraIngreso = horaIngreso;
		HoraSalida = horaSalida;
	}
	public String getCarne() {
		return carne;
	}
	public void setCarne(String carne) {
		this.carne = carne;
	}
	public Date getFechaDePermiso() {
		return FechaDePermiso;
	}
	public void setFechaDePermiso(Date fechaDePermiso) {
		FechaDePermiso = fechaDePermiso;
	}
	public Time getHoraIngreso() {
		return HoraIngreso;
	}
	public void setHoraIngreso(Time horaIngreso) {
		HoraIngreso = horaIngreso;
	}
	public Time getHoraSalida() {
		return HoraSalida;
	}
	public void setHoraSalida(Time horaSalida) {
		HoraSalida = horaSalida;
	}
	
	

}
