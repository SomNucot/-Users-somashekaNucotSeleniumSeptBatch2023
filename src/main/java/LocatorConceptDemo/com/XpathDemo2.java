package LocatorConceptDemo.com;

public class XpathDemo2 {

	public static void main(String[] args) {
		//1.syntax
		//-->//tagName[@attribute='Value']
	
	//--//span[@class='']
		
	
		
		
		//2.By using text
		
				//syntax
				//-->//tagname[text()='value']
		
		
		
		//--> //span[test()='']
		
		
				
			//-->	//p[text()='Forgot your password? ']
		
				//p[text()='Forgot your password? ']

	//--->       //label[text()='Username']
		
	//--->	//div[text()='Swag Labs']
		
		
		

			//	<a   id=123  name='abc'> user
			//	<a   id=123  name='xyz'>pwd
		//a[@id='123' and @name='abc']
		//a[@id='123' and @name='xyz']
		
	
		
		//tagName[@attribute='Value']
		//a[@id='123' and @name='abc']
		//a[@id='123' and @name='xyz']
		
		
		//3.way
				//-->//tagname[@attribute='vaue' and @attribute='vaue']
				//-->//tagname[@attribute='vaue' and text()='value']
				//-->//tagname[@attribute='vaue' or text()='value']
				
				//example
				//->//input[@id='username' and @type='email']
		
				//input[@id='username' and @type='email']
		
		
		
		
		
		
		
		
		//	4.	
		//contains
				//syntax-->//tagName[contains(@attribute,'value')]
				
				//tagName[contains(text(),'value')]
		
		//example for Text-->//i18n-string[contains(text(),'All Rights Reserved.')]
		
		
		
				//tagName[contains(@id,'value')]
		
		//i18n-string[contains()]
		
		
		
		
				//tagName[contains(@name,'value')]
				//tagName[contains(@class,'value')]
		//div[contains(@class,'login_logo')]
		
		
		
				
		//p[contains(@class,'oxd-text oxd-text--p orangehrm-login-forgot-header')]
			
		//-->example--> //td[contains(text(),'Please identify yourself')]
				
		
		///
		
		
		
		
		

		//index postion
				//-->(//tagName[@attribute='value'])[index]
				//-->exampme-->(//a[@class='nav-a  '])[6]
				
				
		
		
		//-->(//div[@class='_1FNrEw'])[4]
				
				
				
		
		
		
		
		
		
		
		
		
		
		//starts-with
				
				
				//--> //tagName[starts-with(@attribute,'value')]
				
				//--> //tagName[ends-with(@attribute,'value')]
				
				
				
				//index
				
				
				//-->(//tagName)[index]
				
				
				//--using last()
				
				//-->(//tagName[@attribute='value'])[last()]
				//-->(//tagName[@attribute='value'])[last()-1]
				//-->(//tagName[@attribute='value'])[last()-2]
				//--->example-->(//td[@class='navFooterDescItem'])[last()-4]
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				//-->Select the parent node
				
				
				//-->//tagName[@attribute='value']/parent::parenttagName
				
				
				
				//-->Select the child node
				
				
				//-->//tagName[@attribute='value']/child::childtagName
						
				
				//-->example--//div[@class='navFooterVerticalRow navAccessibility']/child::div
				

		
		

	}

}
