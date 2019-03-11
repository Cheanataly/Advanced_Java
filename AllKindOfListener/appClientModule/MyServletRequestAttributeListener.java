import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class MyServletRequestAttributeListener implements ServletRequestAttributeListener 
{
	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) 
	{
		System.out.println("Attribute "+srae.getName()+" with value "+srae.getValue()+"is added to request scope....");
	}
	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) 
	{
		System.out.println("Attribute "+srae.getName()+" with value "+srae.getValue()+" is removed from request scope....");
	}
	@Override
	public void attributeReplaced(ServletRequestAttributeEvent srae) 
	{
		System.out.println("Attribute is replaced......");
	}
}
