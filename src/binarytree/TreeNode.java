package binarytree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

	public TreeNode right;
	public TreeNode left;
	public int value = -1;
	public List<Integer> originalIndex = new ArrayList<>();

	public TreeNode() {
	}
	
	
	public TreeNode(Integer value, int originalIndex) {
		this.originalIndex.add(originalIndex);
		this.value = value;
	}

	public TreeNode(Integer collection[]) {
		int count = 0;
		for(Integer val : collection) {
			this.add(val,count);
			count++;
		}
	}

	public void add(Integer value,int originalIndex) {
		if(value == this.value) {
			this.originalIndex.add(originalIndex);
		}
		if (value < this.value) {
			if (left != null) {
				left.add(value, originalIndex);
			} else {
				left = new TreeNode(value,originalIndex);
			}
		} else {
			if (right != null) {
				right.add(value,originalIndex);
			} else {
				right = new TreeNode(value,originalIndex);
			}
		}
	}
	
	public TreeNode search(Integer value){
		if(this.value == value) {
			return this;
		}else if (value < this.value) {
	        if (this.left != null) {
	            return this.left.search(value);
	        } 
	    } else {
	        if (this.right != null) {
	            return this.right.search(value);
	        } 
	    }
		return new TreeNode();
	} 	
}
