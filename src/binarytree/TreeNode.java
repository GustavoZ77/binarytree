package binarytree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

	public TreeNode right;
	public TreeNode left;
	public int value;
	public int index;
	private List<Integer> indexListFound = new ArrayList<>();

	public TreeNode(Integer value, Integer index) {
		this.value = value;
		this.index = index;
	}

	public TreeNode(Integer collection[]) {
		int index = 0;
		for(Integer val : collection) {
			index++;
			this.add(val, index);
		}
	}

	public void add(Integer value, Integer index) {
		if (value < this.value) {
			if (left != null) {
				left.add(value, index);
			} else {
				left = new TreeNode(value, index);
			}
		} else {
			if (right != null) {
				right.add(value, index);
			} else {
				right = new TreeNode(value, index);
			}
		}
	}
	
	public List<Integer> search(Integer value){
		if(this.value == value) {
			this.indexListFound.add(this.index);
		}else if (value < this.value) {
	        if (this.left != null) {
	            return this.left.search(value);
	        } 
	    } else {
	        if (this.right != null) {
	            return this.right.search(value);
	        } 
	    }
	return this.indexListFound;	
	} 	
}
