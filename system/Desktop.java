package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("desktopSize is 32.5 inch");
	}
		public static void main(String[] args) {
			Desktop mod =new Desktop();
			mod.desktopSize();
			mod.computerModel();
		}

}
