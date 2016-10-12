package com.abccompany.carrentalsystem.loggger;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RentalLogger {
	private static Logger logger;
	
	public static Logger getLoger(){
		if(logger == null){
			try {
				logger.addHandler(new FileHandler("..\\resources\\logs\\logs.log"));
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return logger;
	}
	public static void main(String[] args) {
		System.out.println(getLoger().getName());
		logger.log(Level.SEVERE, "Unable to handle request");
	}
}
