package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.GetByRoleOptions;
import com.microsoft.playwright.options.AriaRole;

public class HomePage {
	
	private final Page page;
	private final String timeLink = getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Time"));

	//private final String timeLink = "oxd-text oxd-text--span oxd-main-menu-item--name";
	
	public HomePage(Page page) {
		this.page = page;
	}
	
	private String getByRole(AriaRole link, GetByRoleOptions setName) {
		// TODO Auto-generated method stub
		return null;
	}

	public void clickTimeLink() {
//		page.click(timeLink);
		page.locator(timeLink).click();
	}

 }
