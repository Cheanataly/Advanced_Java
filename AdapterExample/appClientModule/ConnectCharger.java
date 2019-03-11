public class ConnectCharger 
{
	Charger charger;
	public Charger getCharger()
	{
		return charger;
	}
	public void setCharger(Charger charger)
	{
		this.charger=charger;
	}
	public void connectCharge()
	{
		charger.putCharge();
	}

}
