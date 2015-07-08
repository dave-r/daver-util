package org.daver.util.test;

import java.util.Collection;
import java.util.Map;

/**
 * Created by dave on 7/7/15.
 */
public class Assert {
    public static void assertEmpty(Collection<?> actual) {
        org.junit.Assert.assertNotNull(actual);
        org.junit.Assert.assertEquals(0, actual.size());
    }

    public static void assertEmpty(Map<?, ?> actual) {
        org.junit.Assert.assertNotNull(actual);
        org.junit.Assert.assertEquals(0, actual.size());
    }

    public static void assertNotEmpty(Collection<?> actual) {
        org.junit.Assert.assertNotNull(actual);
        org.junit.Assert.assertFalse(actual.isEmpty());
    }

    public static void assertNotEmpty(Map<?, ?> actual) {
        org.junit.Assert.assertNotNull(actual);
        org.junit.Assert.assertFalse(actual.isEmpty());
    }

    public static void assertSize(int expected, Collection<?> actual) {
        org.junit.Assert.assertNotNull(actual);
        org.junit.Assert.assertEquals(expected, actual.size());
    }

    public static void assertSize(int expected, Map<?, ?> actual) {
        org.junit.Assert.assertNotNull(actual);
        org.junit.Assert.assertEquals(expected, actual.size());
    }

    public static void assertContains(Object expected, Collection<?> actual) {
        org.junit.Assert.assertNotNull(actual);
        org.junit.Assert.assertTrue(actual.contains(expected));
    }

    public static void assertContainsKey(Object expected, Map<?, ?> actual) {
        org.junit.Assert.assertNotNull(actual);
        org.junit.Assert.assertTrue(actual.containsKey(expected));
    }

    public static void assertContainsValue(Object expected, Map<?, ?> actual) {
        org.junit.Assert.assertNotNull(actual);
        org.junit.Assert.assertTrue(actual.containsValue(expected));
    }

    public static void assertDoesNotContain(Object expected, Collection<?> actual) {
        org.junit.Assert.assertNotNull(actual);
        org.junit.Assert.assertFalse(actual.contains(expected));
    }

    public static void assertDoesNotContainKey(Object expected, Map<?, ?> actual) {
        org.junit.Assert.assertNotNull(actual);
        org.junit.Assert.assertFalse(actual.containsKey(expected));
    }

    public static void assertDoesNotContainValue(Object expected, Map<?, ?> actual) {
        org.junit.Assert.assertNotNull(actual);
        org.junit.Assert.assertFalse(actual.containsValue(expected));
    }

    public static void assertLength(int expected, CharSequence actual) {
        org.junit.Assert.assertNotNull(actual);
        org.junit.Assert.assertEquals(expected, actual.length());
    }

    public static void assertEmpty(CharSequence actual) {
        org.junit.Assert.assertNotNull(actual);
        org.junit.Assert.assertEquals(0, actual.length());
    }
}
