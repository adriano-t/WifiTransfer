import java.net.InetAddress;
import java.net.UnknownHostException;

public class Utils {

	public static String pathGetFilename(String path)
	{
		int pos = path.lastIndexOf(".");
		if (pos > 0)
			return path.substring(0, pos);
		return "";		
	}
	
	public void getData(){
		try {
			InetAddress ip = InetAddress.getLocalHost();
			System.out.println("Current IP address : " + ip.getHostAddress());

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	} 


}
