
// This is a change
//Sample code from example files from quiz 
package Bicycle1;

// Factory Method

class Bicycle {
	Bicycle() {
		System.out.println("Bicycle: create generic bicycle");
	}
}

class MountainBicycle  extends Bicycle {
	MountainBicycle() {
		System.out.println("MountainBicycle: create mountain bike");
	}
}