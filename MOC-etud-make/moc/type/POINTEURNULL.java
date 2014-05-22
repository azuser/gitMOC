package moc.type;



public class POINTEURNULL extends POINTEUR {	
    
    public POINTEURNULL () {
	     super(null);
    }
     
    public boolean compareTo(DTYPE autre) {
                if (autre instanceof POINTEUR)
                        return true;
                return false;
    }

    public boolean castableTo(DTYPE autre) {
	if (autre instanceof POINTEUR)
		 return true;
        return false;
    }    
}
