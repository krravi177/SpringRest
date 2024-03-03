package max;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

	public List<User> getDetailll(int uid)
	{
		List<User> l=new ArrayList<User>();
		 User u = new User();
		 u.setUid(uid+11);
		 u.setName("raja");
		 u.setAdd("noida");
		 l.add(u);
		 
		 User u1 = new User();
		 u1.setUid(uid+12);
		 u1.setName("aja");
		 u1.setAdd("gr noida");
		 l.add(u1);
		return l;
	}
	
	
}
