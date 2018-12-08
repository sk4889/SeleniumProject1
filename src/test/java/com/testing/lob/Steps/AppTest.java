package com.testing.lob.Steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.testing.lob.property.PropertyClass;

import cucumber.api.java.pt.E;
import edu.emory.mathcs.backport.java.util.Arrays;


public class AppTest 
{
    
	public static WebDriver driver;
	PropertyClass pc = new PropertyClass();
	
    /*@SuppressWarnings("resource")
	public void launch() throws IOException{
    	//System.out.println("starting..");
    	driver = new FirefoxDriver(); 
    	//driver.get("https://www.magicbricks.com/");
    	driver.get("https://www.snapdeal.com/");
    	driver.manage().window().maximize();
    	//Scanner sc = new Scanner(System.in);
    	//System.out.println("Please enter Location, Project or Landmark....");
    	//String input = sc.nextLine();
    	//System.out.println(input);
    	//driver.findElement(By.xpath("/html/body/header/div/div/a[@title='magicbricks.com']")).click();
    	//driver.findElement(By.xpath("//input[@id='keyword']")).sendKeys("bangalore university layout, bangalore");
    	//driver.findElement(By.xpath("//div[@title='Sarjapur Road']")).click();
    	//driver.findElement(By.xpath("/html/body/div[7]/div[4]/div/div[2]/div[2]/form/div/div[4]/input[@id='btnPropertySearch']")).click();
    	//driver.findElement(By.xpath("//input[@id='btnPropertySearch']")).click();
    	//String path = System.getProperty("user.dir") + "\\Resources\\Credentials.xls";
    	//System.out.println(path);
    	FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\Resources\\Credentials.xls");
    	System.out.println(fis);
    	
    		
    	HSSFWorkbook wb = new HSSFWorkbook(fis);
    	if(fis!=null){
    		System.out.println("conn successfull");
    	}
    	
    	HSSFSheet sheet = wb.getSheet("Sheet1");    	
    	HSSFRow row = sheet.getRow(0);    	
    	String cell = row.getCell(0).getStringCellValue();    	    	
    	driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys(cell);
    	driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
    	//String title = driver.switchTo().frame("google_ads_iframe_/129473952/CLP_Desktop_0").getTitle();
    	
    	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    	driver.findElement(By.xpath("//img[@src='https://n1.sdlcdn.com/imgs/h/n/0/230X258_sharpened/stech-32GB-USB-3-0-SDL567794879-1-88f15.jpeg']")).click();
    	String currentwindow = driver.getWindowHandle();
    	
    	for (String str : driver.getWindowHandles())
    	{
    		System.out.println(str);
    		driver.switchTo().window(str);        	
    	}
    	driver.findElement(By.xpath("//span[contains(text(), 'add to cart')]")).click();
    	driver.switchTo().window(currentwindow);
    }*/
    
    public void closeConn(){ 
    	
    	driver.quit();
    }
    
    
    /*public static void main(String[] args) throws IOException {
		AppTest at = new AppTest();
		at.launch();
		//at.closeConn();
	}*/
    
    
    public void launchStep() throws IOException{
    	driver = new FirefoxDriver(); 
    	//driver.get("https://www.magicbricks.com/");
    	//driver.get("https://www.snapdeal.com/");
    	driver.get(pc.getPropertyFile("urlofPortal"));
    	driver.manage().window().maximize();
    }
    
public void productSelectionStep() throws IOException{
	//FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\Resources\\Credentials.xls");
	//System.out.println("HI......" + pc.getPropertyFile("filePath"));
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + pc.getPropertyFile("filePath"));
	System.out.println(fis);
			
	HSSFWorkbook wb = new HSSFWorkbook(fis);
	if(fis!=null){
		System.out.println("conn successfull");
	}
	
	//HSSFSheet sheet = wb.getSheet("Sheet1");  
	HSSFSheet sheet = wb.getSheet(pc.getPropertyFile("sheetName"));  
	HSSFRow row = sheet.getRow(0);    	
	String cellvalue = row.getCell(0).getStringCellValue();    	    	
	//driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys(cellvalue);
	driver.findElement(By.xpath(pc.getPropertyFile("searchField"))).sendKeys(cellvalue);
	}

    
public void clickStep() throws IOException{
	//driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
	//WebDriverWait wait= new WebDriverWait(driver, 10);
	//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='inputValEnter']"))));
	//driver.switchTo().frame("");
	driver.findElement(By.xpath(pc.getPropertyFile("searchButton"))).click();
}

public void selectStep() throws IOException, AWTException{
	//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	//driver.findElement(By.xpath("//img[@src='https://n1.sdlcdn.com/imgs/h/n/0/230X258_sharpened/stech-32GB-USB-3-0-SDL567794879-1-88f15.jpeg']")).click();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath(pc.getPropertyFile("productSelect"))).click();
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_0);
	robot.keyRelease(KeyEvent.VK_0);
	try {
	WebDriverWait wait = new WebDriverWait(driver, 5);
    wait.until(ExpectedConditions.alertIsPresent());
	Alert a = driver.switchTo().alert();
	a.dismiss();
	a.accept();
	a.getText();
	} catch(Exception e){}
}

public void addtocart() throws IOException{
	String currentwindow = driver.getWindowHandle();
	
	for (String str : driver.getWindowHandles())
	{
		System.out.println(str);
		driver.switchTo().window(str);        	
	}
	driver.findElement(By.xpath(pc.getPropertyFile("addtoCart"))).click();
	driver.switchTo().window(currentwindow);
}
	
public void tryList(){
	ArrayList<Integer> al = new ArrayList<Integer>();
	LinkedList<Integer> l = new LinkedList<Integer>();
	
	l.add(10);
	l.add(2);
	l.add(2);
	al.add(3);
	al.add(1);
	
	Stack<String> stack = new Stack<String>();  
	stack.push("Ayush");  
	stack.push("Garvit");  
	stack.push("Amit");  
	stack.push("Ashish");  
	stack.push("Garima");  
	//stack.pop();  
	/*Object[] stackString = stack.toArray();
	for (Object val : stackString) {System.out.println(val);}*/
		
	PriorityQueue<String> queue=new PriorityQueue<String>();  
	queue.add("Amit Sharma");  
	queue.add("Vijay Raj");  
	queue.add("JaiShankar");  
	queue.add("Raj");
	//queue.add(null);
	Iterator<String> itr = stack.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
		
	}
	}
public static void main(String[] args) {
	AppTest at = new AppTest();
	at.tryList();
}
}
	

