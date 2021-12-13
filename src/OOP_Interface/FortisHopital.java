package OOP_Interface;

//multiple inheritance
public class FortisHopital extends UNHG implements USMedical, UKMedical, IndianMedical {

	// US
	@Override
	public void physioServices() {
		System.out.println("FH -- physioServices");
	}

	@Override
	public void cardioServices() {
		System.out.println("FH -- cardioServices");

	}

	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyServices");
	}

	// UK
	@Override
	public void entServices() {
		System.out.println("FH -- entServices");
	}

	@Override
	public void pediaServices() {
		System.out.println("FH -- pediaServices");
	}

	// India
	@Override
	public void orthoServices() {
		System.out.println("FH -- orthoServices");
	}

	@Override
	public void dentalServices() {
		System.out.println("FH -- dentalServices");
	}

	// fortis
	public void medialTraining() {
		System.out.println("FH -- medical training");
	}

	public void optServices() {
		System.out.println("FH -- optServices");

	}

	@Override
	public void emergencyServices() {
		System.out.println("FH -- emergencyServices");
	}
	
	@Override
	public void medInsurance() {
		System.out.println("FH med Insurance");
	}

	@Override
	public void covidTest() {
		System.out.println("FH -- covid Test");
	}
	

}
