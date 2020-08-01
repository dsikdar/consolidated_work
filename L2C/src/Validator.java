
public class Validator {
	
	public static boolean validateConfiguration(int ramCapacity,int hdCapacity,int olNetConnection)throws ConfigurationMisMatchException{
		boolean flag = false;
		
		if (ramCapacity>=6&&hdCapacity>=30&&olNetConnection>=192){
			flag=true;
		}
		else{
		    flag=false;
		    throw new ConfigurationMisMatchException();
		}
		
		
		return flag;
		
	}

}
