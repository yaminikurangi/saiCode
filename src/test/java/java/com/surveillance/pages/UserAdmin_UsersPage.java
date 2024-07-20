package java.com.surveillance.pages;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class UserAdmin_UsersPage
{
	PropertySingleton _instance = null;
	public UserAdmin_UsersPage() {
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("NotificationsPage");
	

}
