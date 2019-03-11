public class AdapterPgm 
{
	public static void main(String[] args)
	{
		//Charger iPhoneCharger = new iPhoneCharger(); // It is for normal flow 
		Charger iPhoneCharger = new AllChargerAdapter();
		ConnectCharger cc = new ConnectCharger();
		cc.setCharger(iPhoneCharger);
		cc.connectCharge();
	}
}
