package inheritance;

public final class ChangePassword {
	final String passCode;

	public ChangePassword() {
		passCode = "abc@123";
	}

	public final void encryptPassword() {
		//Cannot reassign a final variable
		//passCode="xyz@123";
	}
}
