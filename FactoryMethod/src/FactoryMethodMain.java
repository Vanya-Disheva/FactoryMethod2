import com.phone.Andorid;
import com.phone.OS;
import com.phone.OperatingSystemFactory;
import com.phone.Windows;

public class FactoryMethodMain 
{ 
	public static void main(String[] args) {
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS obj = osf.createOS("dada");
		obj.spec();
	}

}
