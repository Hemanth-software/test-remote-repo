package com.adapt;

public class school {

	public static void main(String[] args) {

		penAdapter penadapter = new penAdapter();
		
		AssignmentWork assignmentWork = new AssignmentWork();
		assignmentWork.setPen(penadapter);
		assignmentWork.writeAssignment("I am too lazy to write an assignment");
		
		
		
	}

}
