package specs;

import java.util.Scanner;
/*
 * This is my work. DO NOT REUSE!!!
 * (c) 2016-2017 XCore64, 64BitWorldFTW
 */
/**
 * @author XCore64
 * @version 0.7.1a
 * @category specifications
 */
public class SpecSelection {
	static Scanner in = new Scanner(System.in);
	//Static is part of a class.
	//Instances can have a different values
	
	public static void main(String[] args) {
		// Certain Japanese models are not included in this application.
		while (true) {
		String menu = "Lexus Model Specification Selector \n" +
					  "\n" +
					  "Select your vehicle type: \n" +
					  "1. Convertible \n" +
					  "2. Coupe \n" +
					  "3. Hatchback \n" +
					  "4. Sedan \n" +
					  "5. SUV \n" +
					  "6. Wagon \n" +
					  "7. Exit application \n" +
					  "Enter choice: ";
		System.out.print(menu);
		final int selection = in.nextInt();
		if (selection == 1) {
			final int choice = 0;
			convertibleSelection(choice);
		}
		if (selection == 2) {
			int coupeChoice = 0;
			coupeSelection(coupeChoice);
		}
		if (selection == 3) {
			int hatchbackChoice = 0;
			hatchbackSelection(hatchbackChoice);
		}
		if (selection == 4) {
			int sedanChoice = 0;
			sedanSelection(sedanChoice);
		}
		if (selection == 5) {
			int SUVChoice = 0;
			SUVSelection(SUVChoice);
		}
		if (selection == 6) {
			int wagonChoice = 0;
			wagonSelection(wagonChoice);
		}
		if (selection == 7) {
			System.out.println();
			System.out.println("Exiting...");
			System.exit(6);
			}
		}
	}
	public static void convertibleSelection (int selection) {
		String menu = "Select a convertible model \n" +
					  "1. IS 250 C \n" +
					  "2. IS 350 C \n" +
					  "3. SC 430 \n" +
					  "Enter choice: ";
		System.out.println();
		System.out.print(menu);
		selection = in.nextInt();
		switch (selection) {
		case 1: int modelYear = 0;
				LexusIS250C(modelYear);
				break;
		case 2: modelYear = 0;
				LexusIS350C(modelYear);
				break;
		case 3: modelYear = 0;
				LexusSC430(modelYear);
				break;
		}
	}
	public static void coupeSelection (int selection) {
		String menu = "Select a coupe model code \n" +
					  "1. LC \n" +
					  "2. LFA \n" +
					  "3. RC \n" +
					  "4. SC \n" +
					  "Enter choice: ";
		System.out.println();
		System.out.print(menu);
		selection = in.nextInt();
		switch (selection) {
		case 1: LexusLC(selection);
				break;
		case 2: LexusLFA(selection);
				break;
		case 3: LexusRC(selection);
				break;
		case 4: LexusSC(selection);
				break;
		}
	}
	public static void hatchbackSelection (int selection) {
		String menu = "Select a hatchback model code: \n" +
					  "1. CT \n" +
					  "Enter choice: ";
		System.out.println();
		System.out.print(menu);
		selection = in.nextInt();
		if (selection == 1) {
			int modelnumberinput = 0;
			LexusCT(modelnumberinput);
		}
	} 
	public static void sedanSelection (int selection) {
		String menu = "Select a sedan model code: \n" +
					  "1. ES \n" +
					  "2. GS \n" +
					  "3. HS \n" +
					  "4. IS \n" +
					  "5. LS \n" +
					  "Enter choice: ";
		System.out.println();
		System.out.print(menu);
		selection = in.nextInt();
		switch (selection) {
		case 1: int modelnumberinput = 0;
				LexusES(modelnumberinput);
				break;
		case 2: modelnumberinput = 0;
				LexusGS(modelnumberinput);
				break;
		case 3: modelnumberinput = 0;
				LexusHS(modelnumberinput);
				break;
		case 4: modelnumberinput = 0;
				LexusIS(modelnumberinput);
				break;
		case 5: modelnumberinput = 0;
				LexusLS(modelnumberinput);
				break;
		}
	}
	public static void SUVSelection (int selection) {
		String menu = "Select a SUV model code: \n" +
					  "1. GX \n" +
					  "2. LX \n" +
					  "3. NX \n" +
					  "4. RX \n" +
					  "Enter choice: ";
		System.out.println();
		System.out.print(menu);
		selection = in.nextInt();
		switch (selection) {
		case 1: 
				break;
		case 2: 
				break;
		case 3: 
				break;
		case 4:	int modelNumberInput = 0;
				LexusRX(modelNumberInput);
				break;
		}
	}
	public static void wagonSelection (int selection) {
		String menu = "Select a wagon model: \n" +
					  "1. IS 300 SportCross \n" +
					  "Enter choice: ";
		System.out.println();
		System.out.print(menu);
		selection = in.nextInt();
		switch (selection) {
		case 1:	int modelYear = 0;
				LexusIS300Wagon(modelYear);
				break;
		}
	}
	public static void LexusCT (int modelNumber) {
		String menu = "Select a CT model number: \n" +
					  "1. CT 200h \n" +
					  "Enter choice: ";
		System.out.println();
		System.out.print(menu);
		modelNumber = in.nextInt();
		if (modelNumber == 1) {
			int modelYearSelection = 0;
			LexusCT200h(modelYearSelection);
		}
	}
	public static void LexusES (int modelNumber) {
		String menu = "Select an ES model number: \n" +
				  	  "1. ES 250 \n" +
				  	  "2. ES 300 \n" +
				  	  "3. ES 300h \n" +
				  	  "4. ES 330 \n" +
				  	  "5. ES 350 \n" +
				  	  "Enter choice: ";
		System.out.println();
		System.out.print(menu);
		modelNumber = in.nextInt();
	}
	public static void LexusHS (int modelNumber) {
		String menu = "Select a HS model number: \n" +
			  	  	  "1. HS 250h \n" +
			  	  	  "Enter choice: ";
		System.out.println();
		System.out.print(menu);
		modelNumber = in.nextInt();
	}
	public static void LexusIS (int modelNumber) {
		
		String menu = "Select an IS model number: \n" +
					  "1. IS 200t \n" +
					  "2. IS 250 \n" +
					  "3. IS 250 C \n" +
					  "4. IS 300 \n" +
					  "5. IS 350 \n" +
					  "6. IS 350 C \n" +
					  "7. IS F \n" +
					  "Enter choice: ";
		System.out.println();
		System.out.print(menu);
		modelNumber = in.nextInt();
		switch (modelNumber) {
		case 1: int modelYear = 0;
				LexusIS200t(modelYear);
				break;
		case 2: modelYear = 0;
				LexusIS250(modelYear);
				break;
		case 3: modelYear = 0;
				LexusIS250C(modelYear);
				break;
		case 4: modelYear = 0;
				LexusIS300Sedan(modelYear);
				break;
		case 5: modelYear = 0;
				LexusIS350(modelYear);
				break;
		case 6: modelYear = 0;
				LexusIS350C(modelYear);
				break;
		case 7:
				break;
		}
	}
	public static void LexusLC (int modelNumber) {
		String menu = "Select a LC model number: \n" +
					  "1. LC 500 \n" +
					  "2. LC 500h \n" +
					  "Enter choice: ";
		System.out.println();
		System.out.print(menu);
		modelNumber = in.nextInt();
		switch (modelNumber) {
		case 1: String model = "Lexus LC 500";
				int modelYear = 2018;
				boolean futureModel = true;
				String buildGen = "";
				String buildSeries = "950A";
				String engine = "2UR-GSE";
				String engineType = "Gas";
				double displacement = 5.0;
				int hp = 471;
				int rpm = 7100;
				int torque = 398;
				int torqueRPM = 4800;
				String cylinders = "V8";
				int valves = 32;
				String cam = "DOHC";
				String platform = "TNGA: GA-L";
				String drivetrain = "RWD"; 
				String layout = "FR";
				String transmission = "10 Speed Auto";
				String transModel = "";
				double gallons = 0.0;
				String fuelType = "Premium Unleaded";
				int fuelCity = 0;
				int fuelHwy = 0;
				SpecsTemplate(model, futureModel, modelYear, buildGen, buildSeries, engine, engineType, displacement, hp, rpm, torque, torqueRPM, cylinders, valves, cam, platform, layout, drivetrain, transmission, transModel,
						gallons, fuelType, fuelCity, fuelHwy);
				break;
		case 2:	model = "Lexus LC 500h";
				futureModel = true;
				modelYear = 2018;
				buildGen = "";
				buildSeries = "950A";
				engine = "8GR-FXS";
				engineType = "Multi-Stage Hybrid (gas + electric)";
				displacement = 3.5;
				hp = 295;
				rpm = 6600;
				torque = 295;
				torqueRPM = 5100;
				cylinders = "V6";
				valves = 0;
				cam = "DOHC";
				platform = "TNGA: GA-L";
				layout = "FR";
				drivetrain = "RWD"; 
				transmission = "10 Speed Auto";
				transModel = "";
				gallons = 0.0;
				fuelType = "";
				fuelCity = 0;
				fuelHwy = 0;
				SpecsTemplate(model, futureModel, modelYear, buildGen, buildSeries, engine, engineType, displacement, hp, rpm, torque, torqueRPM, cylinders, valves, cam, platform, layout, drivetrain, transmission, transModel,
						gallons, fuelType, fuelCity, fuelHwy);
				break;
		}
	}
	public static void LexusLS (int modelNumber) {
		String menu = "Select a LS model number: \n" +
				  	  "1. LS 400 \n" +
				  	  "2. LS 430 \n" +
				  	  "3. LS 460/460 L \n" +
					  "4. LS 500 \n" +
				  	  "5. LS 600h/600h L \n" +
				  	  "Enter choice: ";
		System.out.println();
		System.out.print(menu);
		modelNumber = in.nextInt();
		switch (modelNumber) {
			case 1: 
					break;
			case 2:
					break;
			case 3:
					break;
			case 4:
					break;
			case 5:
					break;
		}
	}
	public static void LexusLFA (int modelNumber) {
		String model = "Lexus LFA";
		boolean futureModel = false;
		int modelYearDate = 2012;
		String buildGen = "";
		String buildSeries = "";
		String engine = "1LR-GUE";
		String engineType = "Gas (even firing)";
		double displacement = 4.8;
		int hp = 552;
		int rpm = 8700;
		int torque = 354;
		int torqueRPM = 6800;
		String cylinders = "V10";
		int valves = 40;
		String cam = "DOHC";
		String platform = "";
		String layout = "FMR";
		String drivetrain = "RWD"; 
		String transmission = "6 Speed Automative Manual";
		String transModel = "";
		double gallons = 19.8;
		String fuelType = "Premium Unleaded";
		int fuelCity = 11;
		int fuelHwy = 16;
		SpecsTemplate(model, futureModel, modelYearDate, buildGen, buildSeries, engine, engineType, displacement, hp, rpm, torque, torqueRPM, cylinders, valves, cam, platform, layout, drivetrain, transmission, transModel,
					gallons, fuelType, fuelCity, fuelHwy);
	}
	public static void LexusGS (int modelNumber) {
		String menu = "Select a GS model number: \n" +
					  "1. GS 200t \n" +
					  "2. GS 300 \n" +
					  "3. GS 350 \n" +
					  "4. GS 400 \n" +
					  "5. GS 430 \n" +
					  "6. GS 450h \n" +
					  "7. GS 460 \n" +
					  "8. GS F \n" +
					  "Enter choice: ";
		System.out.println();
		System.out.print(menu);
		modelNumber = in.nextInt();
		boolean futureModel;
		switch (modelNumber) {
		case 1: String model = "Lexus GS 200t";
				futureModel = false;
				int modelYear = 2016;
				String buildGen = "L10";
				String buildSeries = "";
				String engine = "8AR-FTS";
				String engineType = "Gas";
				double displacement = 2.0;
				int hp = 241;
				int rpm = 5800;
				int torque = 258;
				int torqueRPM = 1650;
				String cylinders = "I4";
				int valves = 16;
				String cam = "DOHC";
				String platform = "Toyota New N";
				String layout = "FR";
				String drivetrain = "RWD"; 
				String transmission = "8 Speed Auto";
				String transModel = "";
				double gallons = 11.9;
				String fuelType = "Regular Unleaded";
				int fuelCity = 43;
				int fuelHwy = 40;
				SpecsTemplate(model, futureModel, modelYear, buildGen, buildSeries, engine, engineType, displacement, hp, rpm, torque, torqueRPM, cylinders, valves, cam, platform, layout, drivetrain, transmission, transModel,
						gallons, fuelType, fuelCity, fuelHwy);
				break;
		case 2: int modelYearInput = 0;
				LexusGS300(modelYearInput);
				break;
		case 3:
				break;
		case 4: 
				break;
		case 5: 
				break;
		case 6: 
				break;
		case 7: 
				break;
		case 8: model = "Lexus GS F";
				futureModel = false;
				modelYear = 2016;
				buildGen = "L10";
				engine = "2UR-GSE";
				buildSeries = "";
				engineType = "Gas";
				displacement = 5.0;
				hp = 467;
				rpm = 7100;
				torque = 389;
				torqueRPM = 4800;
				cylinders = "V8";
				valves = 32;
				cam = "DOHC";
				platform = "Toyota New N";
				layout = "FR";
				drivetrain = "RWD"; 
				transmission = "8 Speed Auto";
				transModel = "AA81E";
				gallons = 17.4;
				fuelType = "Premium Unleaded";
				fuelCity = 16;
				fuelHwy = 24;
				SpecsTemplate(model, futureModel, modelYear, buildGen, buildSeries, engine, engineType, displacement, hp, rpm, torque, torqueRPM, cylinders, valves, cam, platform, layout, drivetrain, transmission, transModel,
						gallons, fuelType, fuelCity, fuelHwy);
				break;
		}
	}
	public static void LexusRC (int modelNumber) {
		
		String menu = "Select a RC model number: \n" +
				  	  "1. RC 200t \n" +
				  	  "2. RC 300 \n" +
				  	  "3. RC 350 \n" +
				  	  "4. RC F \n" +
				  	  "Enter choice: ";
		System.out.print(menu);
		modelNumber = in.nextInt();
		switch (modelNumber) {
		case 1:	LexusRC200t(modelNumber);
				break;
		case 2: LexusRC300(modelNumber);
				break;
		case 3: int modelYear = 0;
				LexusRC350(modelYear);
				break;
		case 4: modelYear = 0;
				LexusRCF(modelNumber);
				break;
		}
	}
	public static void LexusRX (int modelNumber) {
		
		String menu = "Select a RX model number: \n" +
					  "1. RX 300 \n" +
					  "2. RX 330 \n" +
					  "3. RX 350 \n" +
					  "4. RX 400h \n" +
					  "5. RX 450h \n" +
					  "Enter choice: ";
		System.out.print(menu);
		modelNumber = in.nextInt();
		switch (modelNumber) {
		case 1: 
				break;
		case 2: int modelYear = 0;
				LexusRX330(modelYear);
				break;
		case 3: 
				break;
		case 4:	modelYear = 0;
				LexusRX400h(modelYear);
				break;
		case 5:
				break;
		}
	}
	public static void LexusSC (int modelNumber) {
		
		String menu = "Select a SC model number: \n" +
					  "1. SC 300 \n" +
					  "2. SC 400 \n" +
					  "3. SC 430 (Convertible) \n" +
					  "Enter choice: ";
		System.out.print(menu);
		modelNumber = in.nextInt();
		switch (modelNumber) {
		case 1: int modelYear = 0;
				break;
		case 2:
				break;
		case 3: modelYear = 0;
				LexusSC430(modelYear);
				break;
		}
	}
	public static void LexusCT200h (int modelYear) {
		
		String menu = "Enter the CT 200h's model year you want to look into: \n" +
					  "Enter year: ";
		System.out.println();
		System.out.print(menu);
		modelYear = in.nextInt();
		while (modelYear < 2011 ^ modelYear > 2016) {
			System.out.println("This model year does not exist for the CT 200h.");
			menu = "Enter the CT 200h's model year you want to look into: \n" +
				   "Enter year: ";
			System.out.println();
			System.out.print(menu);
			modelYear = in.nextInt();
		}	
		String model = "Lexus CT 200h";
		boolean futureModel = false;
		int modelYearDate = modelYear;
		String buildGen = "A10";
		String buildSeries = "ZWA10";
		String engine = "2ZR-FXE";
		String engineType = "Hybrid (Gas + Electric)";
		double displacement = 1.8;
		int hp = 134;
		int rpm = 5200;
		int torque = 142;
		int torqueRPM = 4000;
		String cylinders = "I4";
		int valves = 16;
		String cam = "DOHC";
		String platform = "Toyota New MC";
		String layout = "Transverse FF";
		String drivetrain = "Transverse FWD"; 
		String transmission = "CVT Auto";
		String transModel = "";
		double gallons = 11.9;
		String fuelType = "Regular Unleaded";
		int fuelCity = 43;
		int fuelHwy = 40;
		SpecsTemplate(model, futureModel, modelYearDate, buildGen, buildSeries, engine, engineType, displacement, hp, rpm, torque, torqueRPM, cylinders, valves, cam, platform, layout, drivetrain, transmission, transModel,
					gallons, fuelType, fuelCity, fuelHwy);
		}
	public static void LexusIS200t (int modelYear) {
		
		String variants = "There are two model variants. Choose one you want to look at: \n" +
	  	  		  "1. Base, RWD \n" +
	  	  		  "2. Base, AWD \n" +	 
	  	  		  "Enter choice: ";
		System.out.println();
		System.out.print(variants);
		int variantSelection = in.nextInt();
		switch (variantSelection) {
		case 1: String model = "Lexus IS 200t (RWD)";
				boolean futureModel = false;
				int modelYearDate = 2016;
				String buildGen = "XE30";
				String buildSeries = "ASE30";
				String engine = "8AR-FTS";
				String engineType = "Gas (stock t/c)";
				double displacement = 2.0;
				int hp = 241;
				int rpm = 5600;
				int torque = 258;
				int torqueRPM = 4800;
				String cylinders = "I4";
				int valves = 16;
				String cam = "DOHC";
				String platform = "Toyota New N";
				String layout = "FR";
				String drivetrain = "RWD"; 
				String transmission  = "6 Speed Auto";
				String transModel = "";
				double gallons = 17.4;
				String fuelType = "Premium Unleaded";
				int fuelCity = 22;
				int fuelHwy = 33;
				SpecsTemplate(model, futureModel, modelYearDate, buildGen, buildSeries, engine, engineType, displacement, hp, rpm, torque, torqueRPM, cylinders, valves, cam, platform, layout, drivetrain, transmission, transModel,
							gallons, fuelType, fuelCity, fuelHwy);
				break;
		case 2: 
				break;
		}		
	}
	public static void LexusIS250 (int modelYear) {
		
		String menu = "Enter the IS 250's model year you want to look into: \n" +
			  	  	  "Enter year: ";
		System.out.println();
		System.out.print(menu);
		modelYear = in.nextInt();
		while (modelYear < 2006 || modelYear > 2015) {
			System.out.println("This model year does not exist for the IS 250.");
			menu = "Enter the IS 250's model year you want to look into: \n" +
			  	  	  "Enter year: ";
			System.out.println();
			System.out.print(menu);
			modelYear = in.nextInt();
			}
		if (modelYear >= 2006 || modelYear <= 2015) {
			if (modelYear >= 2006 || modelYear <= 2012) {
				String variants = "There are three model variants. Choose one you want to look at: \n" +
								  "1. Base, 6 Speed Manual, RWD \n" +
								  "2. Base, 6 Speed Auto, RWD \n" +
								  "3. Base, 6 Speed Auto, AWD \n" +
								  "Selection: ";
				System.out.print(variants);
				int variantChoice = in.nextInt();
				switch (variantChoice) {
				case 1:	String model = "Lexus IS 250 (RWD, 6 Speed Manual, 2nd Generation)";
						boolean futureModel = false;
						int modelYearDate = modelYear;
						String buildGen = "XE20";
						String buildSeries = "GSE20";
						String engine = "4GR-FSE";
						String engineType = "Gas";
						double displacement = 2.5;
						int hp = 204;
						int rpm = 6400;
						int torque = 185;
						int torqueRPM = 4800;
						String cylinders = "V6";
						int valves = 24;
						String cam = "DOHC";
						String platform = "Toyota N";
						String layout = "FR";
						String drivetrain = "RWD"; 
						String transmission = "6 Speed Manual";
						String transModel = "";
						double gallons = 17.1;
						String fuelType = "Premium Unleaded";
						int fuelCity = 18;
						int fuelHwy = 26;
						SpecsTemplate(model, futureModel, modelYearDate, buildGen, buildSeries, engine, engineType, displacement, hp, rpm, torque, torqueRPM, cylinders, valves, cam, platform, layout, drivetrain, transmission, transModel,
									gallons, fuelType, fuelCity, fuelHwy);
						break;
				case 2: model = "Lexus IS 250 (RWD, 6 Speed Auto, 2nd Generation)";
						futureModel = false;
						modelYearDate = modelYear;
						buildGen = "XE20";
						buildSeries = "GSE20";
						engine = "4GR-FSE";
						engineType = "Gas";
						displacement = 2.5;
						hp = 204;
						rpm = 6400;
						torque = 185;
						torqueRPM = 4800;
						cylinders = "V6";
						valves = 24;
						cam = "DOHC";
						platform = "Toyota N";
						layout = "FR";
						drivetrain = "RWD"; 
						transmission = "6 Speed Auto";
						transModel = "";
						gallons = 17.1;
						fuelType = "Premium Unleaded";
						fuelCity = 21;
						fuelHwy = 29;
						SpecsTemplate(model, futureModel, modelYearDate, buildGen, buildSeries, engine, engineType, displacement, hp, rpm, torque, torqueRPM, cylinders, valves, cam, platform, layout, drivetrain, transmission, transModel,
							gallons, fuelType, fuelCity, fuelHwy);
						break;
				case 3: 
						break;
				}
			}
		}
	}	
	public static void LexusIS250C (int modelYear) {
		
		String menu = "Select the IS 250 C's model year you want to look into: \n" +
			  	  "1. 2010 \n" +
			  	  "2. 2011 \n" +
				  "3. 2012 \n" +
				  "4. 2013 \n" +
				  "5. 2014 \n" +
				  "6. 2015 \n" +
				  "Enter choice: ";
		System.out.println();
		System.out.print(menu);
		modelYear = in.nextInt();
		if (modelYear == 1 || modelYear == 2 || modelYear == 3) {
			String variants = "There are two model variants. Choose one you want to look at: \n" +
				  	  	  	  "1. Base, 6 Speed Auto \n" +
				  	  	  	  "2. Base, 6 Speed Manual \n" +	 
				  	  	  	  "Enter choice: ";
			System.out.print(variants);
			int variantChoice = in.nextInt();
			switch (variantChoice) {
			case 1: String model = "Lexus IS 250 C (6 Speed Auto)";
					boolean futureModel = false;
					int modelYearDate = 0;
					if (modelYear == 1) {
						modelYearDate = 2010;
					}
					if (modelYear == 2) {
						modelYearDate = 2011;
					}
					if (modelYear == 3) {
						modelYearDate = 2012;
					}
					String buildGen = "XE20";
					String buildSeries = "GSE20";
					String engine = "4GR-FSE";
					String engineType = "Gas";
					double displacement = 2.5;
					int hp = 204;
					int rpm = 6400;
					int torque = 185;
					int torqueRPM = 4800;
					String cylinders = "V6";
					int valves = 24;
					String cam = "DOHC";
					String platform = "Toyota N";
					String layout = "FR";
					String drivetrain = "RWD"; 
					String transmission = "6 Speed Auto";
					String transModel = "";
					double gallons = 17.2;
					String fuelType = "Premium Unleaded";
					int fuelCity = 18;
					int fuelHwy = 26;
					SpecsTemplate(model, futureModel, modelYearDate, buildGen, buildSeries, engine, engineType, displacement, hp, rpm, torque, torqueRPM, cylinders, valves, cam, platform, layout, drivetrain, transmission, transModel,
					gallons, fuelType, fuelCity, fuelHwy);
					break;
			case 2: model = "Lexus IS 250 C (6 Speed Manual)";
					futureModel = false;
					modelYearDate = 0;
					if (modelYear == 1) {
						modelYearDate = 2010;
					}
					if (modelYear == 2) {
						modelYearDate = 2011;
					}
					if (modelYear == 3) {
						modelYearDate = 2012;
					}
					buildGen = "XE20";
					buildSeries = "GSE20";
					engine = "4GR-FSE";
					engineType = "Gas";
					displacement = 2.5;
					hp = 204;
					rpm = 6400;
					torque = 185;
					torqueRPM = 4800;
					cylinders = "V6";
					valves = 24;
					cam = "DOHC";
					platform = "Toyota N";
					layout = "FR";
					drivetrain = "RWD"; 
					transmission = "6 Speed Manual";
					transModel = "";
					gallons = 17.2;
					fuelType = "Premium Unleaded";
					fuelCity = 18;
					fuelHwy = 26;
					SpecsTemplate(model, futureModel, modelYearDate, buildGen, buildSeries, engine, engineType, displacement, hp, rpm, torque, torqueRPM, cylinders, valves, cam, platform, layout, drivetrain, transmission, transModel,
					gallons, fuelType, fuelCity, fuelHwy);
					break;
			}
		}
		if (modelYear == 4 || modelYear == 5 || modelYear == 6) {
			String model = "Lexus IS 250 C (Automatic only)";
			boolean futureModel = false;
			int modelYearDate = 0;
			if (modelYear == 4) {
				modelYearDate = 2013;
			}
			if (modelYear == 5) {
				modelYearDate = 2014;
			}
			if (modelYear == 6) {
				modelYearDate = 2015;
			}
			String buildGen = "XE20";
			String buildSeries = "GSE20";
			String engine = "4GR-FSE";
			String engineType = "Gas";
			double displacement = 2.5;
			int hp = 204;
			int rpm = 6400;
			int torque = 185;
			int torqueRPM = 4800;
			String cylinders = "V6";
			int valves = 24;
			String cam = "DOHC";
			String platform = "Toyota N";
			String layout = "FR";
			String drivetrain = "RWD"; 
			String transmission = "6 Speed Auto";
			String transModel = "";
			double gallons = 17.2;
			String fuelType = "Premium Unleaded";
			int fuelCity = 21;
			int fuelHwy = 30;
			SpecsTemplate(model, futureModel, modelYearDate, buildGen, buildSeries, engine, engineType, displacement, hp, rpm, torque, torqueRPM, cylinders, valves, cam, platform, layout, drivetrain, transmission, transModel,
					gallons, fuelType, fuelCity, fuelHwy);
		}
	}
	public static void LexusIS300Sedan (int modelYear) {
		String menu = "Enter the IS 300's model year you want to look into: \n" +
			  	  	  "Enter year: ";
		System.out.println();
		System.out.print(menu);
		modelYear = in.nextInt();
		while (modelYear < 2001 || modelYear > 2005) {
			System.out.println("This model year does not exist for the IS 300.");
			menu = "Enter the IS 300's model year you want to look into: \n" +
			  	   "Enter year: ";
			System.out.println();
			System.out.print(menu);
			modelYear = in.nextInt();
		}
	}
	public static void LexusIS300Wagon (int modelYear) {
		
	}
	
	public static void LexusIS350 (int modelYear) {
		String menu = "Enter the IS 350's model year you want to look into: ";
		System.out.println(menu);
		modelYear = in.nextInt();
	}
	public static void LexusIS350C (int modelYear) {
		String menu = "Select the IS 350 C's model year you want to look into: \n" +
				  	  "1. 2010 \n" +
				  	  "2. 2011 \n" +
					  "3. 2012 \n" +
					  "4. 2013 \n" +
					  "5. 2014 \n" +
					  "6. 2015 \n" +
					  "Enter choice: ";
		System.out.println();
		System.out.print(menu);
		modelYear = in.nextInt();
	}
	public static void LexusGS300 (int modelYear) {
		
		String menu = "Enter the GS 300's model year you want to look into: \n" +
				  	  "Enter year: ";
		System.out.println();
		System.out.print(menu);
		modelYear = in.nextInt();
		while (modelYear < 1993 || modelYear > 2011) {
			System.out.println("This model year does not exist for the GS 300.");
			menu = "Enter the GS 300's model year you want to look into: \n" +
				  	  "Enter year: ";
			System.out.println();
			System.out.print(menu);
			modelYear = in.nextInt();
			}
		if (modelYear >= 1993 & modelYear <= 1997) {
			String model = "Lexus GS 300 (Toyota Aristo) - 1st Generation";
			boolean futureModel = false;
			int modelYearDate = modelYear;
			String buildGen = "S140";
			String buildSeries = "GSE20";
			String engine = "2JZ-GE";
			String engineType = "Gas";
			double displacement = 3.0;
			int hp = 220;
			int rpm = 5800;
			int torque = 210;
			int torqueRPM = 4800;
			String cylinders = "I6";
			int valves = 24;
			String cam = "DOHC";
			String platform = "Toyota N";
			String layout = "FR";
			String drivetrain = "RWD"; 
			String transmission = "";
			String transModel = "";
			double gallons = 21.1;
			String fuelType = "Regular Unleaded";
			int fuelCity = 16;
			int fuelHwy = 0;
			if (modelYear >= 1993 && modelYear <= 1994) {
				fuelHwy = 21;
				transmission = "4 Speed Auto";
			}
			if (modelYear >= 1995 &&  modelYear <= 1997) {
				fuelHwy = 22;
			}
			if (modelYear == 1995) {
				transmission = "4 Speed Auto";
			}
			if (modelYear == 1996 ^ modelYear == 1997) {
				transmission = "5 Speed Auto";
			}
			SpecsTemplate(model, futureModel, modelYearDate, buildGen, buildSeries, engine, engineType, displacement, hp, rpm, torque, torqueRPM, cylinders, valves, cam, platform, layout, drivetrain, transmission, transModel,
						gallons, fuelType, fuelCity, fuelHwy);
		}
		if (modelYear >= 1998 & modelYear <= 2004) {
			String model = "Lexus GS 300 (Toyota Aristo) - 2nd Generation";
			boolean futureModel = false;
			int modelYearDate = modelYear;
			String buildGen = "S160";
			String buildSeries = "JZS160";
			String engine = "2JZ-GE";
			String engineType = "Gas";
			double displacement = 3.0;
			int hp = 0;
			int rpm = 0;
			int torque = 0;
			int torqueRPM = 0;
			if (modelYear == 1998 || modelYear == 1999) {
				hp = 225;
				rpm = 6000;
				torque = 220;
				torqueRPM = 4000;
			}
			if (modelYear >= 2000) {
				hp = 220;
				rpm = 5800;
				torque = 220;
				torqueRPM = 3800;
			}
			String cylinders = "I6";
			int valves = 24;
			String cam = "DOHC";
			String platform = "Toyota N";
			String layout = "FR";
			String drivetrain = "RWD"; 
			String transmission = "5 Speed Auto";
			String transModel = "A650E";
			double gallons = 19.8;
			String fuelType = "";
			if (modelYear < 2001) {
				fuelType = "Regular Unleaded";
			}
			if (modelYear >= 2001) {
				fuelType = "Premium Unleaded";
			}
			int fuelCity = 0;
			int fuelHwy = 22;
			if (modelYear == 1998 || modelYear == 2000) {
				fuelCity = 17;
			}
			if (modelYear == 1999 || modelYear >= 2001) {
				fuelCity = 16;
			}
			if (modelYear != 2001) {
				fuelHwy = 23;
			}
			SpecsTemplate(model, futureModel, modelYearDate, buildGen, buildSeries, engine, engineType, displacement, hp, rpm, torque, torqueRPM, cylinders, valves, cam, platform, layout, drivetrain, transmission, transModel,
						gallons, fuelType, fuelCity, fuelHwy);
		}
		if (modelYear >= 2005 & modelYear <= 2011) {
			
		}
	}
	public static void LexusRC200t (int modelYear) {
		String model = "Lexus RC 200t";
		boolean futureModel = false;
		int modelYearDate = 2016;
		String buildGen = "";
		String buildSeries = "";
		String engine = "8AR-FTS";
		String engineType = "Gas (Stock t/c)";
		double displacement = 2.0;
		int hp = 0;
		int rpm = 0;
		int torque = 258;
		int torqueRPM = 1650;
		String cylinders = "I4";
		int valves = 16;
		String cam = "DOHC";
		String platform = "";
		String layout = "FR";
		String drivetrain = "RWD"; 
		String transmission = "8 Speed Shiftable Auto";
		String transModel = "";
		double gallons = 17.4;
		String fuelType = "Premium Unleaded";
		int fuelCity = 22;
		int fuelHwy = 32;
		SpecsTemplate(model, futureModel, modelYearDate, buildGen, buildSeries, engine, engineType, displacement, hp, rpm, torque, torqueRPM, cylinders, valves, cam, platform, layout, drivetrain, transmission, transModel,
					gallons, fuelType, fuelCity, fuelHwy);
	}
	public static void LexusRC300 (int modelYear) {
		String model = "Lexus RC 300";
		boolean futureModel = false;
		int modelYearDate = 2016;
		String buildGen = "";
		String buildSeries = "";
		String engine = "";
		String engineType = "Gas";
		double displacement = 3.5;
		int hp = 0;
		int rpm = 0;
		int torque = 236;
		int torqueRPM = 2000;
		String cylinders = "V6";
		int valves = 24;
		String cam = "DOHC";
		String platform = "";
		String layout = "F4";
		String drivetrain = "AWD"; 
		String transmission  = "6 Speed Shiftable Auto";
		String transModel = "";
		double gallons = 17.4;
		String fuelType = "Premium Unleaded";
		int fuelCity = 19;
		int fuelHwy = 26;
		SpecsTemplate(model, futureModel, modelYearDate, buildGen, buildSeries, engine, engineType, displacement, hp, rpm, torque, torqueRPM, cylinders, valves, cam, platform, layout, drivetrain, transmission, transModel,
					gallons, fuelType, fuelCity, fuelHwy);
	}
	public static void LexusRC350 (int modelYear) {
		
		String menu = "Enter the RC 350's model year you want to look into: \n" +
			  	  	  "Enter year: ";
		System.out.println();
		System.out.print(menu);
		modelYear = in.nextInt();
		while (modelYear < 2015 || modelYear > 2016) {
			System.out.println("This model year does not exist for the RC 350.");
			menu = "Enter the RC 350's model year you want to look into: \n" +
				   "Enter year: ";
			System.out.println();
			System.out.print(menu);
			modelYear = in.nextInt();
		}
		if (modelYear >= 2015 || modelYear <= 2016) {
			String variants = "There are two model variants. Choose one you want to look at: \n" +
	  	  	  		  "1. Base, RWD \n" +
	  	  	  		  "2. Base, AWD \n" +	 
	  	  	  		  "Enter choice: ";
			System.out.println();
			System.out.print(variants);
			int variantSelection = in.nextInt();
			switch (variantSelection) {
			case 1: String model = "Lexus RC 350";
					boolean futureModel = false;
					int modelYearDate = modelYear;
					String buildGen = "";
					String buildSeries = "";
					String engine = "2GR-FSE";
					String engineType = "Gas";
					double displacement = 3.5;
					int hp = 0;
					int rpm = 0;
					int torque = 277;
					int torqueRPM = 4800;
					String cylinders = "V6";
					int valves = 24;
					String cam = "DOHC";
					String platform = "";
					String layout = "FR";
					String drivetrain = "RWD"; 
					String transmission = "6 Speed Auto";
					String transModel = "";
					double gallons = 17.4;
					String fuelType = "Premium Unleaded";
					int fuelCity = 19;
					int fuelHwy = 28;
					SpecsTemplate(model, futureModel, modelYearDate, buildGen, buildSeries, engine, engineType, displacement, hp, rpm, torque, torqueRPM, cylinders, valves, cam, platform, layout, drivetrain, transmission, transModel,
								gallons, fuelType, fuelCity, fuelHwy);
					break;
			case 2: model = "Lexus RC 350";
					futureModel = false;
					modelYearDate = modelYear;
					buildGen = "";
					buildSeries = "";
					engine = "2GR-FSE";
					engineType = "Gas";
					displacement = 3.5;
					hp = 0;
					rpm = 0;
					torque = 277;
					torqueRPM = 4800;
					cylinders = "V6";
					valves = 24;
					cam = "DOHC";
					platform = "";
					layout = "F4";
					drivetrain = "AWD"; 
					transmission = "6 Speed Auto";
					transModel = "";
					gallons = 17.4;
					fuelType = "Premium Unleaded";
					fuelCity = 19;
					fuelHwy = 26;
					SpecsTemplate(model, futureModel, modelYearDate, buildGen, buildSeries, engine, engineType, displacement, hp, rpm, torque, torqueRPM, cylinders, valves, cam, platform, layout, drivetrain, transmission, transModel,
								gallons, fuelType, fuelCity, fuelHwy);
					break;
			}
		}
	}
	public static void LexusRCF (int modelYear) {
		
		String menu = "Enter the RC F's model year you want to look into: \n" +
			  	  	  "Enter year: ";
		System.out.println();
		System.out.print(menu);
		modelYear = in.nextInt();
		while (modelYear < 2015 || modelYear > 2017) {
			System.out.println("This model year does not exist for the RC F.");
			menu = "Enter the RC F's model year you want to look into: \n" +
				   "Enter year: ";
			System.out.println();
			System.out.print(menu);
			modelYear = in.nextInt();
		}
		if (modelYear >= 2015 || modelYear <= 2017) {
			String model = "Lexus RC F";
			boolean futureModel = false;
			int modelYearDate = modelYear;
			String buildGen = "";
			String buildSeries = "";
			String engine = "2UR-GSE";
			String engineType = "Gas";
			double displacement = 5.0;
			int hp = 467;
			int rpm = 0;
			int torque = 389;
			int torqueRPM = 4800;
			String cylinders = "V8";
			int valves = 32;
			String cam = "DOHC";
			String platform = "";
			String layout = "FR";
			String drivetrain = "RWD"; 
			String transmission = "8 Speed Shiftable Auto";
			String transModel = "AA80E";
			double gallons = 17.4;
			String fuelType = "Premium Unleaded";
			int fuelCity = 16;
			int fuelHwy = 25;
			SpecsTemplate(model, futureModel, modelYearDate, buildGen, buildSeries, engine, engineType, displacement, hp, rpm, torque, torqueRPM, cylinders, valves, cam, platform, layout, drivetrain, transmission, transModel,
						gallons, fuelType, fuelCity, fuelHwy);
			}
	}	
	public static void LexusRX330 (int modelYear) {
		
		String menu = "Enter the RX 330's model year you want to look into: \n" +
				  	  "Enter year: ";
		System.out.println();
		System.out.print(menu);
		modelYear = in.nextInt();
		while (modelYear < 2004 || modelYear > 2006) {
			System.out.println("This model year does not exist for the RX 330.");
			menu = "Enter the RX 330's model year you want to look into: \n" +
				  	  	  "Enter year: ";
			System.out.println();
			System.out.print(menu);
			modelYear = in.nextInt();
		}
		if (modelYear >= 2004 && modelYear <= 2006) {
			String variants = "There are two model variants. Choose one you want to look at: \n" +
		  	  	  	  		  "1. Base, FWD \n" +
		  	  	  	  		  "2. Base, AWD \n" +	 
		  	  	  	  		  "Enter choice: ";
			System.out.println();
			System.out.print(variants);
			int variantSelection = in.nextInt();
			switch (variantSelection) {
			case 1: String model = "Lexus RX 330 (5 Speed Auto, FWD version)";
					boolean futureModel = false;
					int modelYearDate = 0;
					if (modelYear == 2004) {
						modelYearDate = 2004;
					}
					if (modelYear == 2005) {
						modelYearDate = 2005;
					}
					if (modelYear == 2006) {
						modelYearDate = 2006;
					}
					String buildGen = "XU30";
					String buildSeries = "MCU33/38";
					String engine = "3MZ-FE";
					String engineType = "Gas";
					double displacement = 3.3;
					int hp = 225;
					int rpm = 5600;
					int torque = 0;
					int torqueRPM = 0;
					if (modelYear == 2004 || modelYear == 2005) {
						torque = 242;
						torqueRPM = 3600;
					}
					if (modelYear == 2006) {
						torque = 238;
						torqueRPM = 3600;
					}
					String cylinders = "V6";
					int valves = 24;
					String cam = "DOHC";
					String platform = "Toyota K";
					String layout = "FF";
					String drivetrain = "FWD"; 
					String transmission = "5 Speed Auto";
					String transModel = "U151E";
					double gallons = 19.2;
					String fuelType = "Regular Unleaded";
					int fuelCity = 17;
					int fuelHwy = 23;
					SpecsTemplate(model, futureModel, modelYearDate, buildGen, buildSeries, engine, engineType, displacement, hp, rpm, torque, torqueRPM, cylinders, valves, cam, platform, layout, drivetrain, transmission, transModel,
					gallons, fuelType, fuelCity, fuelHwy);
					break;
			case 2: model = "Lexus RX 330 (5 Speed Auto, AWD version)";
					futureModel = false;
					modelYearDate = 0;
					if (modelYear == 2004) {
						modelYearDate = 2004;
					}
					if (modelYear == 2005) {
						modelYearDate = 2005;
					}
					if (modelYear == 2006) {
						modelYearDate = 2006;
					}
					buildGen = "XU30";
					buildSeries = "MCU33/38";
					engine = "3MZ-FE";
					engineType = "Gas";
					displacement = 3.3;
					hp = 225;
					rpm = 5600;
					torque = 0;
					torqueRPM = 0;
					if (modelYear == 2004 || modelYear == 2005) {
						torque = 242;
						torqueRPM = 3600;
					}
					if (modelYear == 2006) {
						torque = 238;
						torqueRPM = 3600;
					}
					cylinders = "V6";
					valves = 24;
					cam = "DOHC";
					platform = "Toyota K";
					layout = "F4";
					drivetrain = "AWD"; 
					transmission = "5 Speed Auto";
					transModel = "U151E";
					gallons = 19.2;
					fuelType = "Regular Unleaded";
					fuelCity = 16;
					fuelHwy = 22;
					SpecsTemplate(model, futureModel, modelYearDate, buildGen, buildSeries, engine, engineType, displacement, hp, rpm, torque, torqueRPM, cylinders, valves, cam, platform, layout, drivetrain, transmission, transModel,
					gallons, fuelType, fuelCity, fuelHwy);
					break;
			}
		}
	}
	public static void LexusRX350 (int modelYear) {
		
	}
	public static void LexusRX400h (int modelYear) {
		
		String menu = "Enter the RX 400h's model year you want to look into: \n" +
				  	  "Enter year: ";
		System.out.println();
		System.out.print(menu);
		modelYear = in.nextInt();
		while (modelYear < 2005 || modelYear > 2008) {
			System.out.println("This model year does not exist for the RX 400h.");
			menu = "Enter the RX 400h's model year you want to look into: \n" +
				  	  	  "Enter year: ";
			System.out.println();
			System.out.print(menu);
			modelYear = in.nextInt();
		}
		if (modelYear >= 2005 && modelYear <= 2008) {
			String variants = "There are two model variants. Choose one you want to look at: \n" +
			  	  	  	  	  "1. Base, FWD \n" +
			  	  	  	  	  "2. Base, AWD \n" +	 
			  	  	  	      "Enter choice: ";
			System.out.println();
			System.out.print(variants);
			int variantSelection = in.nextInt();
			switch (variantSelection) {
			case 1:	
					break;
			case 2:
					break;
			}
		}
	}
	public static void LexusSC430 (int modelYear) {
		
		String menu = "Enter the SC 430's model year you want to look into: \n" +
				  	  "Enter year: ";
		System.out.println();
		System.out.print(menu);
		modelYear = in.nextInt();
		while (modelYear < 2002 || modelYear > 2010) {
			System.out.println("This model year does not exist for the SC 430.");
			menu = "Enter the SC 430's model year you want to look into: \n" +
				   "Enter year: ";
			System.out.println();
			System.out.print(menu);
			modelYear = in.nextInt();
		}
		
	}
	public static void SpecsTemplate (String model, boolean futureModel, int modelYear, String buildGen, String buildSeries, String engine,
			String engineType, double displacement, int hp, int rpm, int torque, int torqueRPM,
			String cylinders, int valves, String cam, String platform, String layout, String drivetrain,
			String transmission, String transModel, double gallons, String fuelType, 
			int fuelCity, int fuelHwy) {
		
		System.out.println();
		System.out.println(model);
		System.out.println();
		if (futureModel == true) {
			String futureModelNotice = "This model is not released yet. Some information may be inaccurate.";
			System.out.println(futureModelNotice);
		}
		System.out.println();
		System.out.println("Model Year:\t\t\t\t" +modelYear);
		System.out.println("Build Generation:\t\t\t" +buildGen);
		System.out.println("Build Series:\t\t\t\t" + buildSeries);
		System.out.println();
		System.out.println("Engine Information: ");
		System.out.println("-------------------------------------------------------------");
		System.out.println("Engine Model:\t\t\t\t" +engine);
		System.out.println("Engine Type:\t\t\t\t" +engineType);
		System.out.println("Engine Displacement:\t\t\t" +displacement+ "L");
		System.out.println("Horsepower:\t\t\t\t" +hp+ "hp @ " +rpm+ "RPM");
		System.out.println("Torque:\t\t\t\t\t" +torque+ "ft-lbs. @" +torqueRPM+ "rpm");
		System.out.println("Cylinders:\t\t\t\t" +cylinders);
		System.out.println("Valves:\t\t\t\t\t" +valves);
		System.out.println("Camshaft Type:\t\t\t\t" +cam);
		System.out.println();
		System.out.println("Powertrain Information: ");
		System.out.println("-------------------------------------------------------------");
		System.out.println("Platform Type:\t\t\t\t" +platform);
		System.out.println("Layout Type:\t\t\t\t" +layout);
		System.out.println("Driving Type:\t\t\t\t" +drivetrain);
		System.out.println("Transmission:\t\t\t\t" +transmission);
		System.out.println("Transmission Model:\t\t\t" +transModel);
		System.out.println();
		System.out.println("Fuel Information: ");
		System.out.println("-------------------------------------------------------------");
		System.out.println("Fuel Tank Capacity:\t\t\t" + gallons + " gallons");
		System.out.println("Fuel Type:\t\t\t\t" + fuelType);
		System.out.println("EPA Estimated Mileage (City):\t\t" + fuelCity + " miles per gallon");
		System.out.println("EPA Estimated Mileage (Highway):\t" + fuelHwy + " miles per gallon");
		double cityCruising = fuelCity * gallons;
		double hwyCruising = fuelHwy * gallons;
		System.out.println("Cruising Range Total (City):\t\t" + Math.round(cityCruising*100.0)/100.0 + " miles");
		System.out.println("Cruising Range Total (Highway):\t\t" + Math.round(hwyCruising*100.0)/100.0 + " miles");
		System.out.println("Enter any letter/number to exit.");
		in.next();
		System.out.println();
	}
}
