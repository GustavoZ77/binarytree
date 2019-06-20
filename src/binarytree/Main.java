package binarytree;

public class Main {

	public static void main(String args[]) {
		
		Integer[] collection = {32, 63, 89, 444, 42, 21, 51, 51, 51, 51, 61, 93, 54 };
		
		TreeNode treeNode = new TreeNode(collection);
		
		TreeNode myNode = treeNode.search(51);
		myNode.originalIndex.stream().forEach(System.out::println);
		System.out.println(myNode.value);
	}
	
}
