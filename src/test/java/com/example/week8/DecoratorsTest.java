package com.example.week8;

import com.example.week8.decorators.ItemDecorator;
import com.example.week8.decorators.KibbenDecorator;
import com.example.week8.decorators.PaperDecorator;
import com.example.week8.decorators.BasketDecorator;
import com.example.week8.flowers.Flower;
import com.example.week8.flowers.FlowerType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorsTest {

    @Test
    public void testFlowerDescriptionForTulip() {
        Flower tulip = new Flower();
        String expectedDescription = "Tulip\n-----------\nSepalLength: 12.5 cm\nColor: YELLOW\nPrice: 1.99\n-----------";
        assertEquals(expectedDescription, tulip.getDescription());
    }

    @Test
    public void testFlowerDescriptionForChamomile() {
        Flower chamomile = new Flower(FlowerType.CHAMOMILE);
        String expectedDescription = "Chamomile\n-----------\nSepalLength: 9.5 cm\nColor: WHITE\nPrice: 2.79\n-----------";
        assertEquals(expectedDescription, chamomile.getDescription());
    }

    @Test
    public void testFlowerDescriptionForRose() {
        Flower rose = new Flower(FlowerType.ROSE);
        String expectedDescription = "Rose\n-----------\nSepalLength: 13.1 cm\nColor: RED\nPrice: 4.99\n-----------";
        assertEquals(expectedDescription, rose.getDescription());
    }

    @Test
    public void testBasketDecorator() {
        ItemDecorator basketDecorator = new BasketDecorator();
        assertEquals("This is basket decorator for flowers", basketDecorator.getDescription());
    }

    @Test
    public void testKibbenDecorator() {
        ItemDecorator kibbenDecorator = new KibbenDecorator();
        assertEquals("This is kibben decorator for flowers", kibbenDecorator.getDescription());
    }

    @Test
    public void testPaperDecorator() {
        ItemDecorator paperDecorator = new PaperDecorator();
        assertEquals("This is paper decorator for flowers", paperDecorator.getDescription());
    }
}
