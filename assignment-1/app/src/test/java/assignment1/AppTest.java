/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package assignment1;

import org.junit.jupiter.api.Test;

import assignment1.App;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}