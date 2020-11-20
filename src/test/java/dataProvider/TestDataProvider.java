package dataProvider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {

	@Test(dataProvider = "data")
	public void login(String a, int b, String c, String d) {
		System.out.println(a + " " + b + " " + c + " " + d);
	}

	@DataProvider
	public Object[][] getData(Method m) {
		System.out.println("Who is calling @DataProvider: " + m.getName());
		Object[][] data1 = null;
		if (m.getName().equals("loginTest")) {
			//loginTest
			data1 = new Object[3][4];

			data1[0][0] = "Mir";
			data1[0][1] = 12;
			data1[0][2] = "H";
			data1[0][3] = "123";

			data1[1][0] = "Mira";
			data1[1][1] = 13;
			data1[1][2] = "I";
			data1[1][3] = "124";

			data1[2][0] = "Mirb";
			data1[2][1] = 14;
			data1[2][2] = "J";
			data1[2][3] = "125";
		} 
		else if(m.getName().equals("loginTest2")) {
			data1 = new Object[3][4];

			data1[0][0] = "Mir";
			data1[0][1] = 12;
			data1[0][2] = "H";
			data1[0][3] = "123";

			data1[1][0] = "Mira";
			data1[1][1] = 13;
			data1[1][2] = "I";
			data1[1][3] = "124";

			data1[2][0] = "Mirb";
			data1[2][1] = 14;
			data1[2][2] = "J";
			data1[2][3] = "125";
		}
		else if(m.getName().equals("loginTest3")) {
			data1 = new Object[3][4];

			data1[0][0] = "Mir";
			data1[0][1] = 12;
			data1[0][2] = "H";
			data1[0][3] = "123";

			data1[1][0] = "Mira";
			data1[1][1] = 13;
			data1[1][2] = "I";
			data1[1][3] = "124";

			data1[2][0] = "Mirb";
			data1[2][1] = 14;
			data1[2][2] = "J";
			data1[2][3] = "125";
		}
		else if(m.getName().equals("loginTest4")) {
			data1 = new Object[3][4];

			data1[0][0] = "Mir";
			data1[0][1] = 12;
			data1[0][2] = "H";
			data1[0][3] = "123";

			data1[1][0] = "Mira";
			data1[1][1] = 13;
			data1[1][2] = "I";
			data1[1][3] = "124";

			data1[2][0] = "Mirb";
			data1[2][1] = 14;
			data1[2][2] = "J";
			data1[2][3] = "125";
		}
		else if(m.getName().equals("loginTest5")) {
			data1 = new Object[3][4];

			data1[0][0] = "Mir";
			data1[0][1] = 12;
			data1[0][2] = "H";
			data1[0][3] = "123";

			data1[1][0] = "Mira";
			data1[1][1] = 13;
			data1[1][2] = "I";
			data1[1][3] = "124";

			data1[2][0] = "Mirb";
			data1[2][1] = 14;
			data1[2][2] = "J";
			data1[2][3] = "125";
		}
		else if(m.getName().equals("loginTest6")) {
			data1 = new Object[3][4];

			data1[0][0] = "Mir";
			data1[0][1] = 12;
			data1[0][2] = "H";
			data1[0][3] = "123";

			data1[1][0] = "Mira";
			data1[1][1] = 13;
			data1[1][2] = "I";
			data1[1][3] = "124";

			data1[2][0] = "Mirb";
			data1[2][1] = 14;
			data1[2][2] = "J";
			data1[2][3] = "125";
		}
		else if(m.getName().equals("loginTest7")) {
			data1 = new Object[3][4];

			data1[0][0] = "Mir";
			data1[0][1] = 12;
			data1[0][2] = "H";
			data1[0][3] = "123";

			data1[1][0] = "Mira";
			data1[1][1] = 13;
			data1[1][2] = "I";
			data1[1][3] = "124";

			data1[2][0] = "Mirb";
			data1[2][1] = 14;
			data1[2][2] = "J";
			data1[2][3] = "125";
		}
		else if(m.getName().equals("loginTest8")) {
			data1 = new Object[3][4];

			data1[0][0] = "Mir";
			data1[0][1] = 12;
			data1[0][2] = "H";
			data1[0][3] = "123";

			data1[1][0] = "Mira";
			data1[1][1] = 13;
			data1[1][2] = "I";
			data1[1][3] = "124";

			data1[2][0] = "Mirb";
			data1[2][1] = 14;
			data1[2][2] = "J";
			data1[2][3] = "125";
		}
		else if(m.getName().equals("loginTest9")) {
			data1 = new Object[3][4];

			data1[0][0] = "Mir";
			data1[0][1] = 12;
			data1[0][2] = "H";
			data1[0][3] = "123";

			data1[1][0] = "Mira";
			data1[1][1] = 13;
			data1[1][2] = "I";
			data1[1][3] = "124";

			data1[2][0] = "Mirb";
			data1[2][1] = 14;
			data1[2][2] = "J";
			data1[2][3] = "125";
		}
		else if (m.getName().equals("logoutTest")) {
			data1 = new Object[3][4];

			data1[0][0] = "Mir";
			data1[0][1] = 12;
			data1[0][2] = "H";
			data1[0][3] = "123";

			data1[1][0] = "Mira";
			data1[1][1] = 13;
			data1[1][2] = "I";
			data1[1][3] = "124";

			data1[2][0] = "Mirb";
			data1[2][1] = 14;
			data1[2][2] = "J";
			data1[2][3] = "125";
		}
		else if (m.getName().equals("logoutTest2")) {
			data1 = new Object[3][4];

			data1[0][0] = "Mir";
			data1[0][1] = 12;
			data1[0][2] = "H";
			data1[0][3] = "123";

			data1[1][0] = "Mira";
			data1[1][1] = 13;
			data1[1][2] = "I";
			data1[1][3] = "124";

			data1[2][0] = "Mirb";
			data1[2][1] = 14;
			data1[2][2] = "J";
			data1[2][3] = "125";
		}
		else if (m.getName().equals("logoutTest3")) {
			data1 = new Object[3][4];

			data1[0][0] = "Mir";
			data1[0][1] = 12;
			data1[0][2] = "H";
			data1[0][3] = "123";

			data1[1][0] = "Mira";
			data1[1][1] = 13;
			data1[1][2] = "I";
			data1[1][3] = "124";

			data1[2][0] = "Mirb";
			data1[2][1] = 14;
			data1[2][2] = "J";
			data1[2][3] = "125";
		}
		//=================================
		else if (m.getName().equals("logoutTest4")) {
			data1 = new Object[3][4];

			data1[0][0] = "Mir";
			data1[0][1] = 12;
			data1[0][2] = "H";
			data1[0][3] = "123";

			data1[1][0] = "Mira";
			data1[1][1] = 13;
			data1[1][2] = "I";
			data1[1][3] = "124";

			data1[2][0] = "Mirb";
			data1[2][1] = 14;
			data1[2][2] = "J";
			data1[2][3] = "125";
		}
		else if (m.getName().equals("logoutTest5")) {
			data1 = new Object[3][4];

			data1[0][0] = "Mir";
			data1[0][1] = 12;
			data1[0][2] = "H";
			data1[0][3] = "123";

			data1[1][0] = "Mira";
			data1[1][1] = 13;
			data1[1][2] = "I";
			data1[1][3] = "124";

			data1[2][0] = "Mirb";
			data1[2][1] = 14;
			data1[2][2] = "J";
			data1[2][3] = "125";
		}
		else if (m.getName().equals("logoutTest6")) {
			data1 = new Object[3][4];

			data1[0][0] = "Mir";
			data1[0][1] = 12;
			data1[0][2] = "H";
			data1[0][3] = "123";

			data1[1][0] = "Mira";
			data1[1][1] = 13;
			data1[1][2] = "I";
			data1[1][3] = "124";

			data1[2][0] = "Mirb";
			data1[2][1] = 14;
			data1[2][2] = "J";
			data1[2][3] = "125";
		}
		//==============================
		else if (m.getName().equals("logoutTest7")) {
			data1 = new Object[3][4];

			data1[0][0] = "Mir";
			data1[0][1] = 12;
			data1[0][2] = "H";
			data1[0][3] = "123";

			data1[1][0] = "Mira";
			data1[1][1] = 13;
			data1[1][2] = "I";
			data1[1][3] = "124";

			data1[2][0] = "Mirb";
			data1[2][1] = 14;
			data1[2][2] = "J";
			data1[2][3] = "125";
		}
		else if (m.getName().equals("logoutTest8")) {
			data1 = new Object[3][4];

			data1[0][0] = "Mir";
			data1[0][1] = 12;
			data1[0][2] = "H";
			data1[0][3] = "123";

			data1[1][0] = "Mira";
			data1[1][1] = 13;
			data1[1][2] = "I";
			data1[1][3] = "124";

			data1[2][0] = "Mirb";
			data1[2][1] = 14;
			data1[2][2] = "J";
			data1[2][3] = "125";
		}
		else if (m.getName().equals("logoutTest9")) {
			data1 = new Object[3][4];

			data1[0][0] = "Mir";
			data1[0][1] = 12;
			data1[0][2] = "H";
			data1[0][3] = "123";

			data1[1][0] = "Mira";
			data1[1][1] = 13;
			data1[1][2] = "I";
			data1[1][3] = "124";

			data1[2][0] = "Mirb";
			data1[2][1] = 14;
			data1[2][2] = "J";
			data1[2][3] = "125";
		}
		
		
		



		return data1;
	}

}
