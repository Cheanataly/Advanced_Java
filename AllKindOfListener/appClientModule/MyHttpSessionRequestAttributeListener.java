import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MyHttpSessionRequestAttributeListener implements HttpSessionAttributeListener 
{
	@Override
	public void attributeAdded(HttpSessionBindingEvent hsbe) 
	{
		System.out.println("Attribute "+hsbe.getName()+" with value "+hsbe.getValue()+"is added to session scope");	
	}
	@Override
	public void attributeRemoved(HttpSessionBindingEvent hsbe) 
	{
		System.out.println("Attribute "+hsbe.getName()+" with value "+hsbe.getValue()+"is removed from session scope");
	}
	@Override
	public void attributeReplaced(HttpSessionBindingEvent hsbe) 
	{
			System.out.println("Attribute is replaced....");
	}
}
