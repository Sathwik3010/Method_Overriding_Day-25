package com.codegnan.Overriding;

import java.util.Scanner;

public class DentistAppointment extends Appointment{
	
	@Override
	public void schedule() {
		super.schedule();
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Dental procedure: ");
        String procedure = sc.nextLine();
        
        System.out.println("Dentist appointment scheduled for "+procedure);
	}
}