package purchase_CreateNewReq;

import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentReports;
import common_Function.RW;

public class CreateNewRequisition extends RW{

	private static ExtentReports report;
	public synchronized static ExtentReports getReporter(String filePath) { 
	    if (report == null) {
	        report = new ExtentReports(path.concat("Report.html"));
	      
	        report
	            .addSystemInfo("Host Name", "shailesh") 
	            .addSystemInfo("Environment", "QA");
	    }
	    
	    return report;
	}
	

	
	
	public void createnewreq(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

	     ArrayList<Row> row= OR_Purchase_m.searchSheet("CreateNewReqsn",0,9);// functionkey,excel sheet no. , function key column no.
	    ArrayList<Row> row1=input_purc_m.searchSheet("CreateNewReqsn", 0,0);// functn key, sheet no. Function key column no
	 	
	    
	    
	    
	    
	    
			for(int i=0;i<row.size();i++)
			{
				String strValue=""; 
				String strControl=row.get(i).getCell(2).getStringCellValue();
				 for(int j=0;j<row1.size();j++)
				 {
					 if(row.get(i).getCell(0)!=null)
						{
						
						 	if(row1.get(j).getCell(1)!=null)
							{
							  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
							  {
								  strValue=row1.get(j).getCell(2).toString();
								  
								  switch(row1.get(j).getCell(2).getCellTypeEnum()){
								     
								     case NUMERIC: 
								    	 strValue=String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
								    	 break;
								     case STRING:
								    	 strValue=row1.get(j).getCell(2).getStringCellValue();
								    	 break;
								     case BOOLEAN:
								    	 strValue=String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
								    	 break;
								     default:
								    	 strValue=row1.get(j).getCell(2).getStringCellValue();
								    	 break;
								     }
								     
							  }
							}
						}
				 
				 }
				 
				
					
					if(row.get(i).getCell(10)!=null)
					{
							
						
						String strControlTypeKey=row.get(i).getCell(10).toString();

						if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
							if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
								click_element(driver, "xpath", strControl); 
								Thread.sleep(2000);
							}

							if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
							
								dropdown(driver, "xpath", strControl, strValue);
								Thread.sleep(2000);
							
								
							}

							if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
								sendkeys(driver, "xpath", strControl, strValue); 
								Thread.sleep(2000);
							}

							if (strControlTypeKey.compareTo("Alert_accept") == 0) {
								click_element(driver, "xpath", strControl); 
								Alert(driver);
								Thread.sleep(2000);
							}
							if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
								driver.get(strValue); 
								Thread.sleep(2000);

							}

							
							if (strControlTypeKey.compareTo("WindowSwitch_Ctrl") == 0) {

								click_element(driver, "xpath", strControl);
							 WindowSwitchto(driver);
							 Thread.sleep(2000);
							}

							
							if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
								clear_element(driver, "xpath", strControl); 																										
								Thread.sleep(2000);
							}

							if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
								 gettext(driver, "xpath", strControl, row.get(i + 1).getCell(2).getStringCellValue());
			                      Thread.sleep(6000);
								}
							if (strControlTypeKey.compareTo("DropdownCheckBox_Ctrl") == 0) {

								dropdownCheckbox(driver, "xpath", strControl,strControl,strControl);
			                      Thread.sleep(2000);
							}
							if (strControlTypeKey.compareTo("FrameSwitch_Ctrl") == 0) {

							 frameSwitchto(driver, "xpath", strControl);
			                      Thread.sleep(2000);
							
					}
							if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
							uploadFile(driver,"xpath", strControl, strControl,strValue, strControl, strControl);
							   Thread.sleep(2000);
								
							}
							
							if (strControlTypeKey.compareTo("GetAttribute_Ctrl") == 0) {

								 getAttribute(driver, "xpath", strValue, row.get(i + 1).getCell(2).getStringCellValue());
			                      Thread.sleep(6000);
								}
					}
			}
			}
			}
	
	

		
	




	public void EditRequisition(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;
		 
		 ArrayList<Row> row= OR_Purchase_m.searchSheet("EditRequisition",0,9);
		    ArrayList<Row> row1=input_purc_m.searchSheet("EditRequisition", 0,0);
		 	
		    
		    
		    
		    
		    
				for(int i=0;i<row.size();i++)
				{
					String strValue=""; 
					String strControl=row.get(i).getCell(2).getStringCellValue();
					 for(int j=0;j<row1.size();j++)
					 {
						 if(row.get(i).getCell(0)!=null)
							{
							
							 	if(row1.get(j).getCell(1)!=null)
								{
								  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
								  {
									  strValue=row1.get(j).getCell(2).toString();
									  
									  switch(row1.get(j).getCell(2).getCellTypeEnum()){
									     
									     case NUMERIC: 
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
									    	 break;
									     case STRING:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     case BOOLEAN:
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
									    	 break;
									     default:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     }
									     
								  }
								}
							}
					 
					 }
					 
					
						
						if(row.get(i).getCell(10)!=null)
						{
								
							
							String strControlTypeKey=row.get(i).getCell(10).toString();

							if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
								if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
									click_element(driver, "xpath", strControl); 
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
							
									dropdown(driver, "xpath", strControl, strValue);
									Thread.sleep(2000);
							
									
								}

								if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
									sendkeys(driver, "xpath", strControl, strValue); 
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Alert_accept") == 0) {
									click_element(driver, "xpath", strControl); 
									Alert(driver);
									Thread.sleep(2000);
								}
								if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
									driver.get(strValue); 
									Thread.sleep(2000);

								}

								
								if (strControlTypeKey.compareTo("WindowSwitch_Ctrl") == 0) {

									click_element(driver, "xpath", strControl);
								 WindowSwitchto(driver);
								 Thread.sleep(2000);
								}

								
								if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
									clear_element(driver, "xpath", strControl); 																										
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
									 gettext(driver, "xpath", strControl, row.get(i + 1).getCell(2).getStringCellValue());
				                      Thread.sleep(6000);
									}
								if (strControlTypeKey.compareTo("DropdownCheckBox_Ctrl") == 0) {

									dropdownCheckbox(driver, "xpath", strControl,strControl,strControl);
				                      Thread.sleep(2000);
								}
								if (strControlTypeKey.compareTo("FrameSwitch_Ctrl") == 0) {

								 frameSwitchto(driver, "xpath", strControl);
				                      Thread.sleep(2000);
								
						}
								if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
								uploadFile(driver,"xpath", strControl, strControl,strValue, strControl, strControl);
								   Thread.sleep(2000);
									
								}
								
								if (strControlTypeKey.compareTo("GetAttribute_Ctrl") == 0) {

									 getAttribute(driver, "xpath", strValue, row.get(i + 1).getCell(2).getStringCellValue());
				                      Thread.sleep(6000);
									}
						}
				}
				}
				}
		


	public void RequisitionItems(WebDriver driver1) throws Exception {  

		WebDriver driver = driver1;
		 
		 ArrayList<Row> row= OR_Purchase_m.searchSheet("RequisitionItems",0,9);
		    ArrayList<Row> row1=input_purc_m.searchSheet("RequisitionItems", 0,0);
		 	
		    
		    
				for(int i=0;i<row.size();i++)
				{
					String strValue=""; 
					String strControl=row.get(i).getCell(2).getStringCellValue();
					 for(int j=0;j<row1.size();j++)
					 {
						 if(row.get(i).getCell(0)!=null)
							{
							
							 	if(row1.get(j).getCell(1)!=null)
								{
								  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
								  {
									  strValue=row1.get(j).getCell(2).toString();
									  
									  switch(row1.get(j).getCell(2).getCellTypeEnum()){
									     
									     case NUMERIC: 
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
									    	 break;
									     case STRING:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     case BOOLEAN:
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
									    	 break;
									     default:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     }
									     
								  }
								}
							}
					 
					 }
					 
					
						
						if(row.get(i).getCell(10)!=null)
						{
								
							
							String strControlTypeKey=row.get(i).getCell(10).toString();

							if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
								if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
									click_element(driver, "xpath", strControl); 
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
								
									dropdown(driver, "xpath", strControl, strValue);
									Thread.sleep(2000);
								
									
								}

								if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
									sendkeys(driver, "xpath", strControl, strValue); 
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Alert_accept") == 0) {
									click_element(driver, "xpath", strControl); 
									Alert(driver);
									Thread.sleep(2000);
								}
								if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
									driver.get(strValue); 
									Thread.sleep(2000);

								}

								
								if (strControlTypeKey.compareTo("WindowSwitch_Ctrl") == 0) {

									click_element(driver, "xpath", strControl);
								 WindowSwitchto(driver);
								 Thread.sleep(2000);
								}

								
								if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
									clear_element(driver, "xpath", strControl); 																										
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
									 gettext(driver, "xpath", strControl, row.get(i + 1).getCell(2).getStringCellValue());
				                      Thread.sleep(6000);
									}
								if (strControlTypeKey.compareTo("DropdownCheckBox_Ctrl") == 0) {

									dropdownCheckbox(driver, "xpath", strControl,strControl,strControl);
				                      Thread.sleep(2000);
								}
								if (strControlTypeKey.compareTo("FrameSwitch_Ctrl") == 0) {

								 frameSwitchto(driver, "xpath", strControl);
				                      Thread.sleep(2000);
								
						}
								if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
								uploadFile(driver,"xpath", strControl, strControl,strValue, strControl, strControl);
								   Thread.sleep(2000);
									
								}
								
								if (strControlTypeKey.compareTo("GetAttribute_Ctrl") == 0) {

									 getAttribute(driver, "xpath", strValue, row.get(i + 1).getCell(2).getStringCellValue());
				                      Thread.sleep(6000);
									}
						}
				}
				}
				}
	
	public void AddItems(WebDriver driver1) throws Exception {  

		WebDriver driver = driver1;
		
		 ArrayList<Row> row= OR_Purchase_m.searchSheet("AddItems",0,9);
		    ArrayList<Row> row1=input_purc_m.searchSheet("AddItems", 0,0);
		 	
		    
		    
				for(int i=0;i<row.size();i++)
				{
					String strValue=""; 
					String strControl=row.get(i).getCell(2).getStringCellValue();
					 for(int j=0;j<row1.size();j++)
					 {
						 if(row.get(i).getCell(0)!=null)
							{
							
							 	if(row1.get(j).getCell(1)!=null)
								{
								  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
								  {
									  strValue=row1.get(j).getCell(2).toString();
									  
									  switch(row1.get(j).getCell(2).getCellTypeEnum()){
									     
									     case NUMERIC: 
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
									    	 break;
									     case STRING:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     case BOOLEAN:
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
									    	 break;
									     default:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     }
									     
								  }
								}
							}
					 
					 }
					 
					
						
						if(row.get(i).getCell(10)!=null)
						{
								
							
							String strControlTypeKey=row.get(i).getCell(10).toString();

							if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
								if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
									click_element(driver, "xpath", strControl); 
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
							
									dropdown(driver, "xpath", strControl, strValue);
									Thread.sleep(2000);
								
									
								}

								if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
									sendkeys(driver, "xpath", strControl, strValue); 
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Alert_accept") == 0) {
									click_element(driver, "xpath", strControl); 
									Alert(driver);
									Thread.sleep(2000);
								}
								if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
									driver.get(strValue); 
									Thread.sleep(2000);

								}

								
								if (strControlTypeKey.compareTo("WindowSwitch_Ctrl") == 0) {

									click_element(driver, "xpath", strControl);
								 WindowSwitchto(driver);
								 Thread.sleep(2000);
								}

								
								if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
									clear_element(driver, "xpath", strControl); 																										
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
									 gettext(driver, "xpath", strControl, row.get(i + 1).getCell(2).getStringCellValue());
				                      Thread.sleep(6000);
									}
								if (strControlTypeKey.compareTo("DropdownCheckBox_Ctrl") == 0) {

									dropdownCheckbox(driver, "xpath", strControl,strControl,strControl);
				                      Thread.sleep(2000);
								}
								if (strControlTypeKey.compareTo("FrameSwitch_Ctrl") == 0) {

								 frameSwitchto(driver, "xpath", strControl);
				                      Thread.sleep(2000);
								
						}
								if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
								uploadFile(driver,"xpath", strControl, strControl,strValue, strControl, strControl);
								   Thread.sleep(2000);
									
								}
								
								if (strControlTypeKey.compareTo("GetAttribute_Ctrl") == 0) {

									 getAttribute(driver, "xpath", strValue, row.get(i + 1).getCell(2).getStringCellValue());
				                      Thread.sleep(6000);
									}
						}
				}
				}
				}
	
		public void Search(WebDriver driver1) throws Exception {  

			WebDriver driver = driver1;	
			
			 ArrayList<Row> row= OR_Purchase_m.searchSheet("Search",0,9);
			    ArrayList<Row> row1=input_purc_m.searchSheet("Search", 0,0);
			 	
			    
			    
				for(int i=0;i<row.size();i++)
				{
					String strValue=""; 
					String strControl=row.get(i).getCell(2).getStringCellValue();
					 for(int j=0;j<row1.size();j++)
					 {
						 if(row.get(i).getCell(0)!=null)
							{
							
							 	if(row1.get(j).getCell(1)!=null)
								{
								  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
								  {
									  strValue=row1.get(j).getCell(2).toString();
									  
									  switch(row1.get(j).getCell(2).getCellTypeEnum()){
									     
									     case NUMERIC: 
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
									    	 break;
									     case STRING:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     case BOOLEAN:
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
									    	 break;
									     default:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     }
									     
								  }
								}
							}
					 
					 }
					 
					
						
						if(row.get(i).getCell(10)!=null)
						{
								
							
							String strControlTypeKey=row.get(i).getCell(10).toString();

							if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
								if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
									click_element(driver, "xpath", strControl); 
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
							
									dropdown(driver, "xpath", strControl, strValue);
									Thread.sleep(2000);
								
									
								}

								if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
									sendkeys(driver, "xpath", strControl, strValue); 
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Alert_accept") == 0) {
									click_element(driver, "xpath", strControl); 
									Alert(driver);
									Thread.sleep(2000);
								}
								if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
									driver.get(strValue); 
									Thread.sleep(2000);

								}

								
								if (strControlTypeKey.compareTo("WindowSwitch_Ctrl") == 0) {

									click_element(driver, "xpath", strControl);
								 WindowSwitchto(driver);
								 Thread.sleep(2000);
								}

								
								if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
									clear_element(driver, "xpath", strControl); 																										
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
									 gettext(driver, "xpath", strControl, row.get(i + 1).getCell(2).getStringCellValue());
				                      Thread.sleep(6000);
									}
								if (strControlTypeKey.compareTo("DropdownCheckBox_Ctrl") == 0) {

									dropdownCheckbox(driver, "xpath", strControl,strControl,strControl);
				                      Thread.sleep(2000);
								}
								if (strControlTypeKey.compareTo("FrameSwitch_Ctrl") == 0) {

								 frameSwitchto(driver, "xpath", strControl);
				                      Thread.sleep(2000);
								
						}
								if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
								uploadFile(driver,"xpath", strControl, strControl,strValue, strControl, strControl);
								   Thread.sleep(2000);
									
								}
								
								if (strControlTypeKey.compareTo("GetAttribute_Ctrl") == 0) {

									 getAttribute(driver, "xpath", strValue, row.get(i + 1).getCell(2).getStringCellValue());
				                      Thread.sleep(6000);
									}
						}
				}
				}
				}
	public void Edititems(WebDriver driver1) throws Exception {  

		WebDriver driver = driver1;
		
		 ArrayList<Row> row= OR_Purchase_m.searchSheet("Edititems",0,9);
		    ArrayList<Row> row1=input_purc_m.searchSheet("Edititems", 0,0);
		 	
		    
		    
				for(int i=0;i<row.size();i++)
				{
					String strValue=""; 
					String strControl=row.get(i).getCell(2).getStringCellValue();
					 for(int j=0;j<row1.size();j++)
					 {
						 if(row.get(i).getCell(0)!=null)
							{
							
							 	if(row1.get(j).getCell(1)!=null)
								{
								  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
								  {
									  strValue=row1.get(j).getCell(2).toString();
									  
									  switch(row1.get(j).getCell(2).getCellTypeEnum()){
									     
									     case NUMERIC: 
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
									    	 break;
									     case STRING:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     case BOOLEAN:
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
									    	 break;
									     default:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     }
									     
								  }
								}
							}
					 
					 }
					 
					
						
						if(row.get(i).getCell(10)!=null)
						{
								
							
							String strControlTypeKey=row.get(i).getCell(10).toString();

							if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
								if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
									click_element(driver, "xpath", strControl); 
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
								
									dropdown(driver, "xpath", strControl, strValue);
									Thread.sleep(2000);
								
									
								}

								if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
									sendkeys(driver, "xpath", strControl, strValue); 
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Alert_accept") == 0) {
									click_element(driver, "xpath", strControl); 
									Alert(driver);
									Thread.sleep(2000);
								}
								if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
									driver.get(strValue); 
									Thread.sleep(2000);

								}

								
								if (strControlTypeKey.compareTo("WindowSwitch_Ctrl") == 0) {

									click_element(driver, "xpath", strControl);
								 WindowSwitchto(driver);
								 Thread.sleep(2000);
								}

								
								if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
									clear_element(driver, "xpath", strControl); 																										
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
									 gettext(driver, "xpath", strControl, row.get(i + 1).getCell(2).getStringCellValue());
				                      Thread.sleep(6000);
									}
								if (strControlTypeKey.compareTo("DropdownCheckBox_Ctrl") == 0) {

									dropdownCheckbox(driver, "xpath", strControl,strControl,strControl);
				                      Thread.sleep(2000);
								}
								if (strControlTypeKey.compareTo("FrameSwitch_Ctrl") == 0) {

								 frameSwitchto(driver, "xpath", strControl);
				                      Thread.sleep(2000);
								
						}
								if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
								uploadFile(driver,"xpath", strControl, strControl,strValue, strControl, strControl);
								   Thread.sleep(2000);
									
								}
								
								if (strControlTypeKey.compareTo("GetAttribute_Ctrl") == 0) {

									 getAttribute(driver, "xpath", strValue, row.get(i + 1).getCell(2).getStringCellValue());
				                      Thread.sleep(6000);
									}
						}
				}
				}
				}
	
	public void PurchaseQuestionnaire(WebDriver driver1) throws Exception {  

		WebDriver driver = driver1;
		 ArrayList<Row> row= OR_Purchase_m.searchSheet("PurchaseQuestionnaire",0,9);
		    ArrayList<Row> row1=input_purc_m.searchSheet("PurchaseQuestionnaire", 0,0);
		 	
		    
		    
		    
				for(int i=0;i<row.size();i++)
				{
					String strValue=""; 
					String strControl=row.get(i).getCell(2).getStringCellValue();
					 for(int j=0;j<row1.size();j++)
					 {
						 if(row.get(i).getCell(0)!=null)
							{
							
							 	if(row1.get(j).getCell(1)!=null)
								{
								  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
								  {
									  strValue=row1.get(j).getCell(2).toString();
									  
									  switch(row1.get(j).getCell(2).getCellTypeEnum()){
									     
									     case NUMERIC: 
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
									    	 break;
									     case STRING:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     case BOOLEAN:
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
									    	 break;
									     default:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     }
									     
								  }
								}
							}
					 
					 }
					 
					
						
						if(row.get(i).getCell(10)!=null)
						{
								
							
							String strControlTypeKey=row.get(i).getCell(10).toString();

							if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
								if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
									click_element(driver, "xpath", strControl); 
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
							
									dropdown(driver, "xpath", strControl, strValue);
									Thread.sleep(2000);
								
									
								}

								if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
									sendkeys(driver, "xpath", strControl, strValue); 
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Alert_accept") == 0) {
									click_element(driver, "xpath", strControl); 
									Alert(driver);
									Thread.sleep(2000);
								}
								if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
									driver.get(strValue); 
									Thread.sleep(2000);

								}

								
								if (strControlTypeKey.compareTo("WindowSwitch_Ctrl") == 0) {

									click_element(driver, "xpath", strControl);
								 WindowSwitchto(driver);
								 Thread.sleep(2000);
								}

								
								if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
									clear_element(driver, "xpath", strControl); 																										
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
									 gettext(driver, "xpath", strControl, row.get(i + 1).getCell(2).getStringCellValue());
				                      Thread.sleep(6000);
									}
								if (strControlTypeKey.compareTo("DropdownCheckBox_Ctrl") == 0) {

									dropdownCheckbox(driver, "xpath", strControl,strControl,strControl);
				                      Thread.sleep(2000);
								}
								if (strControlTypeKey.compareTo("FrameSwitch_Ctrl") == 0) {

								 frameSwitchto(driver, "xpath", strControl);
				                      Thread.sleep(2000);
								
						}
								if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
								uploadFile(driver,"xpath", strControl, strControl,strValue, strControl, strControl);
								   Thread.sleep(2000);
									
								}
								
								if (strControlTypeKey.compareTo("GetAttribute_Ctrl") == 0) {

									 getAttribute(driver, "xpath", strValue, row.get(i + 1).getCell(2).getStringCellValue());
				                      Thread.sleep(6000);
									}
						}
				}
				}
				}
	
	
	public void Attachment(WebDriver driver1) throws Exception {  

		WebDriver driver = driver1;

		
		 ArrayList<Row> row= OR_Purchase_m.searchSheet("Attachment",0,9);
		    ArrayList<Row> row1=input_purc_m.searchSheet("Attachment", 0,0);
		 	
		    
		    
		    
		    
				for(int i=0;i<row.size();i++)
				{
					String strValue=""; 
					String strControl=row.get(i).getCell(2).getStringCellValue();
					 for(int j=0;j<row1.size();j++)
					 {
						 if(row.get(i).getCell(0)!=null)
							{
							
							 	if(row1.get(j).getCell(1)!=null)
								{
								  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
								  {
									  strValue=row1.get(j).getCell(2).toString();
									  
									  switch(row1.get(j).getCell(2).getCellTypeEnum()){
									     
									     case NUMERIC: 
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
									    	 break;
									     case STRING:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     case BOOLEAN:
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
									    	 break;
									     default:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     }
									     
								  }
								}
							}
					 
					 }
					 
					
						
						if(row.get(i).getCell(10)!=null)
						{
								
							
							String strControlTypeKey=row.get(i).getCell(10).toString();

							if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
								if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
									click_element(driver, "xpath", strControl); 
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
								
									dropdown(driver, "xpath", strControl, strValue);
									Thread.sleep(2000);
																
								}

								if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
									sendkeys(driver, "xpath", strControl, strValue); 
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Alert_accept") == 0) {
									click_element(driver, "xpath", strControl); 
									Alert(driver);
									Thread.sleep(2000);
								}
								if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
									driver.get(strValue); 
									Thread.sleep(2000);

								}

								
								if (strControlTypeKey.compareTo("WindowSwitch_Ctrl") == 0) {

									click_element(driver, "xpath", strControl);
								 WindowSwitchto(driver);
								 Thread.sleep(2000);
								}

								
								if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
									clear_element(driver, "xpath", strControl); 																										
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
									 gettext(driver, "xpath", strControl, row.get(i + 1).getCell(2).getStringCellValue());
				                      Thread.sleep(6000);
									}
								if (strControlTypeKey.compareTo("DropdownCheckBox_Ctrl") == 0) {

									dropdownCheckbox(driver, "xpath", strControl,strControl,strControl);
				                      Thread.sleep(2000);
								}
								if (strControlTypeKey.compareTo("FrameSwitch_Ctrl") == 0) {

								 frameSwitchto(driver, "xpath", strControl);
				                      Thread.sleep(2000);
								
						}
								if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
								uploadFile(driver,"xpath", strControl, strControl,strValue, strControl, strControl);
								   Thread.sleep(2000);
									
								}
								
								if (strControlTypeKey.compareTo("GetAttribute_Ctrl") == 0) {

									 getAttribute(driver, "xpath", strValue, row.get(i + 1).getCell(2).getStringCellValue());
				                      Thread.sleep(6000);
									}
						}
				}
				}
				}}