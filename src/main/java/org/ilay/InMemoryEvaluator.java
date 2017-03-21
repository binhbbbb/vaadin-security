package org.ilay;

import com.vaadin.server.SerializablePredicate;

/**
 * An InMemoryEvaluator is a special type of evaluators that can be used in cases where no {@link
 * com.vaadin.data.provider.DataProvider} except {@link com.vaadin.data.provider.ListDataProvider}
 * is filtered by the evaluator.
 *
 * @author Bernd Hopp
 */
@SuppressWarnings("unused")
public interface InMemoryEvaluator<T> extends Evaluator<T, SerializablePredicate<T>> {

    @Override
    default SerializablePredicate<T> asFilter() {
        return this::evaluate;
    }
}
