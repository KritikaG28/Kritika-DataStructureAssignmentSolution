package com.gl.datastructure.question1;

import java.util.*;

/*The skyscraper needs to be constructed in N days with the following conditions :
a) Every day a floor is constructed in a separate factory of distinct size.
b) The floor with the larger size must be placed at the bottom of the building.
c) The floor with the smaller size must be placed at the top of the building.
*/
class ConstructionAnalysis {

	//driver method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building");
		int totalFloors = sc.nextInt();
		int currentAvailableFloor = totalFloors;
		StringBuilder result = new StringBuilder();
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

		for (int i = 0; i < totalFloors; i++) {
			System.out.println("Enter the floor size on day " + (i + 1));
			result.append("Day : " + (i + 1) + "\n");
			int floorSize = sc.nextInt();
			//adding per day floor size in priority queue
			priorityQueue.add(floorSize * -1);

			while (!priorityQueue.isEmpty()) {
				//check if top peek is equal to current available floor
				if ((priorityQueue.peek() * -1) != currentAvailableFloor)
					break;

				currentAvailableFloor -= 1;
				//adding the priority queue element in the result
				result.append(priorityQueue.poll() * -1 + " ");

			}
			result.append("\n");

		}

		System.out.println("The order of construction is as follows");
		System.out.println(result);

	}

}
