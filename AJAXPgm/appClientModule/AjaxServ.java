import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjaxServ extends HttpServlet 
{
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		try (PrintWriter out = response.getWriter())
		{
			ArrayList names = GetData.getNames(request.getParameter("name"));
			for(int i=0;i<names.size();i++)
			{
				out.println(names.get(i));
			}
			if(names.isEmpty())
			{
				out.println("No Result found...");
			}
		}
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		processRequest(request,response);
		
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		processRequest(request,response);
	}

}
