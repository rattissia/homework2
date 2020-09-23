package edu.weber;


import static org.junit.Assert.assertTrue;
import java.util.*;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import edu.weber.dao.ContactDAO;
import edu.weber.model.Address;
import edu.weber.model.Contact;
import edu.weber.service.ContactService;
import junit.framework.Assert;

import org.mockito.ArgumentCaptor;
import org.mockito.ArgumentMatchers;
/**
 * Unit test for simple App.
 */
@RunWith(MockitoJUnitRunner.class)
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testMyServlet() {
    	ContactServlet firstServlet = new ContactServlet();
    	List<Contact> contacts = firstServlet.getContacts();
    	Assert.assertTrue(contacts.size() == 1);
    }
    
    @Test
    public void testThatPostHasFirstName() throws ServletException, IOException {
    	ContactServlet firstServlet = new ContactServlet();
    	   	
    	HttpServletRequest  mockedRequest = Mockito.mock(HttpServletRequest.class);
    	RequestDispatcher  mockedDispatcher = Mockito.mock(RequestDispatcher.class);
    	
    	Mockito.when(mockedRequest.getParameter("fname")).thenReturn(null);
    	Mockito.when(mockedRequest.getRequestDispatcher(ArgumentMatchers.anyString())).thenReturn(mockedDispatcher);
    	
    	HttpServletResponse  mockedResponse = Mockito.mock(HttpServletResponse.class);
    	ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
    	
    	firstServlet.doPost(mockedRequest, mockedResponse);
    	Mockito.verify(mockedRequest).setAttribute(Mockito.eq("error"), captor.capture());
    	String errorValue = captor.getValue();
    	
    	Assert.assertEquals("FirstName Is Empty", errorValue);
    }
    
    @Test
    public void testThatPostHasLastName() throws ServletException, IOException {
    	ContactServlet firstServlet = new ContactServlet();
    	   	
    	HttpServletRequest  mockedRequest = Mockito.mock(HttpServletRequest.class);
    	RequestDispatcher  mockedDispatcher = Mockito.mock(RequestDispatcher.class);
    	
    	Mockito.when(mockedRequest.getParameter("lname")).thenReturn(null);
    	Mockito.when(mockedRequest.getRequestDispatcher(ArgumentMatchers.anyString())).thenReturn(mockedDispatcher);
    	
    	HttpServletResponse  mockedResponse = Mockito.mock(HttpServletResponse.class);
    	ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
    	
    	firstServlet.doPost(mockedRequest, mockedResponse);
    	Mockito.verify(mockedRequest).setAttribute(Mockito.eq("error"), captor.capture());
    	String errorValue = captor.getValue();
    	
    	Assert.assertEquals("LastName Is Empty", errorValue);
    }
    
    @Test
    public void testThatPostHasPhoneNumber() throws ServletException, IOException {
    	ContactServlet firstServlet = new ContactServlet();
    	   	
    	HttpServletRequest  mockedRequest = Mockito.mock(HttpServletRequest.class);
    	RequestDispatcher  mockedDispatcher = Mockito.mock(RequestDispatcher.class);
    	
    	Mockito.when(mockedRequest.getParameter("phoneNumber")).thenReturn(null);
    	Mockito.when(mockedRequest.getRequestDispatcher(ArgumentMatchers.anyString())).thenReturn(mockedDispatcher);
    	
    	HttpServletResponse  mockedResponse = Mockito.mock(HttpServletResponse.class);
    	ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
    	
    	firstServlet.doPost(mockedRequest, mockedResponse);
    	Mockito.verify(mockedRequest).setAttribute(Mockito.eq("error"), captor.capture());
    	String errorValue = captor.getValue();
    	
    	Assert.assertEquals("phoneNumber Is Empty", errorValue);
    }
    
    @Test
    public void testThatPostHasAddress1() throws ServletException, IOException {
    	ContactServlet firstServlet = new ContactServlet();
    	   	
    	HttpServletRequest  mockedRequest = Mockito.mock(HttpServletRequest.class);
    	RequestDispatcher  mockedDispatcher = Mockito.mock(RequestDispatcher.class);
    	
    	Mockito.when(mockedRequest.getParameter("address1")).thenReturn(null);
    	Mockito.when(mockedRequest.getRequestDispatcher(ArgumentMatchers.anyString())).thenReturn(mockedDispatcher);
    	
    	HttpServletResponse  mockedResponse = Mockito.mock(HttpServletResponse.class);
    	ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
    	
    	firstServlet.doPost(mockedRequest, mockedResponse);
    	Mockito.verify(mockedRequest).setAttribute(Mockito.eq("error"), captor.capture());
    	String errorValue = captor.getValue();
    	
    	Assert.assertEquals("address1 Is Empty", errorValue);
    }
    
    @Test
    public void testThatPostHasAddress2() throws ServletException, IOException {
    	ContactServlet firstServlet = new ContactServlet();
    	   	
    	HttpServletRequest  mockedRequest = Mockito.mock(HttpServletRequest.class);
    	RequestDispatcher  mockedDispatcher = Mockito.mock(RequestDispatcher.class);
    	
    	Mockito.when(mockedRequest.getParameter("address2")).thenReturn(null);
    	Mockito.when(mockedRequest.getRequestDispatcher(ArgumentMatchers.anyString())).thenReturn(mockedDispatcher);
    	
    	HttpServletResponse  mockedResponse = Mockito.mock(HttpServletResponse.class);
    	ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
    	
    	firstServlet.doPost(mockedRequest, mockedResponse);
    	Mockito.verify(mockedRequest).setAttribute(Mockito.eq("error"), captor.capture());
    	String errorValue = captor.getValue();
    	
    	Assert.assertEquals("address2 Is Empty", errorValue);
    }
    
    @Test
    public void testThatPostHasCity() throws ServletException, IOException {
    	ContactServlet firstServlet = new ContactServlet();
    	   	
    	HttpServletRequest  mockedRequest = Mockito.mock(HttpServletRequest.class);
    	RequestDispatcher  mockedDispatcher = Mockito.mock(RequestDispatcher.class);
    	
    	Mockito.when(mockedRequest.getParameter("city")).thenReturn(null);
    	Mockito.when(mockedRequest.getRequestDispatcher(ArgumentMatchers.anyString())).thenReturn(mockedDispatcher);
    	
    	HttpServletResponse  mockedResponse = Mockito.mock(HttpServletResponse.class);
    	ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
    	
    	firstServlet.doPost(mockedRequest, mockedResponse);
    	Mockito.verify(mockedRequest).setAttribute(Mockito.eq("error"), captor.capture());
    	String errorValue = captor.getValue();
    	
    	Assert.assertEquals("city Is Empty", errorValue);
    }
    
    @Test
    public void testThatPostHasState() throws ServletException, IOException {
    	ContactServlet firstServlet = new ContactServlet();
    	   	
    	HttpServletRequest  mockedRequest = Mockito.mock(HttpServletRequest.class);
    	RequestDispatcher  mockedDispatcher = Mockito.mock(RequestDispatcher.class);
    	
    	Mockito.when(mockedRequest.getParameter("state")).thenReturn(null);
    	Mockito.when(mockedRequest.getRequestDispatcher(ArgumentMatchers.anyString())).thenReturn(mockedDispatcher);
    	
    	HttpServletResponse  mockedResponse = Mockito.mock(HttpServletResponse.class);
    	ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
    	
    	firstServlet.doPost(mockedRequest, mockedResponse);
    	Mockito.verify(mockedRequest).setAttribute(Mockito.eq("error"), captor.capture());
    	String errorValue = captor.getValue();
    	
    	Assert.assertEquals("state Is Empty", errorValue);
    }
    
    @Test
    public void testThatPostHasPostalCode() throws ServletException, IOException {
    	ContactServlet firstServlet = new ContactServlet();
    	   	
    	HttpServletRequest  mockedRequest = Mockito.mock(HttpServletRequest.class);
    	RequestDispatcher  mockedDispatcher = Mockito.mock(RequestDispatcher.class);
    	
    	Mockito.when(mockedRequest.getParameter("postalCode")).thenReturn(null);
    	Mockito.when(mockedRequest.getRequestDispatcher(ArgumentMatchers.anyString())).thenReturn(mockedDispatcher);
    	
    	HttpServletResponse  mockedResponse = Mockito.mock(HttpServletResponse.class);
    	ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
    	
    	firstServlet.doPost(mockedRequest, mockedResponse);
    	Mockito.verify(mockedRequest).setAttribute(Mockito.eq("error"), captor.capture());
    	String errorValue = captor.getValue();
    	
    	Assert.assertEquals("postalCode Is Empty", errorValue);
    }
    
    @Test
    public void testThatPostHasCountry() throws ServletException, IOException {
    	ContactServlet firstServlet = new ContactServlet();
    	   	
    	HttpServletRequest  mockedRequest = Mockito.mock(HttpServletRequest.class);
    	RequestDispatcher  mockedDispatcher = Mockito.mock(RequestDispatcher.class);
    	
    	Mockito.when(mockedRequest.getParameter("country")).thenReturn(null);
    	Mockito.when(mockedRequest.getRequestDispatcher(ArgumentMatchers.anyString())).thenReturn(mockedDispatcher);
    	
    	HttpServletResponse  mockedResponse = Mockito.mock(HttpServletResponse.class);
    	ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
    	
    	firstServlet.doPost(mockedRequest, mockedResponse);
    	Mockito.verify(mockedRequest).setAttribute(Mockito.eq("error"), captor.capture());
    	String errorValue = captor.getValue();
    	
    	Assert.assertEquals("country Is Empty", errorValue);
    }
}
