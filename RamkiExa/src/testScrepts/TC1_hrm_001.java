package testScrepts;

import lib.General;

public class TC1_hrm_001 {
	public static void main(String[] args) {
		General h= new General();
		h.openApp();
		h.loginApp();
		h.AddEmp();
		h.DelEmp();
		h.lagoutApp();
		h.closerBro();
		h.quit();
	}
}
