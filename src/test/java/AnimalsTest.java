import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalsTest extends Animals {
   Dog dog = new Dog();
   Cat cat = new Cat();

    @Test
    void TestDogSounds() {
        assertEquals("Barks",dog.sounds());
    }
    @Test
    void TestDogEat() {
        assertEquals("Food",dog.eats());
    }

    @Test
    void TestCatSounds() {
        assertEquals("Meow",cat.sounds());
    }
    @Test
    void TestCatEat() {
        assertEquals("Food",cat.eats());

    }

    @Test
    void TestCat() {
       assertTrue("Food".equalsIgnoreCase(cat.eats()));
       assertTrue("food".equalsIgnoreCase(cat.eats()));
       assertTrue("Meow".equalsIgnoreCase(cat.sounds()));
       assertTrue("meow".equalsIgnoreCase(cat.sounds()));
    }
    @Test
    void TestDog() {
        assertTrue("Food".equalsIgnoreCase(dog.eats()));
        assertTrue("food".equalsIgnoreCase(dog.eats()));
        assertTrue("BarkS".equalsIgnoreCase(dog.sounds()));
        assertTrue("baRks".equalsIgnoreCase(dog.sounds()));
    }


}