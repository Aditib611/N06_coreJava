
//Program to demonstrate generic interface
package org.tnsif.generics;

//Generic Interface
public interface MinMax<T extends Comparable<T>> {

	T getMinimum();

	T getMaximum();
}
