package travelplanner;

public abstract class ControllAbstract {

	abstract void registerUser(User user);
	abstract  User loginUser(String username, String password);
}