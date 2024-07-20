package FrameWork;

import java.awt.Robot;

import java.awt.event.KeyEvent;

import org.sikuli.script.Pattern;

import org.sikuli.script.Screen;

public class SikuliEx {

	public static void main(String[] args) throws Exception {
		
		Screen scr = new Screen();
		
		Pattern pattern = new Pattern("/Users/babu/Desktop/JAVA SEL ASSGN/sublime.png");
		scr.type(pattern, "sublime");
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
	//	Pattern page = new Pattern("/Users/babu/Desktop/JAVA SEL ASSGN/Page1.png");
	//	scr.type(page, "SIKULI");

	}

}
