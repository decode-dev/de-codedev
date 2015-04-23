package space.apps.space_smiles;

public class Login_Key {

	public static final String key = "testkey";
	public static final String url = "http://192.168.0.5:8080/ssmiles/api.php?key=" + key;
	//Here the link is given for localhost where the site is running.
	//I may be wrong here so u can edit as u wish.
	//The above key is also defined in api.php file.
	//Since we are running on Emulator we need to add our System IP Address with Port Number.
	
	public static final String addParam(String url, String param) {
		url += "&" + param;
		return url;
	}
	
    public static String convertStreamToString(java.io.InputStream is) {
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }
}
