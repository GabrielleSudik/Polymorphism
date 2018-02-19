//you created this class and its "childness"
//by creating a class the usual way
//and "browsing" for the superclass Plant
//it's just a way eclipse does some work for you

public class Tree extends Plant {

	@Override
	public void grow() {
		System.out.println("The tree is growing.");
	}

	public void shedLeaves() {
		System.out.println("Leaves are falling.");
	}
}
