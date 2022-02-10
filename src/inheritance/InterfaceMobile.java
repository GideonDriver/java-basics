package inheritance;

public class InterfaceMobile /*extends ChangePassword*/ implements InterfaceMusic {

	//@Override
	//public void encryptPassword() {	}

	@Override
	public void playSong() {
		//Cannot have a private static variable since static makes it a class variable,
		//and private makes it only accessible in the local code block.
		//private static int time=10;

	}

	@Override
	public void changeSong() {
		// TODO Auto-generated method stub

	}

}
