package org.ilay;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

final class CollectionUtil {

    private CollectionUtil() {
    }

    static <T> Set<T> toNonEmptySet(T[] array) {
        Check.arraySanity(array);
        Set<T> set = new HashSet<>(array.length);
        Collections.addAll(set, array);
        return set;
    }

    static <T> Set<T> toNonEmptyCOWSet(T[] array) {
        Check.arraySanity(array);
        List<T> tList = Arrays.asList(array);
        return new CopyOnWriteArraySet<>(tList);
    }
}
