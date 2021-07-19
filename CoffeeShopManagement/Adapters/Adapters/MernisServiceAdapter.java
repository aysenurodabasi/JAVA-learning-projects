package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean result = true;
		
		try 
		{
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());		
		} 
		catch (Exception e) 
		{
			System.out.println("Not a valid person");
		}		
		return result;
	}
}
