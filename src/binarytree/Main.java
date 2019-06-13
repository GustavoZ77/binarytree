package binarytree;

public class Main {

	public static void main(String args[]) {
		Integer[] collection = {32, 63, 89, 444, 42, 21, 51, 61, 93, 54 };
		TreeNode treeNode = new TreeNode(collection);
		treeNode.search(51).stream().forEach(i -> System.out.print(Integer.valueOf(i)));
	}
	
}
