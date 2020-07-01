package com.ryder.online.helper.managers;

import org.openqa.selenium.WebDriver;

import com.ryder.online.pages.pageactions.JDAHomePageActions;
import com.ryder.online.pages.pageactions.JDALoginPageActions;
import com.ryder.online.pages.pageactions.RyderControlTowerHomePageActions;
import com.ryder.online.pages.pageactions.RyderControlTowerLoginPageActions;
import com.ryder.online.pages.pageactions.RyderEntryOnlineHomePageActions;
import com.ryder.online.pages.pageactions.RyderEntryOnlineLoginPageActions;
import com.ryder.online.pages.pageactions.TransportationManagerHomePageActions;
import com.ryder.online.pages.pageactions.TransportationManagerLoginPageActions;

public class PageObjectManager {

	private WebDriver driver;
	private RyderEntryOnlineHomePageActions ryderEntryHomeActions;
	private TransportationManagerHomePageActions TM_homeActions;
	private RyderEntryOnlineLoginPageActions ryderEntryLoginActions; 
	private TransportationManagerLoginPageActions TM_loginActions;
	private RyderControlTowerLoginPageActions ryderControlTowerLoginActions;
	private RyderControlTowerHomePageActions ryderControlTowerHomePageActions;
	private JDAHomePageActions jdaHomePageActions;
	private JDALoginPageActions jdaLoginPageActions;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}


	public RyderEntryOnlineHomePageActions getRyderEntryOnlineHomePageActions(){
		return (ryderEntryHomeActions == null) ? ryderEntryHomeActions = new RyderEntryOnlineHomePageActions(driver) : ryderEntryHomeActions;

	}

	public TransportationManagerHomePageActions getTransportationManagerHompePageActions() {
		return (TM_homeActions==null)? TM_homeActions=new TransportationManagerHomePageActions(driver): TM_homeActions;
		
	}


	public RyderEntryOnlineLoginPageActions getRyderEntryOnlineLoginPageActions() {
		// TODO Auto-generated method stub
		return (ryderEntryLoginActions==null)? ryderEntryLoginActions=new RyderEntryOnlineLoginPageActions(driver): ryderEntryLoginActions;
	}


	public TransportationManagerLoginPageActions getTransportationManagerLoginPageActions() {
		// TODO Auto-generated method stub
		return (TM_loginActions==null)? TM_loginActions=new TransportationManagerLoginPageActions(driver): TM_loginActions;
	}


	public RyderControlTowerLoginPageActions getRyderControlTowerLoginPageActions() {
		// TODO Auto-generated method stub
		return (ryderControlTowerLoginActions==null)? ryderControlTowerLoginActions=new RyderControlTowerLoginPageActions(driver): ryderControlTowerLoginActions;
	}


	public RyderControlTowerHomePageActions getRyderControlTowerHOmePageActions() {
		// TODO Auto-generated method stub
		return (ryderControlTowerHomePageActions==null)? ryderControlTowerHomePageActions=new RyderControlTowerHomePageActions(driver): ryderControlTowerHomePageActions;
	}


	public JDALoginPageActions getJDALoginPageActions() {
		// TODO Auto-generated method stub
		return (jdaLoginPageActions==null)? jdaLoginPageActions=new JDALoginPageActions(driver): jdaLoginPageActions;
	}


	public JDAHomePageActions getJDAHomePageActions() {
		// TODO Auto-generated method stub
		return (jdaHomePageActions==null)? jdaHomePageActions=new JDAHomePageActions(driver): jdaHomePageActions;
	}
}
