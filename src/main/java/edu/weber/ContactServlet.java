package edu.weber;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.weber.model.Address;
import edu.weber.model.Contact;

@WebServlet(urlPatterns = "/")
public class ContactServlet extends HttpServlet {
	private static List<Contact> contactList = new ArrayList<Contact>();
	String error;
	static {
		contactList.add(new Contact());
	/*	List<Address> addresses=new ArrayList<Address>();
		Address address1= new Address("123 main", "apt 3", "Ogden", "UT", "84111", "USA");
		addresses.add(address1);
		Contact contact = new Contact(
				"Bob", "George", "111-111-1111", "Home",addresses);
		contactList.add(contact);
	*/
	}
	
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//req.setAttribute("contacts", contactList);
		req.setAttribute("contacts", getContacts());
		req.setAttribute("errors", error);
		req.getRequestDispatcher("/jsp/index.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {		
		
		String fname = request.getParameter("fname"); 
		String lname = request.getParameter("lname");
		String phoneNumber = request.getParameter("phoneNumber");
		String addressType = request.getParameter("addressType");
		String address1 = request.getParameter("address1");
		String address2 = request.getParameter("address2");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String postalCode = request.getParameter("postalCode");
		String country = request.getParameter("country");
		Contact existingContact = getContactByName(fname, lname, addressType);
		//Contact existingContactAddressType = getContactAddressType(addressType);
		
		if(fname == "" || lname == "" || phoneNumber == "" 
				|| address1 == "" || city == "" 
				|| state == "" || postalCode == "" || country == ""){
			//System.out.println("something's empty");
			 error = "Please fill in all of the fields.";
			//System.out.println(error);
		}else if(existingContact ==null) {
			List addresses = new ArrayList<Address>();
			addresses.add(new Address(address1,address2,city, state,postalCode, country));
			Contact contact = new Contact(
					fname, 
					lname, 
					phoneNumber, 
					addressType, 
					addresses
			);
			contactList.add(contact); 
			System.out.println("New Contact");
			error="";
		}else {
			 error="Address already entered";
		}
					
		request.setAttribute("contacts", contactList);
		request.setAttribute("errors", error);
		request.getRequestDispatcher("/jsp/index.jsp").forward(request, resp);
	}
	
	private Contact getContactByName(String fname, String lname, String addressType) {
		for(Contact c:contactList){
			if(c.getFirstName().equalsIgnoreCase(fname) 
					&& c.getLastName().equalsIgnoreCase(lname) 
					&& c.getAddressType().equalsIgnoreCase(addressType) ) {
				return c;
			}
		}
		return null;
	}
	
	protected List<Contact> getContacts() {
		return contactList;
	}


}
