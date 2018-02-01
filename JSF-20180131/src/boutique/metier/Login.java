package boutique.metier;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlOutputLabel;

@ManagedBean(name="beanLogin")
@SessionScoped
public class Login {
	
	private String login, password;
	
	private String patternLogin = "John";
	private String patternPassword = "Webb";
	
	private HtmlOutputLabel info;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String valider() {
		if (getLogin().equalsIgnoreCase(getPatternLogin())) {
			info.setStyle("color=blue;");
			info.setValue("Succès");
			
			setLogin("Login");
		}
		else
		{			
			info.setStyle("color=red;");
			info.setValue("Echec");
			
			setLogin("Login Inconnu");
		}
		return null;	
	}

	public String getPatternLogin() {
		return patternLogin;
	}

	public void setPatternLogin(String patternLogin) {
		this.patternLogin = patternLogin;
	}

	public String getPatternPassword() {
		return patternPassword;
	}

	public void setPatternPassword(String patternPassword) {
		this.patternPassword = patternPassword;
	}

	public HtmlOutputLabel getInfo() {
		return info;
	}

	public void setInfo(HtmlOutputLabel info) {
		this.info = info;
	}
	
}
