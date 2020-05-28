package poly;

public class app {
	
	public static void main(String [] args) {
		
	Plant plant1 = new Plant();
	Tree tree = new Tree();
    
	// polymorphism , refering plan2 variable to tree subclass
	 Plant plant2= tree;
	 
	 plant2.grow ();
	 
	 tree.shedLeaves();
	 
	 doGrow(tree);
	 
	 
	}
	
	public static void doGrow(Plant plant) {
		
		plant.grow();
	}
	 

}
	