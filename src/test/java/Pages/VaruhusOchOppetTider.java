package Pages;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class VaruhusOchOppetTider {
    private final Page page;
    Locator cookies;
    Locator varuhusOchOppetTider;
    Locator valjVaruHus;
    Locator headerAndTime;
    public VaruhusOchOppetTider(Page page) {
        this.page = page;
        this.cookies = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Jag accepterar alla cookies"));
        this.varuhusOchOppetTider = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().
                setName("Varuhus och öppettider"));
        this.valjVaruHus = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Välj varuhus"));
        this.headerAndTime=page.locator("//a[text()=\"Avesta\"]/ancestor::div[@class=\"storeselector__col\"]/following-sibling::div/span");
    }

    void waitUntilElement() {
        }

    public Locator getHeaderAndTime() {
        return headerAndTime;
    }

    public void varuhusAndOppetTider() {
            page.navigate("https://www.biltema.se/");
            cookies.click();
            varuhusOchOppetTider.click();
            valjVaruHus.click();
        }

    }
