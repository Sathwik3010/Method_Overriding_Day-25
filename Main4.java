package com.codegnan.Overriding;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Appointment a;
		a = new DoctorAppointment();
		a.schedule();
		
		a = new DentistAppointment();
		a.schedule();
		
	}

}
