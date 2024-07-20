package java.com.surveillance.pages;

import org.openqa.selenium.WebElement;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class BranchRepo {
	PropertySingleton _instance = null;

	public BranchRepo() {
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("BranchRepo");

	public BranchRepo mousehoverBranchMenu() throws Exception {
		keywords.movetoElement("xpath", _instance.getValue("Branch.Branchmenu"));
		return this;
	}

	public BranchRepo clickCreateBranchMenu() throws Exception {
		keywords.click("xpath", _instance.getValue("Branch.BranchCreationmenu"));
		return this;
	}

	public BranchRepo Wait() throws Exception {
		Thread.sleep(5000);
		return this;
	}

	public BranchRepo enterDealerCode(String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("createBarnch.DealerCode"), value);
		return this;
	}

	public BranchRepo clickEnterkey() throws Exception {
		keywords.keyEnter();
		return this;
	}

	public BranchRepo enterBranchCode(String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("createBarnch.BranchCode"), value);
		return this;
	}

	public BranchRepo next1Branch() throws Exception {
		keywords.click("xpath", _instance.getValue("createBarnch.Next1"));
		return this;
	}

	public BranchRepo scrollupElement() throws Throwable {
		keywords.scrollElementfound("xpath", _instance.getValue("logo"));
		return this;
	}

	public BranchRepo scroldownElement() throws Throwable {
		keywords.scrollElementfound("xpath", _instance.getValue("UpdateBranch.updatebutton"));
		return this;
	}

	public BranchRepo BLSearchButton() throws Throwable {
		keywords.click("id", _instance.getValue("SearchBranch.Search"));
		keywords.scrollElementfound("xpath", _instance.getValue("searchBarnchLocation.result"));
		return this;
	}

	public BranchRepo BLExport() throws Throwable {
		// keywords.fileDownload();
		keywords.click("xpath", _instance.getValue("searchBarnchLocation.Export"));
		return this;
	}

	// Mandatory fields in Address
	public BranchRepo enterAddress(String val1, String val2, String val3, String val4, String val5) throws Exception {
		keywords.enterData("id", _instance.getValue("createBarnchLocation.address1"), val1);
		keywords.enterData("id", _instance.getValue("createBarnchLocation.city"), val2);
		keywords.SelectDropDown("xpath", _instance.getValue("createBarnchLocation.state"), val3);
		keywords.enterData("id", _instance.getValue("createBarnchLocation.zipCode"), val4);
		keywords.SelectDropDown("xpath", _instance.getValue("createBarnchLocation.country"), val5);
		return this;

	}

	// Optional fields in Address
	public BranchRepo enterAddress2(String value) throws Exception {
		keywords.enterData("id", _instance.getValue("createBarnch.address2"), value);
		return this;

	}

	public BranchRepo enterAddress3(String value) throws Exception {
		keywords.enterData("id", _instance.getValue("createBarnch.address3"), value);
		return this;

	}

	public BranchRepo enterZipPlus(String value) throws Exception {
		keywords.enterData("id", _instance.getValue("createBarnch.zipPlus"), value);
		return this;
	}

	public BranchRepo next2Branch() throws Exception {
		keywords.click("xpath", _instance.getValue("createBarnch.Next2"));
		return this;
	}

	public BranchRepo branchOriginalAddress() throws Exception {
		keywords.click("xpath", _instance.getValue("createBarnch.UseOriginalAddress"));
		return this;
	}

	public BranchRepo clickSearchBranchMenu() throws Exception {
		keywords.click("xpath", _instance.getValue("SearchBranch.SearchBranchLink"));
		return this;
	}

	public BranchRepo dealerCodeSearch(String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("SearchBranch.DealerCode"), value);
		keywords.scrollDown();
		return this;
	}

	public BranchRepo CRTerritorySearch(String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("searchBarnchLocation.crTerritory"), value);
		keywords.scrollDown();
		return this;
	}

	public BranchRepo branchCodeSearch(String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("SearchBranch.BranchCode"), value);
		keywords.scrollDown();
		return this;
	}

	public BranchRepo dealerNameSearch(String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("SearchBranch.DealerName"), value);
		keywords.scrollDown();
		return this;
	}

	public BranchRepo SearchButton() throws Exception {
		keywords.click("id", _instance.getValue("SearchBranch.Search"));
		keywords.waitForInvisible("//*[@id=\"searchResults\"]/label");
		return this;
	}

	public BranchRepo SelectBranchType(String value) throws Exception {
		keywords.SelectDropDown("xpath", _instance.getValue("SearchBranch.BranchType"), value);
		return this;
	}

	public BranchRepo SelectStatus(String value) throws Exception {
		keywords.SelectDropDown("xpath", _instance.getValue("SearchBranch.status"), value);
		//keywords.scrollDown();
		return this;
	}

	public BranchRepo branchType(String value) throws Exception {
		keywords.SelectDropDown("id", _instance.getValue("SearchBranch.BranchType"), value);
		return this;
	}

	public BranchRepo firmChannelType(String value) throws Exception {
		System.out.println(_instance.getValue("SearchDealer.firmChannel"));
		keywords.SelectDropDown("id", _instance.getValue("SearchBranch.firmChannel"), value);
		return this;
	}

	public BranchRepo channelType(String value) throws Exception {
		System.out.println(_instance.getValue("SearchDealer.dealerChannels"));
		keywords.SelectDropDown("id", _instance.getValue("SearchBranch.ChannelType"), value);
		return this;
	}

	public BranchRepo clickCreateBranchLocationMenu() throws Exception {
		keywords.click("xpath", _instance.getValue("Branch.BranchLocationCreationmenu"));
		return this;
	}

	public BranchRepo submit() throws Exception {
		keywords.click("xpath", _instance.getValue("createBarnchLocation.submit"));
		return this;
	}

	public BranchRepo enterLocationDealerCode(String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("createBarnchLocation.DealerCode"), value);
		return this;
	}

	public boolean checkBranchStatus() throws Exception {
		boolean flag = true;
		int rowsCount = keywords.elementsFind("xpath", _instance.getValue("SearchBranch.searchResultTable")).size();
		String BranchStatus = keywords.getText("xpath", _instance.getValue("SearchBranch.BranchStatus"));
		if (BranchStatus.equals("Branch Status")) {
			for (int i = 1; i <= rowsCount; i++) {
				String data = keywords.elementFind("xpath", _instance.getValue("SearchBranch.searchResultTable")+"[" + i + "]"+_instance.getValue("SearchBranch.column3")).getText();
				if (data.equals("Terminated")) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}

		}
		return flag;
	}

	public String BLIDStatus() throws Throwable {
		String status = keywords.getText("xpath", _instance.getValue("searchBarnchLocation.status"));

		return status;
	}

	public String existingAddressAlert() throws Throwable {
		String Alert = keywords.getText("xpath", _instance.getValue("createBarnchLocation.AddressAlert"));
		return Alert;
	}

	public String successAlert() throws Exception {
		WebElement alert = keywords.elementFind("xpath", _instance.getValue("createBarnchLocation.heading"));
		String msg = alert.getText();
		return msg;
	}

	// get the value from dealer name text box
	public String getdealerName() throws Exception {
		String getdlername = keywords.getAttribute("id", _instance.getValue("createBarnchLocation.Dealername"),"value");
		return getdlername;
	}

	// get the value from dealer code text box
	public String getdealercode() throws Exception {
		String getdlercode = keywords.getAttribute("id", _instance.getValue("createBarnchLocation.Dealercode"),
				"value");
		return getdlercode;
	}

	// get the value from BranchLocation ID text box
	public String getBLID() throws Exception {
		String getBLID = keywords.getAttribute("xpath", _instance.getValue("createBarnchLocation.id"), "value");
		return getBLID;
	}

	public BranchRepo enterBranchcompanyname(String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("createBarnch.branchCompanyName"), value);
		return this;
	}

	public BranchRepo searchLookupType(String value) throws Exception {
		keywords.SelectDropDown("id", _instance.getValue("SearchBranch.SearchType"), value);
		return this;

	}

	public BranchRepo dataforSearchLookup(String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("SearchBranch.SearchData"), value);
		return this;
	}

	public BranchRepo clickLookup() throws Exception {
		keywords.click("id", _instance.getValue("SearchBranch.LookupBtn"));
		return this;
	}

	public BranchRepo enterBranchPhone(String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("createBarnch.phoneNumber"), value);
		return this;
	}

	public BranchRepo enterBranchExtn(String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("createBarnch.extension"), value);
		return this;
	}

	public BranchRepo enterBranchFax(String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("createBarnch.faxNumber"), value);
		return this;
	}

	public BranchRepo update() throws Throwable {
		keywords.click("id", _instance.getValue("createBarnch.branchUpdateButton"));
		Thread.sleep(5000);
		keywords.scrollElementfound("xpath", _instance.getValue("logo"));
		return this;
	}

	public BranchRepo scrollchannel() throws Throwable {
		keywords.scrollElementfound("xpath", _instance.getValue("UpdateBranchLoc.AddChannel"));
		return this;
	}

	public String updateAlertMsg() throws Throwable {
		String Alert = keywords.getText("xpath", _instance.getValue("createBarnch.updatemsg"));
		System.out.println(Alert);
		return Alert;
	}

	public BranchRepo mousehoverSearchOfficeMenu() throws Exception {
		keywords.click("xpath", _instance.getValue("SearchOffice.SearchOfficemenu"));
		return this;
	}

	public BranchRepo enterOfficeGlobalID(String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("SearchOffice.OfficeGlobalID"), value);
		return this;
	}

	public BranchRepo enterFirmGlobalid(String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("SearchOffice.enterFirmGlobalid"), value);
		return this;
	}

	public BranchRepo enterFirmCRD(String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("SearchOffice.enterFirmCRD"), value);
		return this;
	}

	public BranchRepo selectFirmChannel(String value) throws Exception {
		keywords.SelectDropDown("id", _instance.getValue("SearchOffice.FirmChannel"), value);
		return this;
	}

	public BranchRepo enterDiscoveryPhysicalBranchId(String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("SearchOffice.DiscoveryPhysicalBranchId"), value);
		return this;
	}

	public BranchRepo selectStaus(String value) throws Exception {
		keywords.SelectDropDown("id", _instance.getValue("SearchOffice.selectStaus"), value);
		return this;
	}

	public BranchRepo enterCity(String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("SearchOffice.enterCity"), value);
		return this;
	}

	public BranchRepo selectState(String value) throws Exception {
		keywords.SelectDropDown("id", _instance.getValue("SearchOffice.selectState"), value);
		return this;
	}

	public BranchRepo searchOfficeButton() throws Throwable {
		keywords.click("id", _instance.getValue("SearchOffice.search"));
		keywords.scrollElementfound("xpath", _instance.getValue("SearchOffice.searchResults"));
		// keywords.waitForInvisible("//*[@id=\"searchResults\"]/label");
		return this;
	}

	public BranchRepo exwait() throws Exception {
		keywords.waitForInvisible("//*[@id=\"searchResults\"]/div/label");
		return this;
	}

	public BranchRepo exwaitUpdate() throws Exception {
		keywords.waitForInvisible("//*[@id=\"errorMsgs\"]/div/span");
		return this;
	}

	public BranchRepo BranchCodeRadio() {
		keywords.radioClick("xpath", _instance.getValue("SearchBranch.BranchCodeRadio"));
		return this;
	}

	public BranchRepo BranchLocRadio() {
		keywords.radioClick("xpath", _instance.getValue("SearchBranch.BranchLocRadio"));
		return this;
	}

	// Search Branch Location Repo
	public BranchRepo enterBranchLocID(String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("searchBarnchLocation.BarnchLocationID"), value);
		return this;
	}

	public String searchSuccess() throws Throwable {
		String Alert = keywords.getText("xpath", _instance.getValue("searchBarnchLocation.result"));
		return Alert;
	}

	public String searchFail() throws Throwable {
		String Alert = keywords.getText("xpath", _instance.getValue("searchBarnchLocation.FailSearchResult"));
		return Alert;
	}

	public BranchRepo selectChannel(String value) throws Exception {
		keywords.SelectDropDown("id", _instance.getValue("UpdateBranch.SelectChannel"), value);
		return this;
	}

	public BranchRepo addChannel() throws Exception {
		keywords.click("xpath", _instance.getValue("UpdateBranch.AddChannel"));
		return this;
	}

	public BranchRepo primaryChannel3() throws Exception {
		keywords.radioClick("xpath", _instance.getValue("UpdateBranch.primarychannel3"));
		return this;
	}

	public BranchRepo BLIDlink() throws Exception {
		keywords.click("xpath", _instance.getValue("MaintainBL.BLIDLink"));
		return this;
	}

	public BranchRepo BLIDAdd() throws Exception {
		keywords.click("id", _instance.getValue("MaintainBL.addBranchButton"));
		return this;
	}
	public Boolean checkBLIDAddenabled() throws Exception {
		Boolean Element=keywords.isEnabled("id", _instance.getValue("MaintainBL.addBranchButton"));
		return Element;
	}

	public BranchRepo enterBCodeinBL(String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("MaintainBL.newBranchCode"), value);
		return this;
	}

	public BranchRepo BranchButton() throws Exception {
		keywords.click("id", _instance.getValue("MaintainBL.SaveBranchSubmitButton"));
		return this;
	}

	public BranchRepo BranchLocationButton() throws Exception {
		keywords.click("xpath", _instance.getValue("MaintainBL.BranchLocationButton"));
		return this;
	}

	public BranchRepo BranchLocPhoneandFax(String val1, String val2, String val3) throws Exception {
		keywords.clearEnter("id", _instance.getValue("MaintainBL.BranchLocationPhoneNo"), val1);
		keywords.clearEnter("id", _instance.getValue("MaintainBL.BranchLocationPhoneNoExtn"), val2);
		keywords.clearEnter("id", _instance.getValue("MaintainBL.BranchLocationfaxNumber"), val3);
		return this;
	}

	public BranchRepo maintainBLUpdateButton() throws Exception {
		keywords.click("id", _instance.getValue("MaintainBL.update"));
		return this;
	}

	public String maintainBLUpdatAlert() throws Throwable {
		String Alert = keywords.getText("id", _instance.getValue("MaintainBL.updateMsg"));
		return Alert;
	}

	public BranchRepo SelectCROwnerCode(String value) throws Exception {
		keywords.SelectDropDown("id", _instance.getValue("MaintainBL.crOwnershipCode"), value);
		return this;
	}

	public void checkRemoveLink(String Value) throws Exception {
		boolean flag = true;
		int rowsCount = keywords.elementsFind("xpath", _instance.getValue("branch.branchChanneltbl")).size();
		String ChannelName = keywords.getText("xpath", _instance.getValue("MaintainBL.channelname"));
		String Remove = keywords.getText("xpath", _instance.getValue("MaintainBL.removeChannel"));
		if (ChannelName.equals("Channel")) {
			for (int i = 1; i <= rowsCount; i++) {
				String data1 = keywords.elementFind("xpath", _instance.getValue("branch.branchChanneltbl")+"[" + i + "]"+ _instance.getValue("branch.branchChanneltblcol1")).getText();
				System.out.println("Channel name is : " + data1);
				if (data1.equals(Value)) {
					keywords.elementFind("xpath", _instance.getValue("branch.branchChanneltbl")+"[" + i + "]"+ _instance.getValue("branch.branchChanneltblcol3")).click();
					flag = true;
					break;
				} else {
					flag = false;

				}
			}

		}

	}

	public void selectPrimaryChannel(String Value) throws Exception {
		boolean flag = true;
		int rowsCount = keywords.elementsFind("xpath", _instance.getValue("branch.branchChanneltbl")).size();
		String ChannelName = keywords.getText("xpath", _instance.getValue("MaintainBL.channelname"));
		if (ChannelName.equals("Channel")) {
			for (int i = 1; i <= rowsCount; i++) {
				String data1 = keywords.elementFind("xpath", _instance.getValue("branch.branchChanneltbl")+"[" + i + "]"+ _instance.getValue("branch.branchChanneltblcol1")).getText();
				System.out.println("Channel name is : " + data1);
				if (data1.equals(Value)) {
					keywords.elementFind("xpath", _instance.getValue("branch.branchChanneltbl")+"[" + i + "]"+ _instance.getValue("branch.branchChanneltblcol2")).click();
					Thread.sleep(5000);
					flag = true;
					break;
				} else {
					flag = false;

				}
			}

		}

	}

	public BranchRepo changeBLButton() throws Exception {
		keywords.click("xpath", _instance.getValue("MaintainBL.changeBLButton"));
		return this;
	}

	public BranchRepo BranchId(String value) throws Exception {
		keywords.clearEnter("xpath", _instance.getValue("MaintainBL.branchID"), value);
		return this;
	}

	public BranchRepo maintainBLSubmit() throws Exception {
		keywords.click("xpath", _instance.getValue("MaintainBL.submit"));
		return this;
	}

	public BranchRepo enterBLAddress(String val1, String val2, String val3, String val4, String val5) throws Exception {
		keywords.clearEnter("xpath", _instance.getValue("MaintainBL.address1"), val1);
		keywords.clearEnter("id", _instance.getValue("MaintainBL.city"), val2);
		keywords.SelectDropDown("id", _instance.getValue("MaintainBL.state"), val3);
		keywords.clearEnter("id", _instance.getValue("MaintainBL.zip"), val4);
		keywords.SelectDropDown("id", _instance.getValue("MaintainBL.country"), val5);
		return this;
	}

	public String BranchSearchResult() throws Exception {
		String Result = keywords.getAttribute("xpath", _instance.getValue("searchBarnchLocation.result"), "value");
		return Result;
	}

	public boolean checkDefBranch() throws Exception {
		boolean flag = true;
		int rowsCount = keywords.elementsFind("xpath", _instance.getValue("SearchBranch.searchResultTable")).size();
		String BranchCode = keywords.getText("xpath", _instance.getValue("SearchBranch.defBranch"));
		if (BranchCode.equals("Branch Code")) {
			for (int i = 1; i <= rowsCount; i++) {
				String data = keywords.getLinkText("xpath", _instance.getValue("SearchBranch.searchResultTable")+"[" + i + "]"+ _instance.getValue("branch.branchChanneltblcol2Link"));
				if (data.equals("ERROR")) {
					flag = true;
					break;

				} else {
					flag = false;

				}
				if (data.equals("000")) {
					flag = true;
					break;

				} else {
					flag = false;

				}

			}

		}
		return flag;
	}

	public void moreCol() {
		keywords.click("xpath", _instance.getValue("searchBarnchLocation.moreCols"));
	}

	public String checkCRTerritorycol(String Value) throws Exception {
		boolean flag = true;
		int rowsCount = keywords.elementsFind("xpath", _instance.getValue("SearchBranch.searchResultTable")).size();
		String CRTerritorycol = keywords.getText("xpath", _instance.getValue("searchBarnchLocation.CRTerritorycol"));
		if (CRTerritorycol.equals("Brch Loc CR Territory")) {
			for (int i = 1; i <= rowsCount; i++) {
				String data = keywords.elementFind("xpath", _instance.getValue("branch.bChanneltblHead")+"[" + i + "]"+ _instance.getValue("branch.branchChanneltblcol10")).getText();
				if (data.equals(Value)) {
					flag = true;
					break;
				} else {
					flag = false;

				}
			}

		}
		return Value;
	}

	public boolean checkBranchTypeSearch1() throws Exception {
		boolean flag = true;
		int rowsCount = keywords.elementsFind("xpath", _instance.getValue("SearchBranch.searchResultTable")).size();
		String branchType = keywords.getText("xpath", _instance.getValue("searchBarnchLocation.branchType"));
		if (branchType.equals("Branch type")) {
			for (int i = 1; i <= rowsCount; i++) {
				String data = keywords.elementFind("xpath", _instance.getValue("branch.bChanneltblHead")+"[" + i + "]"+ _instance.getValue("branch.branchChanneltblcol8")).getText();
				if (data.equals("CORRELATED")) {
					flag = true;
					break;
				} else {
					flag = false;

				}
			}
		}
		return flag;
	}

	public boolean checkBranchTypeSearch2() throws Exception {
		boolean flag = true;
		int rowsCount = keywords.elementsFind("xpath", _instance.getValue("SearchBranch.searchResultTable")).size();
		String branchType = keywords.getText("xpath", _instance.getValue("searchBarnchLocation.branchType"));
		if (branchType.equals("Branch type")) {
			for (int i = 1; i <= rowsCount; i++) {
				String data = keywords.elementFind("xpath", _instance.getValue("branch.bChanneltblHead")+"[" + i + "]"+ _instance.getValue("branch.branchChanneltblcol8")).getText();
				if (data.equals("ACTUAL")) {
					flag = true;
					break;
				} else {
					flag = false;

				}
			}
		}
		return flag;
	}

	public void BLListunderDealer() throws Throwable {
		boolean flag = true;
		int rowsCount = keywords.elementsFind("xpath", _instance.getValue("SearchBranch.searchResultTable")).size();
		String BLIDCol = keywords.getText("xpath", _instance.getValue("searchBarnchLocation.blidCol"));
		String BLID = keywords.getAttribute("id", _instance.getValue("searchBarnchLocation.bLid"), "value");
		if (BLIDCol.equals("Branch Location ID")) {
			for (int i = 1; i <= rowsCount; i++) {
				String data = keywords.elementFind("xpath", _instance.getValue("branch.bChanneltblHead")+"[" + i + "]"+ _instance.getValue("branch.branchChanneltblcol2path")).getText();
				if (data.equals(BLID)) {
					flag = true;
					System.out.println("Existing BLID Assigned");
					break;
				} else {
					System.out.println("New BLID Created");
					flag = false;

				}
			}
		}
	}

	public String getBLid() throws Throwable {
		String BLID = keywords.getAttribute("id", _instance.getValue("searchBarnchLocation.bLid"), "value");
		return BLID;
	}

	public String getSecAddress() throws Exception {
		String address1 = keywords.getAttribute("id", _instance.getValue("MaintainBL.address1"), "value");
		return address1;
	}

	public BranchRepo clickBranchCodeLink() throws Exception {
		keywords.click("xpath", _instance.getValue("MaintainBL.BCinBL"));
		return this;
	}

	public BranchRepo clickDBRLink() throws Exception {
		keywords.click("linktext", _instance.getValue("MaintainBL.DBRActive"));
		return this;
	}

	public String getRepName() throws Exception {
		String RepName = keywords.getText("xpath", _instance.getValue("MaintainBL.RepName"));
		return RepName;
	}

	public String getRepAlloc() throws Exception {
		String RepAllocation = keywords.getText("xpath", _instance.getValue("MaintainBL.RepAlloc"));
		return RepAllocation;
	}

	public String getSegment() throws Exception {
		String Segment = keywords.getDropDownVisibleText("xpath", _instance.getValue("MaintainBL.Segment"));
		return Segment;
	}
	public void checkSegmentVisibility() throws Exception {
//		String Segment = keywords.getDropDownVisibleText("xpath", _instance.getValue("MaintainBL.Segment"));
//		if(Segment!= null){
//			System.out.println("Element is Present");
//			}else{
//			System.out.println("Element is Absent");
//			}
		if(keywords.driver.getPageSource().contains("Customer Segment as of")){
			System.out.println("Text is present");
			}else{
			System.out.println("Text is absent");
			}
	}
	

	public String getPrimaryChannel() throws Exception {
		String Primary = keywords.getText("xpath", _instance.getValue("MaintainBL.Primary"));
		return Primary;
	}
	public String getBLCRTerritory () throws Exception {
		String CR=keywords.getAttribute("id", _instance.getValue("MaintainBL.crTerritoryCode"),"value");
		return CR;
	}
	
	public String getcrOwnershipCode() throws Exception {
		String CROwn = keywords.getDropDownVisibleText("xpath", _instance.getValue("MaintainBL.BLcrOwnershipCode"));
		return CROwn;
	}

	public String getDCIOOwnCode() throws Exception {
		String DCIO = keywords.getDropDownVisibleText("xpath", _instance.getValue("MaintainBL.DCIOOwnCode"));
		return DCIO;
	}

	public String getVAIOOwnCode() throws Exception {
		String vaio = keywords.getDropDownVisibleText("xpath", _instance.getValue("MaintainBL.VAIOOwnCode"));
		return vaio;
	}

	public String getRIAOwnCode() throws Exception {
		String RIA = keywords.getDropDownVisibleText("xpath", _instance.getValue("MaintainBL.RIAOwnCode"));
		return RIA;
	}
	public Boolean checkBLDCIOOwnCodeenabled() throws Exception {
		Boolean Element=keywords.isEnabled("xpath", _instance.getValue("MaintainBL.DCIOOwnCode"));
		return Element;
	}
	public Boolean checkBLVAIOOwnCodeenabled() throws Exception {
		Boolean Element=keywords.isEnabled("xpath", _instance.getValue("MaintainBL.VAIOOwnCode"));
		return Element;
	}
	public Boolean checkBLRIAOwnCodeenabled() throws Exception {
		Boolean Element=keywords.isEnabled("xpath", _instance.getValue("MaintainBL.RIAOwnCode"));
		return Element;
	}

	public String getDCIOTerritory() throws Exception {
		String dcio = keywords.getAttribute("xpath", _instance.getValue("MaintainBranch.dcio"), "value");
		return dcio;
	}

	public String getVAIOTerritory() throws Exception {
		String vaioTR = keywords.getAttribute("xpath", _instance.getValue("MaintainBranch.vaio"), "value");
		return vaioTR;
	}
	public String getRIATerritory() throws Exception {
		String vaioTR = keywords.getAttribute("xpath", _instance.getValue("MaintainBranch.ria"), "value");
		return vaioTR;
	}
	public Boolean checkBLDCIOTerritory() throws Exception {
		Boolean Element=keywords.isEnabled("xpath", _instance.getValue("MaintainBranch.dcio"));
		return Element;
	}

	public Boolean checkBLVAIOTerritory() throws Exception {
		Boolean Element=keywords.isEnabled("xpath", _instance.getValue("MaintainBranch.vaio"));
		return Element;
	}
	public Boolean checkBLRIATerritory() throws Exception {
		Boolean Element=keywords.isEnabled("xpath", _instance.getValue("MaintainBranch.ria"));
		return Element;
	}
	public String getBCPrimaryChannel() throws Exception {
		String PrimaryBC = keywords.getText("xpath", _instance.getValue("MaintainBranch.prichannel"));
		return PrimaryBC;
	}

	public String getBCDCIOTerritory() throws Exception {
		String dcio = keywords.getAttribute("xpath", _instance.getValue("MaintainBranch.dcio"), "value");
		return dcio;
	}

	public String getBCVAIOTerritory() throws Exception {
		String vaioTR = keywords.getAttribute("xpath", _instance.getValue("MaintainBranch.vaio"), "value");
		return vaioTR;
	}
	public String getBCRIATerritory() throws Exception {
		String dcio = keywords.getAttribute("xpath", _instance.getValue("MaintainBranch.ria"), "value");
		return dcio;
	}
	public Boolean checkBCDCIOTerritoryenabled() throws Exception {
		Boolean Element=keywords.isEnabled("xpath", _instance.getValue("MaintainBranch.dcio"));
		return Element;
	}
	public Boolean checkBCVAIOTerritoryenabled() throws Exception {
		Boolean Element=keywords.isEnabled("xpath", _instance.getValue("MaintainBranch.vaio"));
		return Element;
	}
	public Boolean checkBCRIATerritoryenabled() throws Exception {
		Boolean Element=keywords.isEnabled("xpath", _instance.getValue("MaintainBranch.ria"));
		return Element;
	}
	

	public String getBLECS() throws Exception {
		String ECS = keywords.getText("xpath", _instance.getValue("MaintainBL.ECS"));
		return ECS;
	}

	public Boolean checkChangeBLbutton() throws Exception {
		Boolean Element=keywords.isEnabled("xpath", _instance.getValue("MaintainBranch.ChangeBLbutton"));
		return Element;
	}

	public String getBranchECS() throws Exception {
		String vaioTR = keywords.getText("xpath", _instance.getValue("MaintainBranch.ECS"));
		return vaioTR;
	}

	public String getRepECS() throws Exception {
		String RepName = keywords.getText("xpath", _instance.getValue("DBR.ECS"));
		return RepName;
	}

	// Need to complete
	public BranchRepo clickDBR() throws Exception {
		keywords.click("xpath", _instance.getValue("MaintainBL.DBRActive"));
		return this;
	}

	public BranchRepo dataforBLDCIOTerritory(String value) throws Exception {
		keywords.clearEnter("xpath", _instance.getValue("MaintainBranch.dcio"), value);
		return this;
	}

	public BranchRepo tabdcio() {
		keywords.Tabout("xpath", _instance.getValue("MaintainBL.DCIOOwnCode"));
		keywords.Tabout("xpath", _instance.getValue("MaintainBL.RIATerritory"));
		return this;
	}

	public BranchRepo dataforBLVAIOTerritory(String value) throws Exception {
		keywords.clearEnter("xpath", _instance.getValue("MaintainBranch.vaio"), value);

		return this;
	}

	public BranchRepo tabvaio() {
		keywords.Tabout("xpath", _instance.getValue("MaintainBL.vaioTerritoryEffectiveDate"));
		return this;
	}

	public String getBCdealerName() throws Exception {
		String name = keywords.getAttribute("id", _instance.getValue("createBarnch.dealerName"), "value");
		return name;
	}

	public String getBCdealercode() throws Exception {
		String getdlercode = keywords.getAttribute("id", _instance.getValue("createBarnch.dealerCode"), "value");
		return getdlercode;
	}

	public String getBCode() throws Exception {
		String branch = keywords.getAttribute("id", _instance.getValue("createBarnch.branchCode"), "value");
		return branch;
	}

	public String BranchCreationAlert() throws Exception {
		WebElement alert = keywords.elementFind("xpath", _instance.getValue("createBarnch.BranchCreationAlert"));
		String msg = alert.getText();
		return msg;
	}
	public BranchRepo enterbranchCompanyName(String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("MaintainBranch.branchCompanyName"), value);
		return this;
	}
	public BranchRepo enterDirectDealerCode(String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("MaintainBranch.directDealerCode"), value);
		keywords.Tabout("id",  _instance.getValue("MaintainBranch.directDealerName"));
		return this;
	}
	public BranchRepo enterBranchAddress(String val1, String val2, String val3, String val4, String val5) throws Exception {
		keywords.clearEnter("id", _instance.getValue("createBarnch.address1"), val1);
		keywords.clearEnter("id", _instance.getValue("createBarnch.city"), val2);
		keywords.SelectDropDown("id", _instance.getValue("createBarnch.state"), val3);
		keywords.clearEnter("id", _instance.getValue("createBarnch.zipCode"), val4);
		keywords.SelectDropDown("id", _instance.getValue("createBarnch.country"), val5);
		return this;
	}
	public BranchRepo enterCRTerritory (String value) throws Exception {
		keywords.clearEnter("id", _instance.getValue("MaintainBranch.crTerritoryCode"), value);
		keywords.Tabout("id",  _instance.getValue("MaintainBranch.crTerritoryEffectiveDate"));
		return this;
	}
	public String getBCCRTerritory () throws Exception {
		String CR=keywords.getAttribute("id", _instance.getValue("MaintainBranch.crTerritoryCode"),"Value");
		return CR;
	}
	public BranchRepo SelectORReason(String value) throws Exception {
		keywords.SelectDropDown("id", _instance.getValue("MaintainBranch.territoryOverrideReason"), value);
		return this;
	}
	public BranchRepo selectCascadetoFA()throws Exception {
		keywords.checkClick("xpath",  _instance.getValue("MaintainBranch.selectallFA"), "on");
		return this;
	}
	public BranchRepo cascadeChangesButton() throws Exception {
		keywords.click("id", _instance.getValue("MaintainBranch.cascadeChangesButton"));
		return this;
	}
	
	public BranchRepo removeOverrideButton() throws Exception {
		keywords.click("xpath", _instance.getValue("MaintainBranch.removeOverrideButton"));
		return this;
	}
	
	public BranchRepo clickBLOCLink() throws Exception {
		keywords.click("xpath", _instance.getValue("MaintainBranch.BlocLink"));
		return this;
	}
	public Boolean checkBranchdirectDealerCodeenabled() throws Exception {
		Boolean Element=keywords.isEnabled("id", _instance.getValue("MaintainBranch.directDealerCode"));
		return Element;
	}
	public Boolean checkBranchdirectDealerNameenabled() throws Exception {
		Boolean Element=keywords.isEnabled("id", _instance.getValue("MaintainBranch.directDealerName"));
		return Element;
	}
	public Boolean checkBranchDealerCodeenabled() throws Exception {
		Boolean Element=keywords.isEnabled("id", _instance.getValue("createBarnch.dealerCode"));
		return Element;
	}
	public String getBCRIAOwnCode() throws Exception {
		String RIA = keywords.getDropDownVisibleText("xpath", _instance.getValue("MaintainBL.RIAOwnCode"));
		return RIA;
	}
	public Boolean checkAddress1enabled() throws Exception {
		Boolean Element=keywords.isEnabled("id", _instance.getValue("MaintainBranch.address1"));
		return Element;
	}
	public Boolean checkAddress2enabled() throws Exception {
		Boolean Element=keywords.isEnabled("id", _instance.getValue("MaintainBranch.address2"));
		return Element;
	}
	public Boolean checkAddress3enabled() throws Exception {
		Boolean Element=keywords.isEnabled("id", _instance.getValue("MaintainBranch.address3"));
		return Element;
	}
	public Boolean checkPhoneenabled() throws Exception {
		Boolean Element=keywords.isEnabled("id", _instance.getValue("MaintainBranch.phone"));
		return Element;
	}
	public Boolean checkPhoneExtnenabled() throws Exception {
		Boolean Element=keywords.isEnabled("id", _instance.getValue("MaintainBranch.phoneExtn"));
		return Element;
	}
	public Boolean checkfaxenabled() throws Exception {
		Boolean Element=keywords.isEnabled("id", _instance.getValue("MaintainBranch.fax"));
		return Element;
	}
	 
	public Boolean checkChannelenabled() throws Exception {
		Boolean Element=keywords.isEnabled("id", _instance.getValue("UpdateBranch.SelectChannel"));
		return Element;
	}
	public Boolean checkBranchCodeenabled() throws Exception {
		Boolean Element=keywords.isEnabled("id", _instance.getValue("createBarnch.branchCode"));
		return Element;
	}
	public Boolean checkCRTerritoryenabled() throws Exception {
		Boolean Element=keywords.isEnabled("id", _instance.getValue("MaintainBranch.crTerritoryCode"));
		return Element;
	}
	
	public String getBCJobId() throws Exception {
		String name = keywords.getAttribute("xpath", _instance.getValue("MaintainBranch.jobid"), "value");
		return name;
	}
}

