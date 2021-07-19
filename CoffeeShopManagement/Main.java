import java.rmi.RemoteException;
import java.time.LocalDate;
import Adapters.MernisServiceAdapter;
import Abstract.BaseCustomerManager;
import Concrete.StarbucksCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;


import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws Exception {
		//BaseCustomerManager customerManager = new NeroCustomerManager();
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		//Bilgilerinizi giriniz;
		customerManager.Save(new Customer(14,"Adınız", "Soyadınız", LocalDate.of(yil, gun, ay), "TCKimlikno"));

	}

}