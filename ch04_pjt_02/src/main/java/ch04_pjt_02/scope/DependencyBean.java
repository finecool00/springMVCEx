package ch04_pjt_02.scope;

public class DependencyBean {

	//객체 생성될 때 InjectionBean 주입
	InjectionBean injectionBean;
	
	public DependencyBean(InjectionBean injectionBean) {
		this.injectionBean = injectionBean;
	}
	
	
	
}
