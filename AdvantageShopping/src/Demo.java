import com.borland.silktest.jtf.BrowserBaseState;
import org.junit.Before;
import org.junit.Test;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomButton;
import org.junit.Assert;
import com.borland.silktest.jtf.Desktop;

public class Demo {

	private Desktop desktop = new Desktop();

	@Before
	public void baseState() {
		// Go to web page 'https://www.advantageonlineshopping.com'
		BrowserBaseState baseState = new BrowserBaseState();
		baseState.execute(desktop);
	}

	@Test
	public void purchaseTablets() {
		desktop.<DomElement>find("advantageonlineshopping_com.BrowserWindow.tabletsImg").click();
		desktop.<DomElement>find("advantageonlineshopping_com.BrowserWindow.16").click();
		desktop.<DomElement>find("advantageonlineshopping_com.BrowserWindow.rabbit").click();
		desktop.<DomElement>find("advantageonlineshopping_com.BrowserWindow.plus").click();
		desktop.<DomElement>find("advantageonlineshopping_com.BrowserWindow.catalog fetchImage").click();
		desktop.verifyAsset("RecordedVerification1");
		desktop.<DomButton>find("advantageonlineshopping_com.BrowserWindow.save_to_cart").click();
		desktop.<DomElement>find("advantageonlineshopping_com.BrowserWindow.menuCart").click();
		DomElement _201800 = desktop.<DomElement>find("advantageonlineshopping_com.BrowserWindow.$2,018 00");
		Assert.assertEquals("$2,018.00", _201800.getText());
		desktop.<DomButton>find("advantageonlineshopping_com.BrowserWindow.checkOutButton").click();
		DomElement _2018002 = desktop.<DomElement>find("advantageonlineshopping_com.BrowserWindow.$2,018 002");
		Assert.assertEquals("$2,018.00", _2018002.getText());
		//end execution
	}

}