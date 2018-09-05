package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexandra Yazopova (mailto:aleaxndra.yaz@gmail.com)
 * @version 1
 * @since 04.09.2018
 */
public class ArrayDuplicateTest {

    /**
     * Test to check the duplicate string in the array.
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = {"Привет", "Мир", "Привет", "Супер", "Мир", "Мир", "Супер"};
        String[] result = duplicate.remove(input);
        String[] expect = {"Привет", "Супер", "Мир"};
        assertThat(result, arrayContainingInAnyOrder(expect));
    }
}
