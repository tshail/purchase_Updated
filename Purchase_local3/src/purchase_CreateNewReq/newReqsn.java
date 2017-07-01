package purchase_CreateNewReq;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class newReqsn extends RW{

	
	
	private static ExtentReports report;
	public synchronized static ExtentReports getReporter(String filePath) { 
	    if (report == null) {
	        report = new ExtentReports(path.concat("Report.html"));
	      
	        report
	            .addSystemInfo("Host Name", "Reshma") 
	            .addSystemInfo("Environment", "QA");
	    }
	    
	    return report;
	}
	
	
	// -----------------------------------------------------------"Supplier"-------------------------------------//
	

		public void search(WebDriver driver1) throws Exception {
				WebDriver driver = driver1;

			 ArrayList<Row> row= OR_Purchase_m.searchSheet("search",3,9);
				    ArrayList<Row> row1=input_purc_m.searchSheet("search", 1,0);

				    
				    
				    
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
										Thread.sleep(50000);
									}

									if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
									
										dropdown(driver, "xpath", strControl, strValue);
										Thread.sleep(10000);
									
										
									}

									if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
										sendkeys(driver, "xpath", strControl, strValue); 
										Thread.sleep(40000);
									}

									if (strControlTypeKey.compareTo("Alert_accept") == 0) {
										click_element(driver, "xpath", strControl); 
										Alert(driver);
										Thread.sleep(60000);
									}
									if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
										driver.get(strValue); 
										Thread.sleep(8000);

									}

									
									if (strControlTypeKey.compareTo("WindowSwitch_Ctrl") == 0) {

										click_element(driver, "xpath", strControl);
									 WindowSwitchto(driver);
									 Thread.sleep(60000);
									}

									
									if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
										clear_element(driver, "xpath", strControl); 																										
										Thread.sleep(60000);
									}

									if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
										 gettext(driver, "xpath", strControl, row.get(i + 1).getCell(2).getStringCellValue());
					                      Thread.sleep(8000);
										}
									if (strControlTypeKey.compareTo("DropdownCheckBox_Ctrl") == 0) {

										dropdownCheckbox(driver, "xpath", strControl,strControl,strControl);
					                      Thread.sleep(8000);
									}
									if (strControlTypeKey.compareTo("FrameSwitch_Ctrl") == 0) {

									 frameSwitchto(driver, "id", strControl);
					                      Thread.sleep(8000);
									
							}
									if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
									uploadFile(driver,"xpath", strControl, strControl,strValue, strControl, strControl);
									   Thread.sleep(8000);
										
									}
									
									if (strControlTypeKey.compareTo("Alert_dismiss") == 0) {
										//AlertDismiss(driver, "xpath", strControl); 
										AlertDismiss(driver);
										Thread.sleep(18000);
									}
									if (strControlTypeKey.compareTo("GetAttribute_Ctrl") == 0) {

										 getAttribute(driver, "xpath", strValue, row.get(i + 1).getCell(2).getStringCellValue());
					                      Thread.sleep(8000);
										}
							}
					}
					}
		}
		
		
		// -------------------------------Select "Buyer's Remarks - send remarks to the vessel"---------------------------------------//
		
		public void Remarks(WebDriver driver1) throws Exception {
					WebDriver driver = driver1;
					
					
					 ArrayList<Row> row= OR_Purchase_m.searchSheet("Remarks",3,9);
					    ArrayList<Row> row1=input_purc_m.searchSheet("Remarks",1,0);
					 	
					    
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
											Thread.sleep(10000);
										}

										if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
										
											dropdown(driver, "xpath", strControl, strValue);
											Thread.sleep(10000);
										
											
										}

										if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
											sendkeys(driver, "xpath", strControl, strValue); 
											Thread.sleep(50000);
										}

										if (strControlTypeKey.compareTo("Alert_accept") == 0) {
											click_element(driver, "xpath", strControl); 
											Alert(driver);
											Thread.sleep(8000);
										}
										if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
											driver.get(strValue); 
											Thread.sleep(8000);

										}

										
										if (strControlTypeKey.compareTo("WindowSwitch_Ctrl") == 0) {

											click_element(driver, "xpath", strControl);
										 WindowSwitchto(driver);
										 Thread.sleep(8000);
										}

										
										if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
											clear_element(driver, "xpath", strControl); 																										
											Thread.sleep(8000);
										}

										if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
											 gettext(driver, "xpath", strControl, row.get(i + 1).getCell(2).getStringCellValue());
						                      Thread.sleep(8000);
											}
										if (strControlTypeKey.compareTo("DropdownCheckBox_Ctrl") == 0) {

											dropdownCheckbox(driver, "xpath", strControl,strControl,strControl);
						                      Thread.sleep(8000);
										}
										if (strControlTypeKey.compareTo("FrameSwitch_Ctrl") == 0) {

										 frameSwitchto(driver, "id", strControl);
						                      Thread.sleep(8000);
						               
						                  
											}
										       
										if (strControlTypeKey.compareTo("Alert_dismiss") == 0) {
											//AlertDismiss(driver, "xpath", strControl); 
											AlertDismiss(driver);
											Thread.sleep(18000);
										}
								
										if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
										uploadFile(driver,"xpath", strControl, strControl,strValue, strControl, strControl);
										   Thread.sleep(8000);
											
										}
										
										
								}
						}
								}}
						

		
		
		
		// -------------------------------Hold to unhold---------------------------------------//
		
				public void holdtounhold(WebDriver driver1) throws Exception {
							WebDriver driver = driver1;
							
							
							 ArrayList<Row> row= OR_Purchase_m.searchSheet("holdtounhold",3,9);
							    ArrayList<Row> row1=input_purc_m.searchSheet("holdtounhold",1,0);
							 	
							    
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
													Thread.sleep(18000);
												}

												if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
												
													dropdown(driver, "xpath", strControl, strValue);
													Thread.sleep(10000);
												
													
												}

												if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
													sendkeys(driver, "xpath", strControl, strValue); 
													Thread.sleep(50000);
												}

												if (strControlTypeKey.compareTo("Alert_accept") == 0) {
													click_element(driver, "xpath", strControl); 
													Alert(driver);
													Thread.sleep(18000);
												}
												if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
													driver.get(strValue); 
													Thread.sleep(8000);

												}

												
												if (strControlTypeKey.compareTo("WindowSwitch_Ctrl") == 0) {

													click_element(driver, "xpath", strControl);
												 WindowSwitchto(driver);
												 Thread.sleep(8000);
												}

												
												if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
													clear_element(driver, "xpath", strControl); 																										
													Thread.sleep(8000);
												}

												if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
													 gettext(driver, "xpath", strControl, row.get(i + 1).getCell(2).getStringCellValue());
								                      Thread.sleep(8000);
													}
												if (strControlTypeKey.compareTo("DropdownCheckBox_Ctrl") == 0) {

													dropdownCheckbox(driver, "xpath", strControl,strControl,strControl);
								                      Thread.sleep(8000);
												}
												if (strControlTypeKey.compareTo("FrameSwitch_Ctrl") == 0) {

												 frameSwitchto(driver, "id", strControl);
								                      Thread.sleep(8000);
								               
								                     
												
													}
												if (strControlTypeKey.compareTo("Alert_dismiss") == 0) {
													//AlertDismiss(driver, "xpath", strControl); 
													AlertDismiss(driver);
													Thread.sleep(18000);
												}     
												
										
												if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
												uploadFile(driver,"xpath", strControl, strControl,strValue, strControl, strControl);
												   Thread.sleep(8000);
													
												}
												
												
										}
								}
										}}
				
				
				
				
				
				
				
				
				
				
				
				
				public void AllRemarks(WebDriver driver1) throws Exception {
					WebDriver driver = driver1;
					
					
					 ArrayList<Row> row= OR_Purchase_m.searchSheet("AllRemarks",3,9);
					    ArrayList<Row> row1=input_purc_m.searchSheet("AllRemarks",1,0);
					 	
					    
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
											Thread.sleep(18000);
										}

										if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
										
											dropdown(driver, "xpath", strControl, strValue);
											Thread.sleep(10000);
										
											
										}

										if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
											sendkeys(driver, "xpath", strControl, strValue); 
											Thread.sleep(50000);
										}

										if (strControlTypeKey.compareTo("Alert_accept") == 0) {
											click_element(driver, "xpath", strControl); 
											Alert(driver);
											Thread.sleep(18000);
										}
										if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
											driver.get(strValue); 
											Thread.sleep(8000);

										}

										
										if (strControlTypeKey.compareTo("WindowSwitch_Ctrl") == 0) {

											click_element(driver, "xpath", strControl);
										 WindowSwitchto(driver);
										 Thread.sleep(8000);
										}

										
										if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
											clear_element(driver, "xpath", strControl); 																										
											Thread.sleep(8000);
										}

										if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
											 gettext(driver, "xpath", strControl, row.get(i + 1).getCell(2).getStringCellValue());
						                      Thread.sleep(8000);
											}
										if (strControlTypeKey.compareTo("DropdownCheckBox_Ctrl") == 0) {

											dropdownCheckbox(driver, "xpath", strControl,strControl,strControl);
						                      Thread.sleep(8000);
										}
										if (strControlTypeKey.compareTo("FrameSwitch_Ctrl") == 0) {

										 frameSwitchto(driver, "id", strControl);
						                      Thread.sleep(8000);
						               
						                     
										
											}
										       
										if (strControlTypeKey.compareTo("Alert_dismiss") == 0) {
											//AlertDismiss(driver, "xpath", strControl); 
											AlertDismiss(driver);
											Thread.sleep(18000);
										}
								
										if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
										uploadFile(driver,"xpath", strControl, strControl,strValue, strControl, strControl);
										   Thread.sleep(8000);
											
										}
										
										
								}
						}
								}}

				
				
				public void DuplicateRequisition(WebDriver driver1) throws Exception {
					WebDriver driver = driver1;
					
					
					 ArrayList<Row> row= OR_Purchase_m.searchSheet("DuplicateRequisition",3,9);
					    ArrayList<Row> row1=input_purc_m.searchSheet("DuplicateRequisition",1,0);
					 	
					    
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
											Thread.sleep(18000);
										}

										if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
										
											dropdown(driver, "xpath", strControl, strValue);
											Thread.sleep(10000);
										
											
										}

										if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
											sendkeys(driver, "xpath", strControl, strValue); 
											Thread.sleep(50000);
										}

										if (strControlTypeKey.compareTo("Alert_accept") == 0) {
											click_element(driver, "xpath", strControl); 
											Alert(driver);
											Thread.sleep(18000);
										}
										if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
											driver.get(strValue); 
											Thread.sleep(8000);

										}

										
										if (strControlTypeKey.compareTo("WindowSwitch_Ctrl") == 0) {

											click_element(driver, "xpath", strControl);
										 WindowSwitchto(driver);
										 Thread.sleep(8000);
										}

										
										if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
											clear_element(driver, "xpath", strControl); 																										
											Thread.sleep(8000);
										}

										if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
											 gettext(driver, "xpath", strControl, row.get(i + 1).getCell(2).getStringCellValue());
						                      Thread.sleep(8000);
											}
										if (strControlTypeKey.compareTo("DropdownCheckBox_Ctrl") == 0) {

											dropdownCheckbox(driver, "xpath", strControl,strControl,strControl);
						                      Thread.sleep(8000);
										}
										if (strControlTypeKey.compareTo("FrameSwitch_Ctrl") == 0) {

										 frameSwitchto(driver, "id", strControl);
						                      Thread.sleep(8000);
						               
											}
										if (strControlTypeKey.compareTo("FrameSwitch_Ctrl1") == 0) {

											frameSwitchto1(driver, "id", strControl);
											 Thread.sleep(6000);
											
									}	       
										
								
										if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
										uploadFile(driver,"xpath", strControl, strControl,strValue, strControl, strControl);
										   Thread.sleep(8000);
											
										}

										if (strControlTypeKey.compareTo("Alert_dismiss") == 0) {
											//AlertDismiss(driver, "xpath", strControl); 
											AlertDismiss(driver);
											Thread.sleep(18000);
										}
										
								}
						}
								}}
						
				
				
				

				public void AddItemsfromOfficeside(WebDriver driver1) throws Exception {
					WebDriver driver = driver1;		
		
					
					
					 ArrayList<Row> row= OR_Purchase_m.searchSheet("AddItemsfromOfficeside",3,9);
					    ArrayList<Row> row1=input_purc_m.searchSheet("AddItemsfromOfficeside",1,0);
					 	
					    

					    
					    
					    
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
											 Thread.sleep(6000);
										}

										if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
										
											dropdown(driver, "xpath", strControl, strValue);
											 Thread.sleep(6000);
										
											
										}

										if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
											sendkeys(driver, "xpath", strControl, strValue); 
											 Thread.sleep(6000);
										}

										if (strControlTypeKey.compareTo("Alert_accept") == 0) {
											click_element(driver, "xpath", strControl); 
											Alert(driver);
											 Thread.sleep(6000);
										}
										if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
											driver.get(strValue); 
											 Thread.sleep(6000);

										}
										
										if (strControlTypeKey.compareTo("WindowSwitch_Ctrl") == 0) {

											click_element(driver, "xpath", strControl);
										 WindowSwitchto(driver);
										 Thread.sleep(6000);
										}

										
										if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
											clear_element(driver, "xpath", strControl); 																										
											 Thread.sleep(6000);
										}

										if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
											 gettext(driver, "xpath", strControl, row.get(i + 1).getCell(2).getStringCellValue());
											 Thread.sleep(6000);
											}
										if (strControlTypeKey.compareTo("DropdownCheckBox_Ctrl") == 0) {

											dropdownCheckbox(driver, "xpath", strControl,strControl,strControl);
											 Thread.sleep(6000);
										}
										if (strControlTypeKey.compareTo("FrameSwitch_Ctrl") == 0) {

										 frameSwitchto(driver, "id", strControl);
										 Thread.sleep(6000);
										
								}
										
										if (strControlTypeKey.compareTo("FrameSwitch_Ctrl1") == 0) {

											frameSwitchto1(driver, "id", strControl);
											 Thread.sleep(6000);
											
									}
										if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
										uploadFile(driver,"xpath", strControl, strControl,strValue, strControl, strControl);
										 Thread.sleep(6000);
											
										}
										
										if (strControlTypeKey.compareTo("GetAttribute_Ctrl") == 0) {

											 getAttribute(driver, "xpath", strValue, row.get(i + 1).getCell(2).getStringCellValue());
						                      Thread.sleep(6000);
											}
								}
						}
						}
						}
				
				

					
				public void Supplier(WebDriver driver1) throws Exception {
					WebDriver driver = driver1;		
		
					
					
					 ArrayList<Row> row= OR_Purchase_m.searchSheet("Supplier",3,9);
					    ArrayList<Row> row1=input_purc_m.searchSheet("Supplier",1,0);
					 	
					    

					    
					    
					    
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
											 Thread.sleep(6000);
										}

										if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
										
											dropdown(driver, "xpath", strControl, strValue);
											 Thread.sleep(6000);
										
											
										}

										if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
											sendkeys(driver, "xpath", strControl, strValue); 
											 Thread.sleep(6000);
										}

										if (strControlTypeKey.compareTo("Alert_accept") == 0) {
											click_element(driver, "xpath", strControl); 
											Alert(driver);
											 Thread.sleep(6000);
										}
										if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
											driver.get(strValue); 
											 Thread.sleep(6000);

										}
										
										if (strControlTypeKey.compareTo("WindowSwitch_Ctrl") == 0) {

											click_element(driver, "xpath", strControl);
										 WindowSwitchto(driver);
										 Thread.sleep(6000);
										}

										
										if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
											clear_element(driver, "xpath", strControl); 																										
											 Thread.sleep(6000);
										}

										if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
											 gettext(driver, "xpath", strControl, row.get(i + 1).getCell(2).getStringCellValue());
											 Thread.sleep(6000);
											}
										if (strControlTypeKey.compareTo("DropdownCheckBox_Ctrl") == 0) {

											dropdownCheckbox(driver, "xpath", strControl,strControl,strControl);
											 Thread.sleep(6000);
										}
										if (strControlTypeKey.compareTo("FrameSwitch_Ctrl") == 0) {

										 frameSwitchto(driver, "id", strControl);
										 Thread.sleep(6000);
										
								}
										
										if (strControlTypeKey.compareTo("FrameSwitch_Ctrl1") == 0) {

											frameSwitchto1(driver, "id", strControl);
											 Thread.sleep(6000);
											
									}
										if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
										uploadFile(driver,"xpath", strControl, strControl,strValue, strControl, strControl);
										 Thread.sleep(6000);
											
										}
										
										if (strControlTypeKey.compareTo("GetAttribute_Ctrl") == 0) {

											 getAttribute(driver, "xpath", strValue, row.get(i + 1).getCell(2).getStringCellValue());
						                      Thread.sleep(6000);
											}
								}
						}
						}
						}
				
				public void Addattachment(WebDriver driver1) throws Exception {
					WebDriver driver = driver1;		
		
					
					
					 ArrayList<Row> row= OR_Purchase_m.searchSheet("Addattachment",3,9);
					    ArrayList<Row> row1=input_purc_m.searchSheet("Addattachment",1,0);
					 	
					    

					    
					    
					    
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
											 Thread.sleep(6000);
										}

										if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
										
											dropdown(driver, "xpath", strControl, strValue);
											 Thread.sleep(6000);
										
											
										}

										if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
											sendkeys(driver, "xpath", strControl, strValue); 
											 Thread.sleep(6000);
										}

										if (strControlTypeKey.compareTo("Alert_accept") == 0) {
											click_element(driver, "xpath", strControl); 
											Alert(driver);
											 Thread.sleep(6000);
										}
										if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
											driver.get(strValue); 
											 Thread.sleep(6000);

										}
										
										if (strControlTypeKey.compareTo("WindowSwitch_Ctrl") == 0) {

											click_element(driver, "xpath", strControl);
										 WindowSwitchto(driver);
										 Thread.sleep(6000);
										}

										
										if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
											clear_element(driver, "xpath", strControl); 																										
											 Thread.sleep(6000);
										}

										if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
											 gettext(driver, "xpath", strControl, row.get(i + 1).getCell(2).getStringCellValue());
											 Thread.sleep(6000);
											}
										if (strControlTypeKey.compareTo("DropdownCheckBox_Ctrl") == 0) {

											dropdownCheckbox(driver, "xpath", strControl,strControl,strControl);
											 Thread.sleep(6000);
										}
										if (strControlTypeKey.compareTo("FrameSwitch_Ctrl") == 0) {

										 frameSwitchto(driver, "id", strControl);
										 Thread.sleep(6000);
										
								}
										
										if (strControlTypeKey.compareTo("FrameSwitch_Ctrl1") == 0) {

											frameSwitchto1(driver, "id", strControl);
											 Thread.sleep(6000);
											
									}
										if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
										uploadFile(driver,"xpath", strControl, strControl,strValue, strControl, strControl);
										 Thread.sleep(6000);
											
										}
										
										if (strControlTypeKey.compareTo("GetAttribute_Ctrl") == 0) {

											 getAttribute(driver, "xpath", strValue, row.get(i + 1).getCell(2).getStringCellValue());
						                      Thread.sleep(6000);
											}
								}
						}
						}
						}
					

}
