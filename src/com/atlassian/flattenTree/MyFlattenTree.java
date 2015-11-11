package com.atlassian.flattenTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyFlattenTree<T> implements FlattenTree<T> {

	public List<T> flattenInOrder(Tree<T> tree) {
			
		Either<T, Triple<Tree<T>>> e = tree.get();
	    if (e.isLeft()) {
	        return Collections.singletonList(e.ifLeft(this.ifLeftImpl));
	    }
	    return e.ifRight(this.ifRightImpl);
	}
	
	Function<Triple<Tree<T>>, List<T>> ifRightImpl = new Function<Triple<Tree<T>>, List<T>>() {

	    @Override
	    public List<T> apply(final Triple<Tree<T>> t) {
	        List<T> output = new ArrayList<>();
	        output.addAll(MyFlattenTree.this.flattenInOrder(t.left()));
	        output.addAll(MyFlattenTree.this.flattenInOrder(t.middle()));
	        output.addAll(MyFlattenTree.this.flattenInOrder(t.right()));
	        return output;
	    }
	};
	
	Function<T, T> ifLeftImpl = new Function<T, T>() {

	    @Override
	    public T apply(final T t) {
	        return t;
	    }
	};
}