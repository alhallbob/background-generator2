
package Lab1;

import java.awt.Graphics;
import javax.swing.JApplet;

/**<pre>
 * File         Welcome.java
 * Description  Creates a java applet that displays "Welcome to Java 
 *              Programming!"
 * 
 * Platform             NetBeans IDE 8.2, jdk 1.8.0_191, Windows 10
 * Course               CS 141A, Winter 2019
 * Date                 1/07/2019
 * History log
 * Time of completion   2 minutes
 * @see                 java.awt.Graphics
 * @see                 javax.swing.JApplet
 * @author              <i>Ashley Hall</i>
 * </pre>
 */
public class Welcome extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~---
     *<pre>*      
     * Method           paint()     
     * Description      Draws the string "Welcome to Java Programming!" on the 
     *                  applet.
     * @param           arg is a Graphics object
     * @author          <i>Ashley Hall</i>      
     * Date             1/07/2019  
     * History Log
     *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void paint( Graphics g){
        g.drawString("Welcome to Java Programming!", 25,25);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
