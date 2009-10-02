/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arnoud.springwebmvcexercise4;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import junit.framework.TestCase;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author arnoud
 */
public class HelloControllerTest extends TestCase {
    public HttpServletRequest request;
    public HttpServletResponse response;
    public Model model;
    
    public HelloControllerTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of get method, of class HelloController.
     */
    public void testGet() {
        request = new MockHttpServletRequest("GET", "/hello");
        response = new MockHttpServletResponse();
        model = new BindingAwareModelMap();

        System.out.println("get");
        HelloController instance = new HelloController();
        String expResult = "hello";
        String result = instance.get(model, request, response);
        assertEquals("The hello view must be called", expResult, result);
    }
}
