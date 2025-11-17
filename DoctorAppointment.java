package com.codegnan.Overriding;

import java.util.Scanner;

public class DoctorAppointment extends Appointment{

	@Override
	public void schedule() {
		super.schedule();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Specialization: ");
		String specialization = sc.nextLine();
		
		System.out.println("Doctor appointment scheduled for "+specialization);
	}
}
