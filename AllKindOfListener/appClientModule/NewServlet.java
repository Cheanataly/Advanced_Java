import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		req.setAttribute("sports", "badminton");
		sleep();
		req.setAttribute("sports", "tennis");
		sleep();
		req.removeAttribute("sports");
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		doGet(req,res);
	}
	public void sleep()
	{
		try 
		{
			Thread.sleep(3000);
		} catch (InterruptedException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
