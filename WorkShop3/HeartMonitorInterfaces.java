public interface MonitorI {
	public void inputVitals(Vital v);
	public Vital displayVitals ();
	public void administerMedication(Drug m);
	public void updatePDS(PDS p);
}



public interface VitalI {
	public int getVital();
	public void setVital(int v);
}

public interface MedicationI {
	public void addDrug(List<Drug> d);
	public void List<Drug> getDrugList();
}

public interface Drug {
	public void setDrugName(string d);
	public string getDrugName();
	public void setMilligrams(double m);
	public double getMilligrams();
}


public interface PDSI {  // Patient Data Store 
	public setPDS();
	public getPDS();
}



public interface patientProfile {
	public string getName();
	public void SetName(string n)
	// etc..
	public PDS getPDS();
}

