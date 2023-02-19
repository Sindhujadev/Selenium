package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		List<WebElement> f = driver.findElements(By.className("a-price-whole"));
		
		List<Integer> a=new ArrayList<Integer>();
		
		for(WebElement e:f) {
			String t = e.getText();
			String t1 = t.replaceAll(",","");
//			a.add(t1);
//			System.out.println(a);
			if(!t1.isEmpty()) {
			
			int p=Integer.parseInt(t1);
			a.add(p);
			
			}
		
		}
		Collections.sort(a);
		System.out.println(a);
		System.out.println(a.get(0));
		
		
	driver.close();
	}

}
