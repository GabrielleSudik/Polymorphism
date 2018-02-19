//polymorphism means that if you have child and parent classes,
//you can always use the child anywhere you'd use the parent.

public class Application {

	public static void main(String[] args) {

		Plant plant1 = new Plant();
		Tree tree1 = new Tree();
		
		//examples:
		Plant plant2 = plant1;
		//According to our teacher, plant1 is a reference to an instance of Plant, 
		//and plant2 is a reference to that reference.
		//so we have two references to the same object.
		
		Plant plant3 = tree1;
		//since polymorphism allows children to be used in place of parent
		//we can make the reference plant 3 refer to the reference tree1
		//(which refers to an instance of Tree)
		
		plant2.grow();
		plant3.grow();
		//even tho both plant2 and plant3 were declared with Plant,
		//2 refers to a Plant, but 3 refers to a Tree
		//so they run their respective methods!
		//or rather, both call the grow method in Plant,
		//but the one is overriden by the matching method in Tree.
		
		//here's something to watch out for:
		tree1.shedLeaves();
		//calls a method in Tree. easy.
		
		//but THIS will give an error. why?
		//because plant3 is actually trying to call a method in Plant
		//there is no shedLeaves in Plant, tho.
		//plant3.shedLeaves();
		
		//here's another example, using a method below
		//that accepts an instance of a class as the parameter
		//in the 1st and 3rd, it's accepting a Tree
		//in the second, it's accepting a Plant.
		doGrow(tree1);
		doGrow(plant2);
		doGrow(plant3);
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}

	//fyi, you don't remember learning about methods that accept objects as parameters in C#
	//maybe C# allows that, but it's a new concept to me.
}
